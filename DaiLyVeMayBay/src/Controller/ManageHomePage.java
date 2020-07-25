package Controller;

import java.util.List;

import Classes.City.City;
import Classes.Flight.Flight;
import Model.CityModel;
import Model.FindFlightsModel;
import View.DisplayListOfFlights;
import View.HomePage;

public class ManageHomePage {
	HomePage homePage;
	FindFlightsModel findFlightsModel;
	DisplayListOfFlights displayListOfFlights;
	CityModel cityModel;
	String startCity;
	String endCity;
	public ManageHomePage(HomePage homePage) {
		super();
		this.cityModel = new CityModel();
		this.homePage = homePage;
		this.findFlightsModel = new FindFlightsModel();
	}
	
	
	public List<Flight> getFlights() {	
		setStartCity();
		setEndCity();
		return findFlightsModel.searchFlight();
	}
	
	
	public boolean haveInvalidFlight() {
		if (getFlights().size() > 0) {
			return true;
		}
		return false;
	}
	public void displayFlights() {
		if (haveInvalidFlight()) {
			displayListOfFlights = new DisplayListOfFlights(this);
			displayListOfFlights.initComponents();
		}
		else {
			homePage.setNotifyMessage("KHONG TIM THAY CHUYEN BAY");
		}
	}
	
	
	

	public String getStartCity() {
		return startCity;
	}

	public String getEndCity() {
		return endCity;
	}

	public void setStartCity() {
		this.startCity = homePage.getStartCity();
		findFlightsModel.setStartCity(startCity);
	}

	public void setEndCity() {
		this.endCity = homePage.getEndCity();
		findFlightsModel.setEndCity(endCity);
	}

	public HomePage getHomePage() {
		return homePage;
	}
	

	public List<City> getCities(){
		return cityModel.getCities();
	}
	
	
	public void setHomePage(HomePage homePage) {
		this.homePage = homePage;
	}

	
	
	
	
}
