c# Quickstart Sample
======================

The c# quickstart example is a simple c# console application provided to illustrate the bare minimum amount of work to begin working
with our FlightAvailability and FlightBooking APIs to retrieve availability and book flights. It first uses the authentication service
to get a authentication token, then calls availability to get a list of available flights which are printed on the console, and finally 
the user can select by typing in the number of the option which will go out and create an actual booking. It uses dynamic types and 
'HttpClient' from .Net 4+ in order to get up and running quickly.

*Before running, modify the App.config file AppSettings for 'ApiBaseUri', 'ClientId', 'Username', and 'Password' to valid values. Additionally,
modify Request.json to set the correct values for 'ClientId' and 'BookingType'.* The flight availability request is generated from the file 
Request.json, which can be modified as needed to perform alternate requests.  There are many additional properites which may be set on the 
availability request, for a complete reference please consult the API documentation website.

