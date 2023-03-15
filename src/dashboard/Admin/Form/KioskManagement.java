package Dashboard.Admin.Form;

import InitialData.Kiosk;
import InitialData.RegionAndPriceManagement;
import InitialData.SG;
import javax.swing.JOptionPane;

public class KioskManagement extends javax.swing.JPanel {

    public KioskManagement() {
        initComponents();
        setOpaque(false);
        initData();
    }
    
    public void initData(){
        for (int i = 0; i < SG.managementsOfRegionsAndPrices.getLength(); i++) {
            RegionAndPriceManagement regionAndPriceManagement = SG.managementsOfRegionsAndPrices.getRegionRecord(i);
            cboRegion.addItem("["+regionAndPriceManagement.getCode()+"]"+regionAndPriceManagement.getName());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        txtCode = new javaswing.controls.TextField();
        txtName = new javaswing.controls.TextField();
        cboRegion = new javaswing.controls.Combobox();
        jLabel2 = new javax.swing.JLabel();
        cmdSave = new javaswing.controls.ButtonCustom();

        setPreferredSize(new java.awt.Dimension(999, 621));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Manejo de Kioscos");

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUserName.setText("Manejo de kioscos");

        txtCode.setLabelText("Codigo de kiosco");

        txtName.setLabelText("Nombre de Kiosco");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        cboRegion.setLabeText("Codigo de la Region");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N

        cmdSave.setText("Almacenar");
        cmdSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmdSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                        .addComponent(cboRegion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        // TODO add your handling code here:
        Kiosk kiosk = new Kiosk();
        Boolean validation = false;
        
        try {
            kiosk.setCode(txtCode.getText());
            kiosk.setName(txtName.getText());
            kiosk.setRegionCode(SG.managementsOfRegionsAndPrices.getRegionRecord(cboRegion.getSelectedIndex()).getCode());
            validation= true;
        } catch (Exception e) {
            System.out.println("Error en Almacenar");
        }
        
        if (validation) {
            SG.kiosks.addKiosk(kiosk);
            JOptionPane.showMessageDialog(null, "Almacenado Corrrectamente ");
        }
    }//GEN-LAST:event_cmdSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswing.controls.Combobox cboRegion;
    private javaswing.controls.ButtonCustom cmdSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javaswing.controls.TextField txtCode;
    private javaswing.controls.TextField txtName;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
