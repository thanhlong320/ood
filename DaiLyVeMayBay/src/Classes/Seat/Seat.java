package Classes.Seat;

public abstract class Seat {
	int seatNumber;
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Seat(int seatNumber) {
		super();
		this.seatNumber = seatNumber;
	}
	
}
