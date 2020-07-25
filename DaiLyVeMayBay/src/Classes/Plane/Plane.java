package Classes.Plane;

import java.util.ArrayList;
import java.util.List;

import Classes.Seat.RowSeat;
import Classes.Seat.Seat;

public abstract class Plane {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String planeCode;
	String name;
	List<RowSeat> rowsSeat = new ArrayList<RowSeat>();
	public Plane() {}
	public String getPlaneCode() {
		return planeCode;
	}
	public List<RowSeat> getRowsSeat() {
		return rowsSeat;
	}
	public void setPlaneCode(String planeCode) {
		this.planeCode = planeCode;
	}
	public void setRowsSeat(List<RowSeat> rowsSeat) {
		this.rowsSeat = rowsSeat;
	}
	public void addRowSeat(RowSeat rowSeat) {
		this.rowsSeat.add(rowSeat);
	}
}
