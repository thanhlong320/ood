package Classes.Plane;

import Classes.Seat.BusinessClassSeat;
import Classes.Seat.EconomyClassSeat;
import Classes.Seat.RowSeat;
import Classes.Seat.Seat;

public class Boeing777 extends Plane{
	
	public Boeing777() {
		this.planeCode = "B777";
		this.name = "Boeing 777";
		BusinessClassSeat businessClassSeat_01 = new BusinessClassSeat(1);
		BusinessClassSeat businessClassSeat_02 = new BusinessClassSeat(2);
		EconomyClassSeat economyClassSeat_03 = new EconomyClassSeat(3);
		EconomyClassSeat economyClassSeat_04 = new EconomyClassSeat(4);
		EconomyClassSeat economyClassSeat_05 = new EconomyClassSeat(5);
		EconomyClassSeat economyClassSeat_06 = new EconomyClassSeat(6);
		EconomyClassSeat economyClassSeat_07 = new EconomyClassSeat(7);
		EconomyClassSeat economyClassSeat_08 = new EconomyClassSeat(8);
		EconomyClassSeat economyClassSeat_09 = new EconomyClassSeat(9);
		EconomyClassSeat economyClassSeat_10 = new EconomyClassSeat(10);
		EconomyClassSeat economyClassSeat_11 = new EconomyClassSeat(11);
		EconomyClassSeat economyClassSeat_12 = new EconomyClassSeat(12);
		EconomyClassSeat economyClassSeat_13 = new EconomyClassSeat(13);
		EconomyClassSeat economyClassSeat_14 = new EconomyClassSeat(14);
		EconomyClassSeat economyClassSeat_15 = new EconomyClassSeat(15);
		EconomyClassSeat economyClassSeat_16 = new EconomyClassSeat(16);
		EconomyClassSeat economyClassSeat_17 = new EconomyClassSeat(17);
		EconomyClassSeat economyClassSeat_18 = new EconomyClassSeat(18);
		EconomyClassSeat economyClassSeat_19 = new EconomyClassSeat(19);
		EconomyClassSeat economyClassSeat_20 = new EconomyClassSeat(20);
		EconomyClassSeat economyClassSeat_21 = new EconomyClassSeat(21);
		RowSeat rowSeatA =  new RowSeat("A");
		RowSeat rowSeatB =  new RowSeat("B");
		RowSeat rowSeatC =  new RowSeat("C");
		RowSeat rowSeatD =  new RowSeat("D");
		RowSeat rowSeatE =  new RowSeat("E");
		RowSeat rowSeatF =  new RowSeat("F");
		rowSeatA.addSeat(businessClassSeat_01);
		rowSeatA.addSeat(businessClassSeat_02);
		rowSeatA.addSeat(economyClassSeat_03);
		rowSeatA.addSeat(economyClassSeat_04);
		rowSeatA.addSeat(economyClassSeat_05);
		rowSeatA.addSeat(economyClassSeat_06);
		rowSeatA.addSeat(economyClassSeat_07);
		rowSeatA.addSeat(economyClassSeat_08);
		rowSeatA.addSeat(economyClassSeat_09);
		rowSeatA.addSeat(economyClassSeat_10);
		rowSeatA.addSeat(economyClassSeat_11);
		rowSeatA.addSeat(economyClassSeat_12);
		rowSeatA.addSeat(economyClassSeat_13);
		rowSeatA.addSeat(economyClassSeat_14);
		rowSeatA.addSeat(economyClassSeat_15);
		rowSeatA.addSeat(economyClassSeat_16);
		rowSeatA.addSeat(economyClassSeat_17);
		rowSeatA.addSeat(economyClassSeat_18);
		rowSeatA.addSeat(economyClassSeat_19);
		rowSeatA.addSeat(economyClassSeat_20);
		rowSeatA.addSeat(economyClassSeat_21);
		
		rowSeatB.addSeat(businessClassSeat_01);
		rowSeatB.addSeat(businessClassSeat_02);
		rowSeatB.addSeat(economyClassSeat_03);
		rowSeatB.addSeat(economyClassSeat_04);
		rowSeatB.addSeat(economyClassSeat_05);
		rowSeatB.addSeat(economyClassSeat_06);
		rowSeatB.addSeat(economyClassSeat_07);
		rowSeatB.addSeat(economyClassSeat_08);
		rowSeatB.addSeat(economyClassSeat_09);
		rowSeatB.addSeat(economyClassSeat_10);
		rowSeatB.addSeat(economyClassSeat_11);
		rowSeatB.addSeat(economyClassSeat_12);
		rowSeatB.addSeat(economyClassSeat_13);
		rowSeatB.addSeat(economyClassSeat_14);
		rowSeatB.addSeat(economyClassSeat_15);
		rowSeatB.addSeat(economyClassSeat_16);
		rowSeatB.addSeat(economyClassSeat_17);
		rowSeatB.addSeat(economyClassSeat_18);
		rowSeatB.addSeat(economyClassSeat_19);
		rowSeatB.addSeat(economyClassSeat_20);
		rowSeatB.addSeat(economyClassSeat_21);
		
		rowSeatC.addSeat(businessClassSeat_01);
		rowSeatC.addSeat(businessClassSeat_02);
		rowSeatC.addSeat(economyClassSeat_03);
		rowSeatC.addSeat(economyClassSeat_04);
		rowSeatC.addSeat(economyClassSeat_05);
		rowSeatC.addSeat(economyClassSeat_06);
		rowSeatC.addSeat(economyClassSeat_07);
		rowSeatC.addSeat(economyClassSeat_08);
		rowSeatC.addSeat(economyClassSeat_09);
		rowSeatC.addSeat(economyClassSeat_10);
		rowSeatC.addSeat(economyClassSeat_11);
		rowSeatC.addSeat(economyClassSeat_12);
		rowSeatC.addSeat(economyClassSeat_13);
		rowSeatC.addSeat(economyClassSeat_14);
		rowSeatC.addSeat(economyClassSeat_15);
		rowSeatC.addSeat(economyClassSeat_16);
		rowSeatC.addSeat(economyClassSeat_17);
		rowSeatC.addSeat(economyClassSeat_18);
		rowSeatC.addSeat(economyClassSeat_19);
		rowSeatC.addSeat(economyClassSeat_20);
		rowSeatC.addSeat(economyClassSeat_21);
		
		rowSeatD.addSeat(businessClassSeat_01);
		rowSeatD.addSeat(businessClassSeat_02);
		rowSeatD.addSeat(economyClassSeat_03);
		rowSeatD.addSeat(economyClassSeat_04);
		rowSeatD.addSeat(economyClassSeat_05);
		rowSeatD.addSeat(economyClassSeat_06);
		rowSeatD.addSeat(economyClassSeat_07);
		rowSeatD.addSeat(economyClassSeat_08);
		rowSeatD.addSeat(economyClassSeat_09);
		rowSeatD.addSeat(economyClassSeat_10);
		rowSeatD.addSeat(economyClassSeat_11);
		rowSeatD.addSeat(economyClassSeat_12);
		rowSeatD.addSeat(economyClassSeat_13);
		rowSeatD.addSeat(economyClassSeat_14);
		rowSeatD.addSeat(economyClassSeat_15);
		rowSeatD.addSeat(economyClassSeat_16);
		rowSeatD.addSeat(economyClassSeat_17);
		rowSeatD.addSeat(economyClassSeat_18);
		rowSeatD.addSeat(economyClassSeat_19);
		rowSeatD.addSeat(economyClassSeat_20);
		rowSeatD.addSeat(economyClassSeat_21);
		
		rowSeatE.addSeat(businessClassSeat_01);
		rowSeatE.addSeat(businessClassSeat_02);
		rowSeatE.addSeat(economyClassSeat_03);
		rowSeatE.addSeat(economyClassSeat_04);
		rowSeatE.addSeat(economyClassSeat_05);
		rowSeatE.addSeat(economyClassSeat_06);
		rowSeatE.addSeat(economyClassSeat_07);
		rowSeatE.addSeat(economyClassSeat_08);
		rowSeatE.addSeat(economyClassSeat_09);
		rowSeatE.addSeat(economyClassSeat_10);
		rowSeatE.addSeat(economyClassSeat_11);
		rowSeatE.addSeat(economyClassSeat_12);
		rowSeatE.addSeat(economyClassSeat_13);
		rowSeatE.addSeat(economyClassSeat_14);
		rowSeatE.addSeat(economyClassSeat_15);
		rowSeatE.addSeat(economyClassSeat_16);
		rowSeatE.addSeat(economyClassSeat_17);
		rowSeatE.addSeat(economyClassSeat_18);
		rowSeatE.addSeat(economyClassSeat_19);
		rowSeatE.addSeat(economyClassSeat_20);
		rowSeatE.addSeat(economyClassSeat_21);
		
		rowSeatF.addSeat(businessClassSeat_01);
		rowSeatF.addSeat(businessClassSeat_02);
		rowSeatF.addSeat(economyClassSeat_03);
		rowSeatF.addSeat(economyClassSeat_04);
		rowSeatF.addSeat(economyClassSeat_05);
		rowSeatF.addSeat(economyClassSeat_06);
		rowSeatF.addSeat(economyClassSeat_07);
		rowSeatF.addSeat(economyClassSeat_08);
		rowSeatF.addSeat(economyClassSeat_09);
		rowSeatF.addSeat(economyClassSeat_10);
		rowSeatF.addSeat(economyClassSeat_11);
		rowSeatF.addSeat(economyClassSeat_12);
		rowSeatF.addSeat(economyClassSeat_13);
		rowSeatF.addSeat(economyClassSeat_14);
		rowSeatF.addSeat(economyClassSeat_15);
		rowSeatF.addSeat(economyClassSeat_16);
		rowSeatF.addSeat(economyClassSeat_17);
		rowSeatF.addSeat(economyClassSeat_18);
		rowSeatF.addSeat(economyClassSeat_19);
		rowSeatF.addSeat(economyClassSeat_20);
		rowSeatF.addSeat(economyClassSeat_21);
		
		
		this.rowsSeat = rowsSeat;
		addRowSeat(rowSeatA);
		addRowSeat(rowSeatB);
		addRowSeat(rowSeatC);
		addRowSeat(rowSeatD);
		addRowSeat(rowSeatE);
		addRowSeat(rowSeatF);
	}
	public void print() {
		for (RowSeat rowSeat : rowsSeat) {
			for (Seat seat : rowSeat.getSeats()) {
				System.out.print(rowSeat.getRowSeat() + seat.getSeatNumber() + "  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Boeing777 boeing777 = new Boeing777();
		boeing777.print();
	}
}
