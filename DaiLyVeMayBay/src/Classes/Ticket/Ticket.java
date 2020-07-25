package Classes.Ticket;

import Classes.Customer.Customer;
import Classes.Flight.Flight;
import Classes.Seat.Seat;

public abstract class Ticket {
	Customer customer;
	Flight flight;
	Seat seat;
	public Ticket(Customer customer, Flight flight, Seat seat) {
		super();
		this.customer = customer;
		this.flight = flight;
		this.seat = seat;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Flight getFlight() {
		return flight;
	}
	public Seat getSeat() {
		return seat;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	
}
