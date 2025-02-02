/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.Business.ConfigureABusiness;
import model.CustomerManagement.CustomerProfile;

/**
 *
 * @author HARSH
 */
public class ManageCustomersPanel extends javax.swing.JPanel {

    private Business business;
    private JPanel userProcessContainer;
     ConfigureABusiness configureABusiness;
    /**
     * Creates new form ManageCustomersPanel
     */
    public ManageCustomersPanel(JPanel userProcessContainer,Business business) {
        this.userProcessContainer = userProcessContainer;
        this.business= business;
        
        if (this.business == null) {
        System.out.println("Business instance is null! in MCP");
    } else {
        System.out.println("Business instance passed successfully. MCP");
    }
        

        
        initComponents();
        populateCustomerOrderHistoryTable();
    }
    
    
    
    
    private void populateCustomerOrderHistoryTable() {
    // Ensure the business and its customer directory are not null
 
if (business.getCustomerDirectory() == null || business.getCustomerDirectory().getCustomerlist().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No customers found!", "Information", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    ArrayList<CustomerProfile> customers = business.getCustomerDirectory().getCustomerlist();
    DefaultTableModel model = (DefaultTableModel) tblCustomerOrders.getModel();
    model.setRowCount(0); // Clear the table before populating

    // Update customer orders dynamically and populate the table
    for (CustomerProfile customer : customers) {
        // Ensure the Ordersize is dynamically updated
        customer.setOrdersize(customer.getOrdersize()); // Assuming getOrders() returns the list of orders for this customer
        
        Object[] row = new Object[2];
        row[0] = customer.getPerson().getPersonId(); // Display Customer ID
        row[1] = customer.getOrdersize(); // Display total orders placed
        model.addRow(row);
    }
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerOrders = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Customer Order History");

        tblCustomerOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Customer Name", "Total number of Orders Placed"
            }
        ));
        jScrollPane1.setViewportView(tblCustomerOrders);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 209, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomerOrders;
    // End of variables declaration//GEN-END:variables
}
