c# Quickstart Sample
======================

The c# quickstart example is a simple c# console application provided to illustrate the bare minimum amount of work to begin working
with our FlightAvailability and FlightBooking APIs to retrieve availability and book flights. It uses dynamic types from .Net 4 and the 

The flight availability request is generated from the file Request.json, which can be modified as needed to perform alternate requests.

Before running, modify the App.config file AppSettings for 'ApiBaseUri', 'ClientId', 'Username', and 'Password' to valid values. Additionally,
modify Request.json to set the correct values for 'ClientId' and 'BookingType'.