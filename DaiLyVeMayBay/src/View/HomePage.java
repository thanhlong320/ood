/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.City.City;
import Controller.ManageHomePage;
import Model.CityModel;

/**
 *
 * @author Admin
 */
public class HomePage extends javax.swing.JFrame {
	ManageHomePage manageHomePage;
    /**
     * Creates new form HomePage
     */
    public HomePage() {
    	this.manageHomePage = new ManageHomePage(this);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTON_SEARCH_FLIGHT;
    private javax.swing.JLabel HEADER;
    private javax.swing.JLabel LABEL_END_CITIES;
    private javax.swing.JLabel LABEL_START_CITIES;
    private javax.swing.JComboBox LIST_END_CITIES;
    private javax.swing.JComboBox LIST_START_CITIES;
    private javax.swing.JLabel NOTIFY_MESSAGE;
    // End of variables declaration//GEN-END:variables
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HEADER = new javax.swing.JLabel();
        LABEL_END_CITIES = new javax.swing.JLabel();
        LABEL_START_CITIES = new javax.swing.JLabel();
        LIST_START_CITIES = new javax.swing.JComboBox();
        LIST_END_CITIES = new javax.swing.JComboBox();
        BUTTON_SEARCH_FLIGHT = new javax.swing.JButton();
        NOTIFY_MESSAGE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setVisible(true);
        setLocation(600, 200);
        
        HEADER.setFont(new java.awt.Font("Arial", 3, 30)); // NOI18N
        HEADER.setText("DAT VE MAY BAY");

        LABEL_END_CITIES.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LABEL_END_CITIES.setText("DIEM DEN");

        LABEL_START_CITIES.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LABEL_START_CITIES.setText("DIEM DI");

        LIST_START_CITIES.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        javax.swing.DefaultComboBoxModel startCities = new javax.swing.DefaultComboBoxModel();
        for (City city : manageHomePage.getCities()) {
        	startCities.addElement(city.getNameCity());
		}
		LIST_START_CITIES.setModel(startCities);
		LIST_START_CITIES.setSelectedIndex(1);

        LIST_END_CITIES.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        javax.swing.DefaultComboBoxModel endCities = new javax.swing.DefaultComboBoxModel();
        for (City city : manageHomePage.getCities()) {
        	endCities.addElement(city.getNameCity());
		}
		LIST_END_CITIES.setModel(endCities);
		LIST_END_CITIES.setSelectedIndex(4);

        BUTTON_SEARCH_FLIGHT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BUTTON_SEARCH_FLIGHT.setText("TIM CHUYEN BAY");
        BUTTON_SEARCH_FLIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_SEARCH_FLIGHTActionPerformed(evt);
            }
        });

        NOTIFY_MESSAGE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NOTIFY_MESSAGE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NOTIFY_MESSAGE.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LIST_START_CITIES, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170)))
                                .addGap(192, 192, 192))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LIST_END_CITIES, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(LABEL_START_CITIES, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LABEL_END_CITIES, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BUTTON_SEARCH_FLIGHT)
                        .addGap(237, 237, 237))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NOTIFY_MESSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LABEL_END_CITIES, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(LABEL_START_CITIES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIST_START_CITIES, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LIST_END_CITIES, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BUTTON_SEARCH_FLIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(NOTIFY_MESSAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 305, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_SEARCH_FLIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_SEARCH_FLIGHTActionPerformed
    	manageHomePage.displayFlights();
    }//GEN-LAST:event_BUTTON_SEARCH_FLIGHTActionPerformed
    
    public String getStartCity() {
    	return (String) LIST_START_CITIES.getSelectedItem();
    }
    public String getEndCity() {
    	return (String) LIST_END_CITIES.getSelectedItem();
    }
    public void setNotifyMessage(String notify) {
    	NOTIFY_MESSAGE.setText(notify);
    }
    
    public static void main(String[] args) {
		(new HomePage()).initComponents();
	}

    
}
