package Classes.Flight;

import java.util.Date;

import Classes.Airline.Airline;
import Classes.City.City;
import Classes.Plane.Plane;
import Classes.Price.PriceAfterTax;

public abstract class Flight {
	String flightCode;
	City startCity;
	City endCity;
	Date flightDay;
	Date startTime;
	Date arriveTime;
	Airline airline;
	Plane plane;
	double originalPrice;
	PriceAfterTax priceAfterTax;
	public Flight(String flightCode, City startCity, City endCity, Date flightDay, Date startTime,
			Date arriveTime, Airline airline, Plane plane, double originalPrice) {
		super();
		this.flightCode = flightCode;
		this.startCity = startCity;
		this.endCity = endCity;
		this.flightDay = flightDay;
		this.startTime = startTime;
		this.arriveTime = arriveTime;
		this.airline = airline;
		this.plane = plane;
		this.originalPrice = originalPrice;
		this.priceAfterTax = priceAfterTax;
	}
//	public Flight() {
//		
//	}
	public String getFlightCode() {
		return flightCode;
	}
	public City getStartCity() {
		return startCity;
	}
	public City getEndCity() {
		return endCity;
	}
	public Date getFlightDay() {
		return flightDay;
	}
	public Date getStartTime() {
		return startTime;
	}
	public Date getArriveTime() {
		return arriveTime;
	}
	public Airline getAirline() {
		return airline;
	}
	public Plane getPlane() {
		return plane;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public PriceAfterTax getPriceAfterTax() {
		return priceAfterTax;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public void setStartCity(City startCity) {
		this.startCity = startCity;
	}
	public void setEndCity(City endCity) {
		this.endCity = endCity;
	}
	public void setFlightDay(Date flightDay) {
		this.flightDay = flightDay;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public void setPriceAfterTax(PriceAfterTax priceAfterTax) {
		this.priceAfterTax = priceAfterTax;
	}
	public abstract double price();
	
}
