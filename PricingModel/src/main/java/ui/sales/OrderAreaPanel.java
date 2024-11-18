/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sales;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Business.Business;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.OrderItem;
import model.OrderManagement.OrderSummary;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;

/**
 *
 * @author HARSH
 */
public class OrderAreaPanel extends javax.swing.JPanel {
   private JPanel userProcessContainer; // Add this
    private ProductCatalog productCatalog;
    private SupplierDirectory supplierDirectory;
    private CustomerProfile foundCustomer;
    Business business;
    

    /**
     * Creates new form ServeCustomerPanel
     */
    public OrderAreaPanel(JPanel userProcessContainer,ProductCatalog productCatalog, SupplierDirectory supplierDirectory, CustomerProfile foundCustomer) {
        this.userProcessContainer = userProcessContainer; // Initialize userProcessContainer
        // Assuming CustomerProfile has getProductCatalog()
        this.productCatalog= productCatalog;
        this.supplierDirectory = supplierDirectory;
        this.foundCustomer = foundCustomer;
        initComponents();
        populateSupplierComboBox();
        populateProductTable();
        setupTableClickListener();
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
        btnBack = new javax.swing.JButton();
        lblSupplier = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        cmbSupplier = new javax.swing.JComboBox<>();
        txtCustomer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderItem = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();
        txtFAT = new javax.swing.JTextField();
        txtFBT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSales = new javax.swing.JTextField();
        txtAMT = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtActualPrice = new javax.swing.JTextField();
        btnGenerateBI = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 0));
        setPreferredSize(new java.awt.Dimension(866, 605));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Area");

        btnBack.setText("Back");

        lblSupplier.setText("Supplier");

        jLabel3.setText("Customer");

        jLabel5.setText("Products");

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Floor", "Ceiling", "Target"
            }
        ));
        jScrollPane1.setViewportView(tblProduct);

        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });

        jLabel6.setText("order Item");

        tblOrderItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product", "Actual Price", "Quantity", "Item Total"
            }
        ));
        jScrollPane2.setViewportView(tblOrderItem);

        jLabel7.setText("Product name");

        jLabel8.setText("Frequency Above Target");

        jLabel9.setText("Frequency Below Target");

        txtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductActionPerformed(evt);
            }
        });

        jLabel10.setText("Sales ");

        jLabel11.setText("Margin Above Target");

        txtSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalesActionPerformed(evt);
            }
        });

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel12.setText("Qauntity");

        jLabel13.setText("Actual Price");

        btnGenerateBI.setText("Generate BI");
        btnGenerateBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addGap(193, 807, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerateBI)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplier)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmit)
                                    .addComponent(btnCancel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtFAT))
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtFBT)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAMT, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btnSelect)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnBack)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSupplier)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(135, 135, 135)
                        .addComponent(btnSelect)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerateBI)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductActionPerformed

    private void txtSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalesActionPerformed
        // TODO add your handling code here:
         DefaultTableModel orderTableModel = (DefaultTableModel) tblOrderItem.getModel();
    if (orderTableModel.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No items in the order to submit. Please add products.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Confirm order submission
    int confirmation = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to submit the order?",
        "Confirm Order Submission",
        JOptionPane.YES_NO_OPTION
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        // Logic for submitting the order (this could be saving to a database or processing the order)
        JOptionPane.showMessageDialog(
            this,
            "Order submitted successfully!",
            "Order Submission",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Clear the order table after submission
        orderTableModel.setRowCount(0);

        // Clear input fields
        txtQuantity.setText("");
        txtActualPrice.setText("");
        txtProduct.setText("");
        txtSuggestedAP.setText("");
        txtFAT.setText("");
        txtFBT.setText("");
        txtSales.setText("");
        txtAMT.setText("");
    }
    }//GEN-LAST:event_txtSalesActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel orderTableModel = (DefaultTableModel) tblOrderItem.getModel();
    if (orderTableModel.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, "No items in the order. Please add products before submitting.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Message to confirm order submission
    JOptionPane.showMessageDialog(this, "Order submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    // Clear the order table after submission
    orderTableModel.setRowCount(0);

    // Reset fields if necessary
    txtQuantity.setText("");
    txtActualPrice.setText("");
   // txtSuggestedAP.setText("");
        
     
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    private Product findProductByName(String productName) {
    for (Product product : productCatalog.getProductList()) {
          if (product.getName().equalsIgnoreCase(productName)) {
            return product;
        }
    }
    return null; // Return null if the product isn't found
}

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
         String selectedSupplier = (String) cmbSupplier.getSelectedItem();
    if (selectedSupplier != null) {
        Supplier supplier = supplierDirectory.findSupplier(selectedSupplier);
        if (supplier != null) {
            this.productCatalog = supplier.getProductCatalog();
            populateProductTable(); // Refresh table with new ProductCatalog
        } else {
            JOptionPane.showMessageDialog(this, "Supplier not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
//        // TODO add your handling code here:
//        int selectedRow = tblProduct.getSelectedRow();
//    
//    if (selectedRow < 0) {
//        JOptionPane.showMessageDialog(this, "Please select a product from the table.", "Error", JOptionPane.ERROR_MESSAGE);
//        return;
//    }
//    
//    // Retrieve the product from the product catalog
//    Product selectedProduct = productCatalog.getProductList().get(selectedRow);
//
//    try {
//        // Get quantity and actual price input
//        int quantity = Integer.parseInt(txtQuantity.getText());
//        double actualPrice = Double.parseDouble(txtActualPrice.getText());
//
//        if (quantity <= 0 || actualPrice <= 0) {
//            JOptionPane.showMessageDialog(this, "Quantity and Actual Price must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        // Calculate item total
//        double itemTotal = quantity * actualPrice;
//
//        // Add to order item table
//        DefaultTableModel orderTableModel = (DefaultTableModel) tblOrderItem.getModel();
//        Object[] row = new Object[4];
//        row[0] = selectedProduct.getName();
//        row[1] = actualPrice;
//        row[2] = quantity;
//        row[3] = itemTotal;
//        orderTableModel.addRow(row);
//
//        JOptionPane.showMessageDialog(this, "Product added to order successfully!");
//
//    } catch (NumberFormatException e) {
//        JOptionPane.showMessageDialog(this, "Please enter valid numeric values for quantity and actual price.", "Error", JOptionPane.ERROR_MESSAGE);
//    }

  int selectedRow = tblProduct.getSelectedRow();

    // Ensure a row is selected
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a product from the table.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Retrieve product details from the selected row
    String productName = tblProduct.getValueAt(selectedRow, 0).toString();
    double floorPrice = Double.parseDouble(tblProduct.getValueAt(selectedRow, 1).toString());
    double ceilingPrice = Double.parseDouble(tblProduct.getValueAt(selectedRow, 2).toString());
    double targetPrice = Double.parseDouble(tblProduct.getValueAt(selectedRow, 3).toString());

    // Ensure the user has entered valid quantity and actual price
    try {
        int quantity = Integer.parseInt(txtQuantity.getText().trim());
        double actualPrice = Double.parseDouble(txtActualPrice.getText().trim());

        if (quantity <= 0 || actualPrice <= 0) {
            JOptionPane.showMessageDialog(this, "Quantity and Actual Price must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Calculate the item total
        double itemTotal = quantity * actualPrice;

        // Add the product details to the tblOrderItem table
        DefaultTableModel orderTableModel = (DefaultTableModel) tblOrderItem.getModel();
        Object[] row = new Object[4];
        row[0] = productName;
        row[1] = actualPrice;
        row[2] = quantity;
        row[3] = itemTotal;
        orderTableModel.addRow(row);

        // Notify the user of the successful addition
        JOptionPane.showMessageDialog(this, "Product added to the order successfully!");

        // Clear the input fields for the next selection
        txtQuantity.setText("");
        txtActualPrice.setText("");

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values for quantity and actual price.", "Error", JOptionPane.ERROR_MESSAGE);
    }

       

    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnGenerateBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBIActionPerformed
        // TODO add your handling code here:
        populateBusinessIntelligenceFields();
    }//GEN-LAST:event_btnGenerateBIActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGenerateBI;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JTable tblOrderItem;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtAMT;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtFAT;
    private javax.swing.JTextField txtFBT;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSales;
    // End of variables declaration//GEN-END:variables

    private void populateSupplierComboBox() {
        ArrayList<Supplier> supplierList = supplierDirectory.getSuplierList(); // Assuming getSuppliers() returns an ArrayList<Supplier>
cmbSupplier.removeAllItems();
for (Supplier supplier : supplierList) {
    cmbSupplier.addItem(supplier.getName()); // Assuming Supplier has a getName() method
}





//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void populateProductTable() {
        
DefaultTableModel model = (DefaultTableModel) tblProduct.getModel(); // tblProduct is the JTable
    model.setRowCount(0); // Clear existing rows

    for (Product product : productCatalog.getProductList()) {
        Object[] row = new Object[4]; // Number of columns in the table
        row[0] = product.getName();
        row[1] = product.getFloorPrice();
        row[2] = product.getCeilingPrice();
        row[3] = product.getTargetPrice();
        model.addRow(row);
    }


//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    private void populateBusinessIntelligenceFields() {
    int totalFrequencyAboveTarget = 0;
    int totalFrequencyBelowTarget = 0;
    double totalSalesRevenue = 0.0;
    double totalMarginAboveTarget = 0.0;

    for (Product product : productCatalog.getProductList()) {
        // Aggregate frequencies
        totalFrequencyAboveTarget += product.getNumberOfProductSalesAboveTarget();
        totalFrequencyBelowTarget += product.getNumberOfProductSalesBelowTarget();

        // Aggregate sales revenue
        totalSalesRevenue += product.getTotalRevenue();

        // Calculate margin above target
        if (product.getTargetPrice() > 0) { // Avoid division by zero
            double margin = product.getTotalRevenue() - (product.getTargetPrice() * product.getNumberOfProductSalesAboveTarget());
            totalMarginAboveTarget += Math.max(margin, 0); // Only consider positive margins
        }
    }

    // Update text fields
    txtFAT.setText(String.valueOf(totalFrequencyAboveTarget));
    txtFBT.setText(String.valueOf(totalFrequencyBelowTarget));
    txtSales.setText(String.format("%.2f", totalSalesRevenue));
    txtAMT.setText(String.format("%.2f", totalMarginAboveTarget / productCatalog.getProductList().size())); // Average margin
}

    private void setupTableClickListener() {
       tblProduct.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting() && tblProduct.getSelectedRow() != -1) {
            displaySuggestedActualPrice();
        }
    });





// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void displaySuggestedActualPrice() {
       int selectedRow = tblProduct.getSelectedRow();

    // Ensure a row is selected
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a product from the table.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Retrieve product details from the selected row
    String productName = tblProduct.getValueAt(selectedRow, 0).toString();
    double floorPrice = Double.parseDouble(tblProduct.getValueAt(selectedRow, 1).toString());
    double ceilingPrice = Double.parseDouble(tblProduct.getValueAt(selectedRow, 2).toString());
    double targetPrice = Double.parseDouble(tblProduct.getValueAt(selectedRow, 3).toString());

    // Calculate the suggested actual price
    // Example formula: average of floor price and target price
    double suggestedActualPrice = (floorPrice + targetPrice) / 2;

    // Display product name and calculated suggested actual price
    txtProduct.setText(productName);
    txtSuggestedAP.setText(String.format("%.2f", suggestedActualPrice)); 






//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
