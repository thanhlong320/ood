package Classes.Seat;

import java.util.ArrayList;
import java.util.List;

public class RowSeat {
	String rowSeat;
	List<Seat> seats = new ArrayList<Seat>();
	public RowSeat(String rowSeat) {
		super();
		this.rowSeat = rowSeat;
	}
	public void addSeat(Seat seat) {
		seats.add(seat);
	}
	public String getRowSeat() {
		return rowSeat;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setRowSeat(String rowSeat) {
		this.rowSeat = rowSeat;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	
}
