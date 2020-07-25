//package Model;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Vector;
//
//import Controller.ManageHomePage;
//import Classes.Flight.Flight;
//
//public class DisplayListOfFlightsModel {
//	ManageHomePage manageHomePage;
//	List<Flight> flights = new ArrayList<Flight>();
//	
//	public DisplayListOfFlightsModel(ManageHomePage manageHomePage) {
//		super();
//		this.flights = manageHomePage.getFlights();
//	}
//
//	public List<Flight> getFlights() {
//		return flights;
//	}
//
//	public void setFlights(List<Flight> flights) {
//		this.flights = flights;
//	}
//
//	public void setContent() {
////		manageHomePage.getDisplayListOfFlights().LABEL_START_CITY.setText(manageHomePage.getStartCity());
////		manageHomePage.getDisplayListOfFlights().LABEL_END_CITY.setText(manageHomePage.getEndCity());
//		manageHomePage.getDisplayListOfFlights().tableContent = new Vector();
//		for (Flight flight : manageHomePage.getFlights()) {
//			Vector temp = new Vector();
//			temp.add(flight.getAirline().getName());
//			temp.add(flight.getFlightCode());
//			temp.add(flight.getFlightDay().getDay() +"/"+ flight.getFlightDay().getMonth() +"/" + flight.getFlightDay().getYear());
//			temp.add(flight.getStartTime().getHours() + ":" + flight.getStartTime().getMinutes() + " - "
//					+ flight.getArriveTime().getHours() + ":" + flight.getArriveTime().getMinutes());
//			temp.add(flight.getOriginalPrice());
//			manageHomePage.getDisplayListOfFlights().tableContent.add(temp);
//		}
//	}	
//}
