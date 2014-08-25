package com.rightrez.java;

import com.rightrez.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JITPriceMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting availability search...");

		String baseURI = "http://centaurtest.rightrez.com";

		String endpoint = baseURI + "/WebServices/JustInTimeBookingService.asmx";

		JustInTimeBookingServiceSoapProxy  service = new JustInTimeBookingServiceSoapProxy();

		service.setEndpoint(endpoint);

		CreatePNRRequest req = new CreatePNRRequest();

		// Set global request fields
		req.setClientID("MAYFLOWER");
		req.setBookingNumber("123456");
		req.setBudgetedCost(new BigDecimal(100));		
		req.setFareType(new String[] { "AirSea" });

		// Set names
		RRZName[] names = new RRZName[2];

		names[0] = new RRZName();
		names[0].setFirstName("JOHN");
		names[0].setLastName("SMITH");
		names[0].setBookingNumber("123456");
		names[0].setBookedCost(new MoneyAmount());

		names[1] = new RRZName();
		names[1].setFirstName("JANE");
		names[1].setLastName("SMITH");
		names[1].setBookingNumber("123456");
		names[1].setBookedCost(new MoneyAmount());

		req.setPassengers(names);

		// Set trip components

		TripComponent outtrip = new TripComponent();

		outtrip.setTripType(TripDirectionType.OUTBOUND_TRIP);                
		outtrip.setDepartCity("BOS");
		outtrip.setArriveCity("CDG");

		GregorianCalendar ob_depart_date = (GregorianCalendar)GregorianCalendar.getInstance();
		ob_depart_date.set(Calendar.MONTH, Calendar.MARCH);
		ob_depart_date.set(Calendar.DAY_OF_MONTH, 15);
		ob_depart_date.set(Calendar.YEAR, 2010);

		outtrip.setDepartDate(ob_depart_date);
		outtrip.setServiceLevelChar("Y");
		outtrip.setCompany("MAYFLOWER");		
		outtrip.setNumoptions(7);	
		outtrip.setFareType(new String[] { "AirSea" });

		TripComponent rettrip = new TripComponent();

		rettrip.setTripType(TripDirectionType.RETURN_TRIP);                
		rettrip.setDepartCity("CDG");
		rettrip.setArriveCity("BOS");

		GregorianCalendar rt_depart_date = (GregorianCalendar)GregorianCalendar.getInstance();
		rt_depart_date.set(Calendar.MONTH, Calendar.MARCH);
		rt_depart_date.set(Calendar.DAY_OF_MONTH, 22);
		rt_depart_date.set(Calendar.YEAR, 2010);

		rettrip.setDepartDate(rt_depart_date);
		rettrip.setServiceLevelChar("Y");
		rettrip.setCompany("MAYFLOWER");		
		rettrip.setNumoptions(7);
		rettrip.setFareType(new String[] { "AirSea" });

		TripComponent[] trips = new TripComponent[2];
		trips[0] = outtrip;
		trips[1] = rettrip;

		req.setTripComponents(trips);

		try
		{
			// Send our request
			Status response = service.requestAvailablity(req);

			if (response.getError() == ValidationErrors.None)
			{
				System.out.println("Got request ID: " + response.getRequestID());
				
				try
				{
					// Open IE
					Runtime.getRuntime().exec("cmd /c start iexplore.exe " + baseURI + "/PNRBooking/WaitPageRT.aspx?guid=" + response.getRequestID());
				}
				catch (IOException ex)
				{
					System.out.println("Error: " + response.getErrormessage());
				}
			}
			else
			{
				System.out.println("Error: " + response.getErrormessage());
			}

		}
		catch (RemoteException ex)
		{
			System.out.println("RemoteException: " + ex.getMessage());
		}
	}

}
