using System;
using System.Collections.Generic;
using System.Configuration;
using System.Dynamic;
using System.IO;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using Newtonsoft.Json;

namespace RightRez.Samples.quickstart
{
    /// <summary>
    /// This sample is a simple console application that interacts with the FlightAvailability and FlightBooking API 
    /// located at the address defined by 'ApiBaseUri' in the app.config file.
    /// 
    /// First it gets an authentication token using the 'Username' and 'Password' values set in the app.config, which
    /// is set in the header for all subsequent calls to the API. The username and password must be defined in the RightRez
    /// system.  
    /// 
    /// Next, we post a premade availability request which is defined in the file 'Request.json' in this solution.
    /// This file must be adjusted to set the correct values for 'ClientId' and 'BookingType' in order for the request to
    /// work.  If successful, this call returns a list of flights, which we just load into a dynamic type in order to
    /// get to the information we are interested in, the available options, which we then print out on the console as an
    /// ordered list displaying the flights and the price.  
    /// 
    /// Selecting one of these options will then book the flight by posting a request constructed from a dynamic type with 
    /// the flight we selected which was returned from the availability response and a hard coded passenger. 
    /// 
    /// THIS WILL CREATE AN ACTUAL PNR, so keep track of any test bookings you create so that they can be cancelled.
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            try
            {

                Console.WriteLine("Welcome to the RightRez web API c# quickstart sample.");

                var servicesUri = ConfigurationManager.AppSettings["ApiBaseUri"];
                var username = ConfigurationManager.AppSettings["Username"];
                var password = ConfigurationManager.AppSettings["Password"];
                var clientId = ConfigurationManager.AppSettings["ClientId"];

                // first we make an HttpClient and set it up to communicate with our API backend
                var client = new HttpClient();
                client.BaseAddress = new Uri(servicesUri);
                client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));

                // create data to post to authentication service in order to get bearer token
                var dict = new Dictionary<string, string>();
                dict.Add("grant_type", "password");
                dict.Add("username", username);
                dict.Add("password", password);

                Console.WriteLine("Authenticating...");

                // post url encoded form content to api/Token
                var response = client.PostAsync(string.Format("{0}/Token", servicesUri), new FormUrlEncodedContent(dict)).Result;
                if (response.IsSuccessStatusCode)
                {
                    /*
                     * {
                     *     "access_token":"msz6IOEyAJQgGAhZBC-E7WB-2hcF1bLjKbBmEKCVhoDY1SO7OwT...
                     *     "token_type":"bearer",
                     *     "expires_in":1209599,
                     *     "userName":"myUserName",
                     *     ".issued":"Tue, 04 Mar 2014 19:52:51 GMT",
                     *     ".expires":"Tue, 18 Mar 2014 19:52:51 GMT"
                     * }
                     */
                    var admToken = response.Content.ReadAsAsync<dynamic>().Result;
                    var headerValue = "Bearer " + admToken.access_token;

                    // add the authentication token to the default request headers so further requests to the API will be authenticated
                    client.DefaultRequestHeaders.Add("Authorization", headerValue);


                    Console.WriteLine("Issuing availability request from Request.json");
                    Console.WriteLine();
                    Console.WriteLine();

                    // read premade json availability request
                    var request = File.ReadAllText("Request.json");

                    // post json request to flight availability api
                    var availResultsMessage = client.PostAsync(string.Format("{0}/FlightAvailability", servicesUri), new StringContent(request, Encoding.UTF8, "application/json")).Result;

                    if (availResultsMessage.IsSuccessStatusCode)
                    {
                        /* availabilityResponse =
                         * {
                         *     "RequestId": "...",
                         *     "SupportId": "...",
                         *     "Locator": "...",
                         *     "ElapsedTime":"...",
                         *     "AvailableFlights":[...],
                         *     ...
                         *     see api documentation for complete response details
                         * }
                         */

                        var availResults = availResultsMessage.Content.ReadAsAsync<dynamic>().Result;

                        int i = 1;

                        // print some rudimentary details about each available option

                        // the available response has a list of available options (which we call flight tuples) that cover all trips on a request
                        foreach (var flight in availResults.AvailableFlights)
                        {
                            /* availableFlight =
                             * {
                             *     "UniqueID":"...",
                             *     "Flights":[...],
                             *     "PricingInfo":{...}
                             *     ...
                             *     "TotalPricingDisplayString":"...",
                             *     ...
                             *     see api documentation for complete flight tuple details
                             * }
                             */
                            Console.WriteLine(i++ + ")......................................." + flight.TotalPricingDisplayString);

                            // each flight is broken down into a 'Flights' collection, with 1 flight per trip of the request
                            foreach (var f in flight.Flights)
                            {
                                /* flight = 
                                 * {
                                 *     "UniqueId":"...",
                                 *     "Segments":[...],
                                 *     ...
                                 *     "FlightsDisplayString":"..."
                                 *     ...
                                 *     see api documentation for complete flight details
                                 * }
                                 */


                                // flights themselves are broken down into segments, but there are some shortcut display properties
                                // on these objects that allow us to skip that for the sake of making this example not be overly complicated
                                Console.WriteLine("\t" + f.FlightsDisplayString);
                            }
                        }


                        Console.Write("Select a flight for booking (ctrl-c to exit):");

                        var selection = Console.ReadLine();
                        int choice;
                        while (!Int32.TryParse(selection, out choice) || choice >= i || choice < 0)
                        {
                            Console.WriteLine();
                            Console.WriteLine("Not a valid number");
                        }

                        // create a booking request. at a minimum the booking request needs the original request id, the client id, 
                        // a list of passengers, and the selected available option that is returned from the availability request
                        // at the bare minimum, the passengers must have a first and last name defined, all other fields are optional

                        /* bookingRequest = 
                         * {
                         *     "RequestID":"...",
                         *     "ClientID":"...",
                         *     "Flight":{...},
                         *     "Passengers":[...]
                         *     ...
                         *     see api documentation for complete booking request details
                         * }
                         */
                        dynamic breq = new ExpandoObject();
                        breq.RequestID = availResults.RequestId;
                        breq.ClientID = clientId;
                        breq.Flight = availResults.AvailableFlights[choice - 1];
                        breq.Passengers = new[] { new { FirstName = "Steve", LastName = "Dave", } };

                        // post the booking request to the flight booking API
                        var bResultsMessage = client.PostAsync(string.Format("{0}/FlightBooking", servicesUri), new StringContent(JsonConvert.SerializeObject(breq), Encoding.UTF8, "application/json")).Result;
                        if (bResultsMessage.IsSuccessStatusCode)
                        {
                            /* bookingResponse =
                             * {
                             *     "RequestId":"...",
                             *     "ClientId":"...",
                             *     "Flight":{...},
                             *     "Passengers":[...]
                             *     ...
                             *     see api documentation for complete booking request details
                             * }
                             */
                            var bookingResult = bResultsMessage.Content.ReadAsAsync<dynamic>().Result;
                            Console.WriteLine("Booking successful PNR created: {0}", bookingResult.PNRLocator);
                        }
                    }
                    else
                    {
                        Console.WriteLine("Flight availability call failed: ", availResultsMessage.ReasonPhrase);
                    }

                    Console.WriteLine();
                }
                else
                {
                    Console.WriteLine("Authentication failed: ", response.ReasonPhrase);
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Exception: ", ex.Message);
            }
            finally 
            {
                Console.WriteLine("Press any key to exit.");
                Console.ReadKey();
            }
        }
    }
}
