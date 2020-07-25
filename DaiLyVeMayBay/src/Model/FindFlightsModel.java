package Model;

import java.util.ArrayList;
import java.util.List;

import Classes.City.City;
import Data.Data;
import Classes.Flight.Flight;

public class FindFlightsModel {
	String startCity;
	String endCity;
	Data data;
	public FindFlightsModel() {
		super();
		this.startCity = startCity;
		this.endCity = endCity;
		this.data = new Data();
	}
	
	public List<Flight> searchFlight(){
		List<Flight> flights = new ArrayList<Flight>();
		for (Flight flight : this.data.getFlights()) {
			if (flight.getStartCity().getNameCity().equals(startCity) && flight.getEndCity().getNameCity().equals(endCity)) {
				flights.add(flight);
			}
		}
		return flights;
	}
	
	
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	public String getStartCity() {
		return startCity;
	}

	public String getEndCity() {
		return endCity;
	}



	
}
