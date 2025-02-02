/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;

/**
 *
 * @author HARSH
 */
public class ManageSuppliersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSuppliersPanel
     */
    
    SupplierDirectory supplierDirectory;
    ProductCatalog productCatalog;
    
    JPanel userProcessContainer;
    
    public ManageSuppliersPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
        initComponents();
        populateSupplierComboBox();
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

        lblManageSupp = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        cmbSupplier = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        btnback = new javax.swing.JButton();
        lblProdName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFreAboTraget = new javax.swing.JLabel();
        lblSalesRevenue = new javax.swing.JLabel();
        lblMarginAroundTraget = new javax.swing.JLabel();
        txtfreabotarget = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtfreqbelowtarget = new javax.swing.JTextField();
        txtmarginaroundTarget = new javax.swing.JTextField();
        txtSalesRevenue = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(866, 605));

        lblManageSupp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblManageSupp.setText("Manage Supplier");

        lblSupplier.setText("Supplier");

        lblProduct.setText("Product");

        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Floor", "Ceilling", "Target"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduct);
        if (tblProduct.getColumnModel().getColumnCount() > 0) {
            tblProduct.getColumnModel().getColumn(0).setResizable(false);
            tblProduct.getColumnModel().getColumn(1).setResizable(false);
            tblProduct.getColumnModel().getColumn(2).setResizable(false);
            tblProduct.getColumnModel().getColumn(3).setResizable(false);
        }

        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lblProdName.setText("Product name:");

        jLabel2.setText("Frequency Below Target:");

        lblFreAboTraget.setText("Frequency Above Target:");

        lblSalesRevenue.setText("Sales Revenue:");

        lblMarginAroundTraget.setText("Margin Around Target:");

        txtProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblFreAboTraget)
                            .addComponent(lblProdName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfreabotarget, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfreqbelowtarget, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProduct)
                            .addComponent(lblSupplier)
                            .addComponent(btnback))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarginAroundTraget)
                            .addComponent(lblSalesRevenue)
                            .addComponent(txtSalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmarginaroundTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblManageSupp)
                        .addGap(322, 322, 322))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(646, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblManageSupp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lblProduct)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnback)
                .addGap(43, 43, 43)
                .addComponent(lblProdName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFreAboTraget)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfreabotarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfreqbelowtarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSalesRevenue)
                        .addGap(18, 18, 18)
                        .addComponent(txtSalesRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblMarginAroundTraget)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmarginaroundTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(454, Short.MAX_VALUE)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(159, 159, 159)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void populateSupplierComboBox() {
    cmbSupplier.removeAllItems(); // Clear existing items

    // Check if supplierDirectory is not null
    if (supplierDirectory != null) {
        for (Supplier supplier : supplierDirectory.getSuplierList()) {
            cmbSupplier.addItem(supplier.getName()); // Add supplier names to the combo box
        }
    } else {
        JOptionPane.showMessageDialog(
            this,
            "Supplier Directory is not available!",
            "Error",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
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

    private void txtProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdNameActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox cmbSupplier;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFreAboTraget;
    private javax.swing.JLabel lblManageSupp;
    private javax.swing.JLabel lblMarginAroundTraget;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblSalesRevenue;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtSalesRevenue;
    private javax.swing.JTextField txtfreabotarget;
    private javax.swing.JTextField txtfreqbelowtarget;
    private javax.swing.JTextField txtmarginaroundTarget;
    // End of variables declaration//GEN-END:variables

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
    }




// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    



   
private void setupTableClickListener() {
    tblProduct.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int selectedRow = tblProduct.getSelectedRow();
            if (selectedRow >= 0) {
                // Get the selected product name from the table
                String productName = tblProduct.getValueAt(selectedRow, 0).toString();

                // Find the product manually from the product catalog
                Product selectedProduct = null;
                for (Product product : productCatalog.getProductList()) {
                    if (product.getName().equals(productName)) {
                        selectedProduct = product;
                        break;
                    }
                }

                if (selectedProduct != null) {
                    // Display product details
                    txtProdName.setText(selectedProduct.getName());

                    // Perform calculations
                    double totalRevenue = 0.0;
                    int frequencyAboveTarget = 0;
                    int frequencyBelowTarget = 0;
                    double marginAroundTarget = 0.0;

                    for (OrderItem orderItem : selectedProduct.getOrderItems()) {
                        int quantity = orderItem.getQuantity();
                        int actualPrice = orderItem.getActualPrice();
                        int targetPrice = selectedProduct.getTargetPrice();

                        totalRevenue += quantity * actualPrice;

                        if (actualPrice > targetPrice) {
                            frequencyAboveTarget++;
                        } else if (actualPrice < targetPrice) {
                            frequencyBelowTarget++;
                        }

                        marginAroundTarget += (actualPrice - targetPrice) * quantity;
                    }

                    txtSalesRevenue.setText(String.format("%.2f", totalRevenue));
                    txtfreabotarget.setText(String.valueOf(frequencyAboveTarget));
                    txtfreqbelowtarget.setText(String.valueOf(frequencyBelowTarget));
                    txtmarginaroundTarget.setText(String.format("%.2f", marginAroundTarget));
                } else {
                    JOptionPane.showMessageDialog(ManageSuppliersPanel.this, 
                        "Product not found in the catalog.", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(ManageSuppliersPanel.this, 
                    "Please select a product from the table.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}




   
  

    }

    
         
          



