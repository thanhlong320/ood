package Classes.Airline;

import java.util.ArrayList;
import java.util.List;

import Classes.Flight.Flight;

public abstract class Airline {
	List<Flight> flights = new ArrayList<Flight>();
	String airlineCode;
	String name;
	public Airline(String airlineCode, String name) {
		super();
		this.flights = flights;
		this.name = name;
		this.airlineCode = airlineCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public String getAirlineCode() {
		return airlineCode;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public void addFlight(Flight flight) {
		this.flights.add(flight);
	}
	
}
