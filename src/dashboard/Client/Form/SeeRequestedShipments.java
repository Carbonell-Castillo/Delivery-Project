/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dashboard.Client.Form;

import Dashboard.table.ModelProfile;
import InitialData.PackageDelivery;
import InitialData.SG;
import javax.swing.ImageIcon;

/**
 *
 * @author bruce
 */
public class SeeRequestedShipments extends javax.swing.JPanel {

    /**
     * Creates new form SeeRequestedShipments
     */
    public SeeRequestedShipments() {
        initComponents();
         table1.fixTable(jScrollPane1);
        setOpaque(false);
        initTableData();
    }

    private void initTableData() {
        
        //We added column names
        if(SG.packages.allPackageClient(SG.getClientFound()).size()>0){
            for (int i = 0; i < SG.packages.allPackageClient(SG.getClientFound()).size(); i++) {
                PackageDelivery packageDelivery = (PackageDelivery) SG.packages.allPackageClient(SG.getClientFound()).get(i);
                PackageManagement.Buy buy = new PackageManagement.Buy(SG.clientFound, packageDelivery.getPaymentMethod());
                table1.addRow(new Object[]{new ModelProfile(new ImageIcon(getClass().getResource("/icon/package.jpg")), packageDelivery.getCode()), packageDelivery.getServiceType(),packageDelivery.getClient().getName(), packageDelivery.getTotal(), SG.getTypeOfPayment(packageDelivery.getPaymentMethod())});        
            }
        }else{
            System.out.println("No existen registros previos");
        }
        
        /*
        table1.addRow(new Object[]{new ModelProfile(new ImageIcon(getClass().getResource("/icon/package.jpg")), "010SDF"), "Estandar","Mario", "Q120", "Contraentrega"});
        table1.addRow(new Object[]{new ModelProfile(new ImageIcon(getClass().getResource("/icon/package.jpg")), "2343SF"), "Estandar","Krystell", "Q320", "Contraentrega"});
        */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Dashboard.table.Table();
        txtCodePackage = new javaswing.controls.TextField();
        cmdSearch = new javaswing.controls.ButtonCustom();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(999, 621));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Dashboard / Home");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUserName.setText("Ver envios solicitados");

        table1.setBackground(new java.awt.Color(255, 255, 255));
        table1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de paquete", "Tipo de servicio", "Destinatario", "Total de envio", "Total de pago"
            }
        ));
        jScrollPane1.setViewportView(table1);

        txtCodePackage.setLabelText("Codigo de paquete");

        cmdSearch.setText("Buscar");
        cmdSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodePackage, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodePackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed
        // TODO add your handling code here:
        String codePackageSearch ="";
        
         if(SG.packages.allPackageClient(SG.getClientFound()).size()>0){
            for (int i = 0; i < SG.packages.searchPackageClientCode(SG.getClientFound(), codePackageSearch).size(); i++) {
                PackageDelivery packageDelivery = (PackageDelivery) SG.packages.searchPackageClientCode(SG.getClientFound(), codePackageSearch).get(i);
                table1.addRow(new Object[]{new ModelProfile(new ImageIcon(getClass().getResource("/icon/package.jpg")), packageDelivery.getCode()), packageDelivery.getServiceType(),packageDelivery.getRecipientsName(), packageDelivery.getTotal(), SG.getTypeOfPayment(packageDelivery.getPaymentMethod())});        
                
            }
        }else{
            System.out.println("No existen registros previos");
        }
        
    }//GEN-LAST:event_cmdSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswing.controls.ButtonCustom cmdSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Dashboard.table.Table table1;
    private javaswing.controls.TextField txtCodePackage;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
