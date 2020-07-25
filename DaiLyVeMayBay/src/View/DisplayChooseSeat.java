package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.EventObject;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;

import Classes.Plane.Boeing777;
import Classes.Plane.Plane;
import Classes.Seat.BusinessClassSeat;
import Classes.Seat.RowSeat;
import Classes.Seat.Seat;

public class DisplayChooseSeat extends JFrame{
	Plane plane;

	public DisplayChooseSeat(Plane plane) {
		super();
		this.plane = plane;
		
		
		String[] col = {"TEN", "Previously Selected Seat", "Present Seat"};
		String name = "Long";
		String previouslySelectedSeat = "A20";
		String presentSeat = "A15";
		String[][] data = {{name, previouslySelectedSeat, presentSeat}};
		JTable jTable = new JTable(data,col) {
			@Override
			public boolean editCellAt(int row, int column, EventObject e) {
				return false;
			}
		};
		jTable.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		jTable.setRowHeight(0, 30);
		JScrollPane jpane = new JScrollPane(jTable);
		jpane.setPreferredSize(new Dimension(MAXIMIZED_HORIZ, 80));
		add(jpane,BorderLayout.NORTH);
		
		
		
		
		
		JPanel chooseSeat = new JPanel();
		chooseSeat.setLayout(new BoxLayout(chooseSeat, BoxLayout.Y_AXIS));
		add(chooseSeat, BorderLayout.CENTER);
		for (RowSeat rowSeat : plane.getRowsSeat()) {
			JPanel jPanel = new JPanel();
			JLabel jLabel = new JLabel(rowSeat.getRowSeat());
			jPanel.add(jLabel);
			for (Seat seat : rowSeat.getSeats()) {
				JButton button = new JButton();
				button.setText(rowSeat.getRowSeat() + seat.getSeatNumber());
				button.setPreferredSize(new Dimension(60,50));
				if (seat instanceof BusinessClassSeat) {
					button.setBackground(Color.red);
				}
				jPanel.add(button);
				chooseSeat.add(jPanel);
			}
		}
		
		
		
		
		JPanel south = new JPanel();
		JButton ok = new JButton("OK");
		ok.setPreferredSize(new Dimension(70,50));
		south.add(ok);
		JPanel note = new JPanel();
		
		
		
		add(south,BorderLayout.SOUTH);
		setTitle("Choose Seat");
		setSize(1500,600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Boeing777 boeing777 = new Boeing777();
		DisplayChooseSeat chooseSeat = new DisplayChooseSeat(boeing777);
	}
}
