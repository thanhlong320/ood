package Classes.Flight;

import java.util.Date;

import Classes.Airline.Airline;
import Classes.City.City;
import Classes.Plane.Plane;
import Classes.Price.PriceForDomesticFlights;

public class DomesticFlight extends Flight{
	
	public DomesticFlight(String flightCode, City startCity, City endCity, Date flightDay, Date startTime,
			Date arriveTime, Airline airline, Plane plane, double originalPrice) {
		super(flightCode, startCity, endCity, flightDay, startTime, arriveTime, airline, plane, originalPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		return this.priceAfterTax.priceAfterTax(originalPrice);
	}
	
}
