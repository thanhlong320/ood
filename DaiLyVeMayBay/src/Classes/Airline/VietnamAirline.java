package Classes.Airline;

public class VietnamAirline extends Airline implements AirlineWelcome{
	

	public VietnamAirline(String airlineCode, String name) {
		super(airlineCode, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String welcome() {
		return "Viet Nam Airline Welcome";
	}
	
}
