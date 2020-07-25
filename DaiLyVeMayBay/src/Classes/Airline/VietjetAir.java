package Classes.Airline;

public class VietjetAir extends Airline implements AirlineWelcome{



	public VietjetAir(String airlineCode, String name) {
		super(airlineCode, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String welcome() {
		return "VietjetAir Airline Welcome";
	}
	
}
