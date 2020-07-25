package Controller;

import Model.FindFlightsModel;
import Model.FlightInformationModel;
import View.FlightInfomation;

public class ManageFlightInfomation {
	String flightCode;
	FlightInformationModel flightInformationModel;
	FlightInfomation flightInfomation;
	public ManageFlightInfomation(String flightCode) {
		super();
		this.flightCode = flightCode;
		this.flightInformationModel = new FlightInformationModel(this);
		this.flightInfomation = new FlightInfomation();
	}
	
	public void display() {
		this.flightInformationModel.setContent();
		
	}	
	
	
	
	
	
	
	public String getFlightCode() {
		return flightCode;
	}
	public FlightInformationModel getFlightInformationModel() {
		return flightInformationModel;
	}
	public FlightInfomation getFlightInfomation() {
		return flightInfomation;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public void setFlightInformationModel(FlightInformationModel flightInformationModel) {
		this.flightInformationModel = flightInformationModel;
	}
	public void setFlightInfomation(FlightInfomation flightInfomation) {
		this.flightInfomation = flightInfomation;
	}

}
