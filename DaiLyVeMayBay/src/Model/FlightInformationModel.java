package Model;

import Classes.Flight.Flight;
import Controller.ManageFlightInfomation;
import Data.Data;

public class FlightInformationModel {
	ManageFlightInfomation manageFlightInfomation;
	Data data;
	String flightCode;

	public FlightInformationModel(ManageFlightInfomation manageFlightInfomation) {
		super();
		this.manageFlightInfomation = manageFlightInfomation;
		this.flightCode = manageFlightInfomation.getFlightCode();
		this.data = new Data();
	}

	public Flight getFlight() {
		for (Flight flight : data.getFlights()) {
			if (flight.getFlightCode().equals(this.flightCode)) {
				return flight;
			}
		}
		return null;
	}

	public void setContent() {
		Flight flight = getFlight();
		manageFlightInfomation.getFlightInfomation().initComponents();
		manageFlightInfomation.getFlightInfomation().AIRLINE.setText(flight.getAirline().getName());
		manageFlightInfomation.getFlightInfomation().AIRLINE_CODE.setText(flight.getFlightCode());
		manageFlightInfomation.getFlightInfomation().START_CITY.setText(flight.getStartCity().getNameCity());
		manageFlightInfomation.getFlightInfomation().END_CITY.setText(flight.getEndCity().getNameCity());
		manageFlightInfomation.getFlightInfomation().FLIGHTDAY.setText(flight.getFlightDay().getDay() + "/"
				+ flight.getFlightDay().getMonth() + "/" + flight.getFlightDay().getYear());
		manageFlightInfomation.getFlightInfomation().START_TIME
				.setText(flight.getStartTime().getHours() + ":" + flight.getStartTime().getMinutes());
		manageFlightInfomation.getFlightInfomation().ARRIVE_TIME
				.setText(flight.getArriveTime().getHours() + ":" + flight.getArriveTime().getMinutes());
		manageFlightInfomation.getFlightInfomation().PLANE.setText(flight.getPlane().getName());
		manageFlightInfomation.getFlightInfomation().ORIGINAL_PRICE.setText(flight.getOriginalPrice()+"");
		manageFlightInfomation.getFlightInfomation().PRICE_AFTER_TAX.setText(flight.getPriceAfterTax()+"");
	}
	
}
