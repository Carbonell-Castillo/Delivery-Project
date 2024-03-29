/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Dashboard.Admin.Form;

import Dashboard.table.ModelProfile;
import InitialData.Client;
import InitialData.PackageDelivery;
import InitialData.SG;
import InitialData.User;
import javax.swing.ImageIcon;

/**
 *
 * @author bruce
 */
public class TotalRevenues extends javax.swing.JPanel {

    /**
     * Creates new form TotalRevenues
     */
    public TotalRevenues() {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initTableData();
    }

    private void initTableData() {
        table1.clearTable();
        Integer quantity= SG.packages.getLength();
        double total=0;
        for (int i = 0; i < quantity; i++) {
            PackageDelivery packageDelivery = SG.packages.getPackageRecord(i);
            Client client = packageDelivery.getClient();
            total= total + packageDelivery.getTotal();
            User user = client.getUser();
            table1.addRow(new Object[]{new ModelProfile(new ImageIcon(user.getPhoto()), user.getName()+" "+user.getLastName()), packageDelivery.getDescription(), packageDelivery.getOrigin(), packageDelivery.getDestiny(),SG.getTypeOfPayment(packageDelivery.getPaymentMethod()), packageDelivery.getDateSent(), packageDelivery.getTotal()});
        }
        lblTotal.setText("Total de ingresos: "+total);
        //We added column names
        
        //table1.addRow(new Object[]{new ModelProfile(new ImageIcon(getClass().getResource("/icon/profile.jpg")), "Mario Lopez"), "Celular","Zacapa", "Mixco", "Pago al contado","17/02/2023", "Q230"});
    }
    
    public void Search(String data){
        table1.clearTable();
        Integer quantity= SG.packages.getPackageByDescription(data).size();
        double total=0;
        for (int i = 0; i < quantity; i++) {
            PackageDelivery packageDelivery = (PackageDelivery) SG.packages.getPackageByDescription(data).get(i);
            Client client = packageDelivery.getClient();
            total= total + packageDelivery.getTotal();
            User user = client.getUser();
            table1.addRow(new Object[]{new ModelProfile(new ImageIcon(user.getPhoto()), user.getName()+" "+user.getLastName()), packageDelivery.getDescription(), packageDelivery.getOrigin(), packageDelivery.getDestiny(),SG.getTypeOfPayment(packageDelivery.getPaymentMethod()), packageDelivery.getDateSent(), packageDelivery.getTotal()});
        }
        lblTotal.setText("Total de ingresos: "+total);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Dashboard.table.Table();
        txtSearch = new javaswing.controls.TextField();
        cmdBuscar = new javaswing.controls.ButtonCustom();
        cmdSearch1 = new javaswing.controls.ButtonCustom();

        setPreferredSize(new java.awt.Dimension(999, 621));

        jPanel1.setPreferredSize(new java.awt.Dimension(999, 621));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(999, 621));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Reportes/Ingreso totales");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("Total de ingresos: Q400");

        table1.setBackground(new java.awt.Color(255, 255, 255));
        table1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Paquete", "Origen", "Destino", "Tipo de pago", "Fecha", "Precio"
            }
        ));
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table1);

        txtSearch.setLabelText("Buscar por paquete");

        cmdBuscar.setText("Buscar");
        cmdBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        cmdSearch1.setText("Actualizar");
        cmdSearch1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdSearch1.setStyle(javaswing.controls.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        cmdSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        // TODO add your handling code here:
        String dataSearch= txtSearch.getText();
        Search(dataSearch);
        
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void cmdSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearch1ActionPerformed
        // TODO add your handling code here:
        initTableData();
    }//GEN-LAST:event_cmdSearch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswing.controls.ButtonCustom cmdBuscar;
    private javaswing.controls.ButtonCustom cmdSearch1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private Dashboard.table.Table table1;
    private javaswing.controls.TextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
