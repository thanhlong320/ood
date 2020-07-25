/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.TabExpander;

import Controller.ManageFlightInfomation;
import Controller.ManageHomePage;
import Classes.Flight.Flight;
//import Model.DisplayListOfFlightsModel;

public class DisplayListOfFlights extends javax.swing.JFrame {
	ManageHomePage manageHomePage;

	private javax.swing.JLabel HEADER;
	public javax.swing.JLabel LABEL_END_CITY;
	private javax.swing.JLabel LABEL_FROM1;
	public javax.swing.JLabel LABEL_START_CITY;
	private javax.swing.JLabel LABEL_TO;
	public javax.swing.JTable TABLE_FLIGHTS;
	private javax.swing.JScrollPane jScrollPane1;
	Vector tableContent;
	Vector tableTitle;
	
	public DisplayListOfFlights(ManageHomePage manageHomePage) {
		this.manageHomePage = manageHomePage;
	}

	public void initComponents() {

		HEADER = new javax.swing.JLabel();
		LABEL_TO = new javax.swing.JLabel();
		LABEL_START_CITY = new javax.swing.JLabel();
		LABEL_FROM1 = new javax.swing.JLabel();
		LABEL_END_CITY = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		TABLE_FLIGHTS = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLocation(600, 200);
		setVisible(true);

		HEADER.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
		HEADER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		HEADER.setText("DANH SACH CHUYEN BAY");

		LABEL_TO.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		LABEL_TO.setText("DEN :");
		LABEL_TO.setMaximumSize(new java.awt.Dimension(150, 22));
		LABEL_TO.setMinimumSize(new java.awt.Dimension(150, 22));
		LABEL_TO.setPreferredSize(new java.awt.Dimension(150, 22));

		LABEL_START_CITY.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		LABEL_START_CITY.setText("TP HO CHI MINH");

		LABEL_FROM1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		LABEL_FROM1.setText("TU :");
		LABEL_FROM1.setMaximumSize(new java.awt.Dimension(150, 22));
		LABEL_FROM1.setMinimumSize(new java.awt.Dimension(150, 22));
		LABEL_FROM1.setPreferredSize(new java.awt.Dimension(150, 22));

		LABEL_END_CITY.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
		LABEL_END_CITY.setText("HA NOI");

		TABLE_FLIGHTS.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
		
		LABEL_START_CITY.setText(manageHomePage.getStartCity());
		LABEL_END_CITY.setText(manageHomePage.getEndCity());
		tableContent = new Vector();
		tableTitle = new Vector();
		tableTitle.add("Hang");
		tableTitle.add("MA CHUYEN BAY");
		tableTitle.add("NGAY DI");
		tableTitle.add("GIO BAY");
		tableTitle.add("GIA");
		for (Flight flight : manageHomePage.getFlights()) {
			Vector temp = new Vector();
			temp.add(flight.getAirline().getName());
			temp.add(flight.getFlightCode());
			temp.add(flight.getFlightDay().getDay() +"/"+ flight.getFlightDay().getMonth() +"/" + flight.getFlightDay().getYear());
			temp.add(flight.getStartTime().getHours() + ":" + flight.getStartTime().getMinutes() + " - "
					+ flight.getArriveTime().getHours() + ":" + flight.getArriveTime().getMinutes());
			temp.add(flight.getOriginalPrice());
			tableContent.add(temp);
		}
		
		TABLE_FLIGHTS.setModel(new javax.swing.table.DefaultTableModel(tableContent, tableTitle) {
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		TABLE_FLIGHTS.setToolTipText("");
		TABLE_FLIGHTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		TABLE_FLIGHTS.setGridColor(new java.awt.Color(204, 204, 204));
		TABLE_FLIGHTS.setRowHeight(30);
		TABLE_FLIGHTS.setSelectionBackground(new java.awt.Color(153, 255, 153));
		TABLE_FLIGHTS.setSelectionForeground(new java.awt.Color(0, 0, 0));
		jScrollPane1.setViewportView(TABLE_FLIGHTS);
		if (TABLE_FLIGHTS.getColumnModel().getColumnCount() > 0) {
			TABLE_FLIGHTS.getColumnModel().getColumn(0).setResizable(false);
			TABLE_FLIGHTS.getColumnModel().getColumn(0).setPreferredWidth(70);
			TABLE_FLIGHTS.getColumnModel().getColumn(1).setResizable(false);
			TABLE_FLIGHTS.getColumnModel().getColumn(1).setPreferredWidth(60);
			TABLE_FLIGHTS.getColumnModel().getColumn(2).setResizable(false);
			TABLE_FLIGHTS.getColumnModel().getColumn(2).setPreferredWidth(60);
			TABLE_FLIGHTS.getColumnModel().getColumn(3).setResizable(false);
			TABLE_FLIGHTS.getColumnModel().getColumn(3).setPreferredWidth(60);
			TABLE_FLIGHTS.getColumnModel().getColumn(4).setResizable(false);
			TABLE_FLIGHTS.getColumnModel().getColumn(4).setPreferredWidth(60);
		}

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(238, 238, 238).addComponent(HEADER,
								javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(45, 45, 45)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(LABEL_TO, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(LABEL_END_CITY,
														javax.swing.GroupLayout.PREFERRED_SIZE, 344,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addComponent(LABEL_FROM1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(LABEL_START_CITY)))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(0, 48, Short.MAX_VALUE).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(39, 39, 39)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(LABEL_FROM1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LABEL_START_CITY))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(LABEL_TO, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(LABEL_END_CITY))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 262, Short.MAX_VALUE)));

		pack();
		
		
		TABLE_FLIGHTS.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
		
	        public void valueChanged(ListSelectionEvent event) {
	        	String flightCode = (String) TABLE_FLIGHTS.getValueAt(TABLE_FLIGHTS.getSelectedRow(), 1);
	        	(new ManageFlightInfomation(flightCode)).display();
	        	
	        }
	    });
		
		
	}
	
	
	
	
}
