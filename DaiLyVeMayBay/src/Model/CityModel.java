package Model;

import java.util.ArrayList;
import java.util.List;

import Classes.City.City;
import Data.Data;

public class CityModel {
	List<City> cities = new ArrayList<City>();
	public CityModel() {
		this.cities = (new Data()).getCities();
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
