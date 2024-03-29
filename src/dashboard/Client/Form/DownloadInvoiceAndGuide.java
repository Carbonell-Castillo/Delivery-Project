/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dashboard.Client.Form;

import InitialData.PackageDelivery;
import InitialData.SG;
import static dashboard.Client.Form.Buy.packageDelivery;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruce
 */
public class DownloadInvoiceAndGuide extends javax.swing.JPanel {

    /**
     * Creates new form DownloadInvoiceAndGuide
     */
    public DownloadInvoiceAndGuide() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        txtCodePackage = new javaswing.controls.TextField();
        txtOrigin = new javaswing.controls.TextField();
        txtDestiny = new javaswing.controls.TextField();
        jLabel2 = new javax.swing.JLabel();
        cmdDownloadGuide = new javaswing.controls.ButtonCustom();
        cmdSearch = new javaswing.controls.ButtonCustom();
        txtTypeOfPayment = new javaswing.controls.TextField();
        txtSizePackage = new javaswing.controls.TextField();
        downloadInvoice = new javaswing.controls.ButtonCustom();
        txtRecipient = new javaswing.controls.TextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(999, 621));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Manejo de Kioscos");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUserName.setText("Descargar Factura y Guia");

        txtCodePackage.setLabelText("Codigo de paquete");
        txtCodePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodePackageActionPerformed(evt);
            }
        });

        txtOrigin.setLabelText("Origen");
        txtOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOriginActionPerformed(evt);
            }
        });

        txtDestiny.setLabelText("Destino");
        txtDestiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDestinyActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delivery.png"))); // NOI18N

        cmdDownloadGuide.setText("Descargar guia");
        cmdDownloadGuide.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdDownloadGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDownloadGuideActionPerformed(evt);
            }
        });

        cmdSearch.setText("Buscar");
        cmdSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSearchActionPerformed(evt);
            }
        });

        txtTypeOfPayment.setLabelText("Tipo de pago");
        txtTypeOfPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeOfPaymentActionPerformed(evt);
            }
        });

        txtSizePackage.setLabelText("Tamaño de paquetes");
        txtSizePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizePackageActionPerformed(evt);
            }
        });

        downloadInvoice.setText("Descargar Factura");
        downloadInvoice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        downloadInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadInvoiceActionPerformed(evt);
            }
        });

        txtRecipient.setLabelText("Destinatario");
        txtRecipient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecipientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDestiny, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodePackage, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtTypeOfPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSizePackage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdDownloadGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downloadInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtRecipient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodePackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(txtOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDestiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRecipient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTypeOfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSizePackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDownloadGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downloadInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodePackageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodePackageActionPerformed

    private void txtOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOriginActionPerformed

    private void txtDestinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDestinyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDestinyActionPerformed

    private void cmdDownloadGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDownloadGuideActionPerformed
        try {
            SG.generateGuide(packageDelivery);
        } catch (IOException ex) {
            Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdDownloadGuideActionPerformed

    private void txtTypeOfPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeOfPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeOfPaymentActionPerformed

    private void txtSizePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizePackageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizePackageActionPerformed

    private void downloadInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadInvoiceActionPerformed
        // TODO add your handling code here:
        try {
            SG.generateInvoice(packageDelivery);
        } catch (IOException ex) {
            Logger.getLogger(Buy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_downloadInvoiceActionPerformed
    public static PackageDelivery packageDelivery;
    private void cmdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSearchActionPerformed
        // TODO add your handling code here:
        String code = txtCodePackage.getText();
        packageDelivery = SG.packages.getPackagesByCode(code);
        
        txtOrigin.setText(packageDelivery.getOrigin());
        txtDestiny.setText(packageDelivery.getDestiny());
        txtRecipient.setText(packageDelivery.getRecipientsName());
        txtTypeOfPayment.setText(SG.getTypeOfPayment(packageDelivery.getPaymentMethod()));
        txtSizePackage.setText(packageDelivery.getSize());
        
    }//GEN-LAST:event_cmdSearchActionPerformed

    private void txtRecipientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecipientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecipientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswing.controls.ButtonCustom cmdDownloadGuide;
    private javaswing.controls.ButtonCustom cmdSearch;
    private javaswing.controls.ButtonCustom downloadInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javaswing.controls.TextField txtCodePackage;
    private javaswing.controls.TextField txtDestiny;
    private javaswing.controls.TextField txtOrigin;
    private javaswing.controls.TextField txtRecipient;
    private javaswing.controls.TextField txtSizePackage;
    private javaswing.controls.TextField txtTypeOfPayment;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
