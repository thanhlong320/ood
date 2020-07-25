package Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Classes.Airline.Airline;
import Classes.Airline.VietjetAir;
import Classes.Airline.VietnamAirline;
import Classes.City.City;
import Classes.Customer.DomesticCustomer;
import Classes.Flight.DomesticFlight;
import Classes.Flight.Flight;
import Classes.Plane.Boeing777;
import Classes.Plane.Plane;

public class Data {
	List<Airline> airlines = new ArrayList<Airline>();
	List<City> cities = new ArrayList<City>();
	List<Flight> flights = new ArrayList<Flight>();
	@SuppressWarnings("deprecation")
	public Data() {
			City danang = new City("Da Nang", "DN", "Viet Nam");
			City tphcm = new City("TP Ho Chi Minh", "HCM", "Viet Nam");
			City hanoi = new City("Ha Noi", "HN", "Viet Nam");
			City cantho = new City("Can Tho", "CT", "Viet Nam");
			City haiphong = new City("Hai Phong", "HP", "Viet Nam");
			City bangkok = new City("Bangkok", "BK", "Thai Lan");
			City shanghai = new City("Shang Hai", "SH", "Trung Quoc");
			City manila = new City("Manila", "MNL", "Philipin");
		cities.add(danang);
		cities.add(tphcm);
		cities.add(hanoi);
		cities.add(cantho);
		cities.add(haiphong);
		cities.add(bangkok);
		cities.add(shanghai);
		cities.add(manila);
	
			VietnamAirline vietnamAirline = new VietnamAirline("VNA", "Vietnam Airline");
			VietjetAir vietjet = new VietjetAir("VJ", "Vietjet Air");
			Plane boeing777 = new Boeing777();
		
			Flight VNA_118 = new DomesticFlight("VNA 118", tphcm, haiphong, new Date(2020, 07, 30),
				new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,800000);
			Flight VJ_77 = new DomesticFlight("VJ 118", tphcm, hanoi, new Date(2020, 07, 31),
					new Date(2020, 07, 31, 7, 30), new Date(2020, 07, 31, 9, 30), vietjet, boeing777,8800000);
			Flight VNA_119 = new DomesticFlight("VNA 119", hanoi, cantho, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 19, 30), new Date(2020, 07, 30, 21, 00), vietnamAirline, boeing777,500000);
			Flight VNA_28 = new DomesticFlight("VNA 28", danang, tphcm, new Date(2020, 8, 1),
					new Date(2020, 8, 1, 15, 00), new Date(2020, 8, 1, 16, 30), vietnamAirline, boeing777,600000);
			Flight VJ_81 = new DomesticFlight("VJ 81", cantho, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietjet, boeing777,500000);
			
			Flight VJ_08 = new DomesticFlight("VJ 08", cantho, hanoi, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietjet, boeing777,5500000);
			Flight VNA_218 = new DomesticFlight("VNA 218", cantho, tphcm, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,6600000);
			Flight VNA_318 = new DomesticFlight("VNA 318", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_418 = new DomesticFlight("VNA 418", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_518 = new DomesticFlight("VNA 518", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_618 = new DomesticFlight("VNA 618", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_718 = new DomesticFlight("VNA 718", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_818 = new DomesticFlight("VNA 818", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_918 = new DomesticFlight("VNA 918", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
			Flight VNA_88 = new DomesticFlight("VNA 88", tphcm, haiphong, new Date(2020, 07, 30),
					new Date(2020, 07, 30, 9, 30), new Date(2020, 07, 30, 11, 30), vietnamAirline, boeing777,1000000);
		
		flights.add(VNA_118);
		flights.add(VJ_77);
		flights.add(VJ_08);
		flights.add(VJ_81);
		flights.add(VNA_119);
		flights.add(VNA_218);
		flights.add(VNA_28);
		flights.add(VNA_318);
		flights.add(VNA_418);
		flights.add(VNA_518);
		flights.add(VNA_618);
		flights.add(VNA_718);
		flights.add(VNA_818);
		flights.add(VNA_918);
		
		
		
	}
	
	public List<Airline> getAirlines() {
		return airlines;
	}

	public List<City> getCities() {
		return cities;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public static void main(String[] args) {
		Data data = new Data();
		for (Flight flight : data.flights) {
			System.out.println(flight.getFlightCode());
			System.out.println(flight.getStartTime().getHours());
		}
	}
}
