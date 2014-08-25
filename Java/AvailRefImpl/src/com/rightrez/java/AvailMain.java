package com.rightrez.java;

import java.util.*;
import java.text.*;
import com.rightrez.*;


public class AvailMain {


	public static void main(String[] args) 
	{
		roundTripAvailability();
	}

	public static void roundTripAvailability()
	{
		try 
		{
			String endpoint =
				"http://rightwebdev.rightrez.com/WebServices/RightRezService.asmx";

			RightRezServiceSoapProxy  service = new RightRezServiceSoapProxy();

			service.setEndpoint(endpoint);

			UUID logging_id = UUID.randomUUID(); 					

			AvailabilityRequest areq = new AvailabilityRequest();

			areq.setAllowFBCMismatch(true);
			areq.setOnlyCheapestCOS(true);
			areq.setNumPassengers(1);
			areq.setGetFareRules(false);
			areq.setClientID("CENTAUR");
			areq.setBookType("TOUR");			
			areq.setBudgetedCost(new MoneyAmount());            
			areq.setExistingAddCollect(new MoneyAmount());
			areq.setLoggingID(logging_id.toString());

			areq.setComponents(new AvailabilityRequestComponent[2]);

			// Set up the parameters for our outbound trip
			AvailabilityRequestComponent outboundc;
			outboundc = new AvailabilityRequestComponent();
			outboundc.setDepartCity("LAX");
			outboundc.setArriveCity("AMS");

			GregorianCalendar depart_date = (GregorianCalendar)GregorianCalendar.getInstance();
			depart_date.set(Calendar.MONTH, Calendar.MARCH);
			depart_date.set(Calendar.DAY_OF_MONTH, 15);
			depart_date.set(Calendar.YEAR, 2010);

			outboundc.setDepartDate(depart_date);
			outboundc.setNumoptions(10);

			ServiceLevel sl = new ServiceLevel();
			sl.setCharCode("Y");

			outboundc.setServiceLevel(sl);
			outboundc.setTripType(TripDirectionType.OUTBOUND_TRIP);
			outboundc.setFlightPrefs("FT|BP");
			outboundc.setComponentUniqueKey(1);
			outboundc.setUseAirSeaFares(true);

			// Set up the parameters for our return trip
			AvailabilityRequestComponent returnc;
			returnc = new AvailabilityRequestComponent();
			returnc.setDepartCity("AMS");
			returnc.setArriveCity("LAX");

			GregorianCalendar depart_date2 = (GregorianCalendar)GregorianCalendar.getInstance();
			depart_date2.set(Calendar.MONTH, Calendar.MARCH);
			depart_date2.set(Calendar.DAY_OF_MONTH, 25);
			depart_date2.set(Calendar.YEAR, 2010);

			returnc.setDepartDate(depart_date2);
			returnc.setNumoptions(10);

			ServiceLevel sl2 = new ServiceLevel();
			sl2.setCharCode("Y");

			returnc.setServiceLevel(sl2);
			returnc.setTripType(TripDirectionType.RETURN_TRIP);
			returnc.setFlightPrefs("FT|BP");
			returnc.setComponentUniqueKey(2);
			returnc.setUseAirSeaFares(true);

			// Put our components in the collection
			areq.getComponents()[0] = outboundc;
			areq.getComponents()[1] = returnc;

			// We set up a dependency to indicate that these two components are dependent
			// on one another and should be priced and ticketed together.
			AvailabilityRequestDependency depend = new AvailabilityRequestDependency();
			depend.setDependentComponents(new int[] { 1, 2 });  // component unique keys assigned above
			depend.setConsiderOneWayOptions(false);
			depend.setBookedTotalPrice(new MoneyAmount());
			areq.setDependencies(new AvailabilityRequestDependency[] { depend });

			// Send our request to the web service
			AvailabilityResponse res = service.getFlights(areq);
						
			// Print the response
			for (SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip kvp : res.getRoundTripOptions())
			{
				AvailabilityResponseRoundTrip resrt = kvp.getValue();
			
				for(FlightPairing fp : resrt.getFlightPairings())
				{
					System.out.println("====================================");

					if (fp.getPricingInfo() != null)
					{
						PricingInfo pi = fp.getPricingInfo();
						// Print the price
						printPricingInfo(pi);
					}

					// Print the outbound itinerary
					for (RRZAirSegment s : fp.getOutboundFlight().getSegments())
					{            			            			            	
						printSegment(s);
					}
					
					System.out.println("------------------------------------");
					
					// Print the return itinerary
					for (RRZAirSegment s : fp.getReturnFlight().getSegments())
					{            			            			            	
						printSegment(s);
					}
				}
			}
		}
		catch (Exception e) 
		{
			System.err.println(e.toString());
		}
	}


	public static void oneWayAvailability() 
	{
		try 
		{
			String endpoint =
				"http://rightwebdev.rightrez.com/WebServices/RightRezService.asmx";

			RightRezServiceSoapProxy  service = new RightRezServiceSoapProxy();

			service.setEndpoint(endpoint);

			UUID logging_id = UUID.randomUUID(); 					

			AvailabilityRequest areq = new AvailabilityRequest();

			areq.setAllowFBCMismatch(true);
			areq.setOnlyCheapestCOS(true);
			areq.setNumPassengers(1);
			areq.setGetFareRules(false);
			areq.setClientID("CENTAUR");
			areq.setBookType("AIRSEA");			
			areq.setBudgetedCost(new MoneyAmount());            
			areq.setExistingAddCollect(new MoneyAmount());
			areq.setLoggingID(logging_id.toString());

			areq.setComponents(new AvailabilityRequestComponent[1]);

			AvailabilityRequestComponent areqc;
			areqc = new AvailabilityRequestComponent();
			areqc.setDepartCity("AMS");
			areqc.setArriveCity("LAX");

			GregorianCalendar depart_date = (GregorianCalendar)GregorianCalendar.getInstance();
			depart_date.set(Calendar.MONTH, Calendar.MARCH);
			depart_date.set(Calendar.DAY_OF_MONTH, 15);
			depart_date.set(Calendar.YEAR, 2010);

			areqc.setDepartDate(depart_date);
			areqc.setNumoptions(10);

			ServiceLevel sl = new ServiceLevel();
			sl.setCharCode("Y");

			areqc.setServiceLevel(sl);
			areqc.setTripType(TripDirectionType.OUTBOUND_TRIP);
			areqc.setFlightPrefs("FT|BP");
			areqc.setComponentUniqueKey(1);
			areqc.setUseAirSeaFares(true);
			//areqc.setFareType(new String[] {"AirSea"});

			areq.getComponents()[0] = areqc;

			AvailabilityResponse res = service.getFlights(areq);

			for(AvailabilityResponseComponent c : res.getComponents())
			{
				System.out.println("Priced Flights:");
				for (FlightInfo fi : c.getFlights())
				{
					System.out.println("====================================");

					if (fi.getPricingInfo() != null)
					{
						PricingInfo pi = fi.getPricingInfo();
						// Print the price
						printPricingInfo(pi);
					}

					// Print the itinerary
					for (RRZAirSegment s : fi.getSegments())
					{            			            			            	
						printSegment(s);
					}
				}
			}

		} 
		catch (Exception e) 
		{
			System.err.println(e.toString());
		}

	}

	private static void printSegment(RRZAirSegment s) 
	{
		SimpleDateFormat dateFormatter = new SimpleDateFormat("ddMMM HHmm");

		System.out.printf("%s %s %s %s %s %s\n",
				s.getCarrier(), s.getFlightNumber(), s.getCOS(), s.getDepartCity(), 
				s.getArriveCity(), dateFormatter.format(s.getDepartTime().getTime()));
	}

	private static void printPricingInfo(PricingInfo pi) {
		System.out.printf("%s total = %s base fare + %s surcharges + %s taxes\n",
				formatMoneyAmount(pi.getTotalFare()),formatMoneyAmount(pi.getBaseFare()),
				formatFuelSurcharges(pi), formatTaxes(pi));
	}


	private static String formatTaxes(PricingInfo pi)
	{
		MoneyAmount total_taxes = new MoneyAmount();
		total_taxes.setCurrencyInfo(pi.getTotalFare().getCurrencyInfo());

		// Sum all the taxes (assuming taxes are all in the same currency here)
		for(TaxInfoForPricing t : pi.getTaxes())
		{
			total_taxes.setMinorUnits(total_taxes.getMinorUnits() + t.getTaxAmount().getMinorUnits());
		}

		return formatMoneyAmount(total_taxes);
	}

	private static String formatFuelSurcharges(PricingInfo pi)
	{
		MoneyAmount total_surcharges = new MoneyAmount();
		total_surcharges.setCurrencyInfo(pi.getTotalFare().getCurrencyInfo());

		// Sum the YQ and YR taxes and the Equiv Q field from the fare calc line (assuming same currency)
		total_surcharges.setMinorUnits(pi.getTaxYQ().getMinorUnits() + pi.getTaxYR().getMinorUnits() + 
				pi.getEquivCurrencyFareCalcFieldQ().getMinorUnits());

		return formatMoneyAmount(total_surcharges);
	}

	private static String formatMoneyAmount(MoneyAmount m)
	{
		int decimal_factor = (int) (Math.pow(10, m.getCurrencyInfo().getDecimalPlaces()));

		int major_units = m.getMinorUnits() / decimal_factor;
		int minor_units = m.getMinorUnits() % decimal_factor;

		// Note, proper formatting should use culture info from the currency info; we are 
		// assuming USD as a default currency here.
		if (minor_units >= 10)
		{
			return "$" + major_units + "." + minor_units;
		}
		else		
		{
			return "$" + major_units + ".0" + minor_units;
		}

	}

}
