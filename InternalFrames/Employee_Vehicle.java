/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrames;
import java.*;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import myproject.Company;
import myproject.Vehicle;

/**
 *
 * @author Abdelaziz
 */
public class Employee_Vehicle extends javax.swing.JInternalFrame {

    /**
     * Creates new form Employee_Vehicle
     */
    public Employee_Vehicle() {
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButtonView = new javax.swing.JButton();
        jLabelUseAS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelAnswer = new javax.swing.JLabel();
        jTextFieldBrand = new javax.swing.JTextField();
        jComboBoxUse = new javax.swing.JComboBox<>();
        jComboBoxStatus = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 153, 255));
        setClosable(true);

        jLabel1.setText("Brand");

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jLabelUseAS.setText("Use as");

        jLabel3.setText("Status");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Brand", "CarModel", "ProductionYear", "SeatCapacity", "EngineCapacity", "Type", "Varient", "Status", "UseAs", "RentValue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelAnswer.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAnswer.setText("Fill to get info ....");

        jComboBoxUse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxi", "Individual" }));

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rented", "Unrented" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelUseAS)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonView)
                                .addGap(182, 182, 182))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabelAnswer)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelAnswer)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUseAS)
                            .addComponent(jComboBoxUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
     
          if( ( !jTextFieldBrand.getText().equals("") ) )
        {
            
            Vehicle x = new Vehicle();
            Company c = new Company();
            String Status;
            String Use ;
            String Brand ;
            if(c.isExist(jTextFieldBrand.getText()))
            {
            
            
            ArrayList<Vehicle> Selected = new ArrayList<Vehicle>();
            
          if(jComboBoxStatus.getSelectedIndex() == 0)
          {
               Status = "Rented";
          }else
              Status = "Unrented";
          
          if(jComboBoxUse.getSelectedIndex() == 0)
          {
              Use="Taxi";
          }else
              Use="Individual";
          
          Brand = jTextFieldBrand.getText();
          
             Selected =  x.viewVehicle(Brand, Use, Status);
              AddTableRows(Selected);
              ResetPanels();
              if(Selected.size() == 0)
              {
                  jLabelAnswer.setText("Your Requirements were not Found ..");
              }
             else
               jLabelAnswer.setText("Your Requirements were Found ..");
               
           
           
            } else
                jLabelAnswer.setText("Brand Doesn't Exist...");
        
                    }else
                          jLabelAnswer.setText("Missing Required Fields...!");
        
        
        
            
    }//GEN-LAST:event_jButtonViewActionPerformed
 
    public void AddTableRows(ArrayList<Vehicle> Selected)
{
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    Object RowData [] = new Object[11];
    

    int rowCount = model.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    model.removeRow(i);
}
    
    
    for(Vehicle x : Selected )
    {
        RowData[0] = x.getNumber();
        RowData[1] =x.getBrand().getBrand();
        RowData[2] =x.getCarModel();
        RowData[3] =x.getProductionYear();
        RowData[4] = x.getSeatCapacity();
        RowData[5] =x.getEngineCapacity();
        RowData[6] =x.getType();
        RowData[7] =x.getVarient();
        RowData[8] = x.getStatus();
        RowData[9] =x.getUseAs();
        RowData[10] =x.getRentValue();
       
        model.addRow(RowData);
    }
    
}
    
       private void ResetPanels() {
           
           jTextFieldBrand.setText("");
           jComboBoxStatus.setSelectedIndex(0);
           jComboBoxUse.setSelectedIndex(0);
       
    }

 

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JComboBox<String> jComboBoxUse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelUseAS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBrand;
    // End of variables declaration//GEN-END:variables
}
