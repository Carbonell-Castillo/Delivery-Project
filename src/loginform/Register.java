/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

import javax.swing.JTextField;
import InitialData.Client;
import InitialData.SG;
import InitialData.User;
import java.awt.Dimension;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javaswingnotifications.Notification;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author bruce
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register3
     */
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPhoto = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtID = new javaswing.controls.TextField();
        txtName = new javaswing.controls.TextField();
        txtLastName = new javaswing.controls.TextField();
        txtUser = new javaswing.controls.TextField();
        txtEmail = new javaswing.controls.TextField();
        txtDateOfBirth = new javaswing.controls.TextField();
        cboGender = new javaswing.controls.Combobox();
        txtPassword = new javaswing.controls.PasswordField();
        txtPhone = new javaswing.controls.TextField();
        cboRole = new javaswing.controls.Combobox();
        cboNacionality = new javaswing.controls.Combobox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_acc_account_user_profile_avatar_person_man_interface_7808878.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registro de usuario");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon register.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Subir");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_acc_account_user_profile_avatar_person_man_interface_7808878.png"))); // NOI18N

        btnRegister.setBackground(new java.awt.Color(51, 0, 204));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registar");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtID.setLabelText("DPI");

        txtName.setLabelText("Nombre");

        txtLastName.setLabelText("Apellido");

        txtUser.setLabelText("Sobrenombre (Alias)");

        txtEmail.setLabelText("Correo");

        txtDateOfBirth.setLabelText("Fecha de nacimiento");

        cboGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        cboGender.setSelectedIndex(-1);
        cboGender.setLabeText("Genero");

        txtPassword.setLabelText("Contraseña");
        txtPassword.setShowAndHide(true);

        txtPhone.setLabelText("Telefono");

        cboRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Cliente", "Empresarial" }));
        cboRole.setSelectedIndex(-1);
        cboRole.setLabeText("Rol");

        cboNacionality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Guatemalteca", "Española", "Mexicana", "Francesa", "Estadounidense", "Canadiense", "Japonesa", "Brasileña." }));
        cboNacionality.setSelectedIndex(-1);
        cboNacionality.setLabeText("Nacionalidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(269, 269, 269)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addGap(394, 394, 394)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(713, 713, 713)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboNacionality, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNacionality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public String imagePath;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Notification panelNotification;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png", "gif");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Ingrese su fotografia");
        int returnVal = chooser.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            panelNotification = new Notification(this, Notification.Type.SUCCESS, Notification.Location.TOP_RIGHT, "Imagen subida correctamente");
            imagePath = chooser.getSelectedFile().getPath();
            ImageIcon imageIcon = new ImageIcon(imagePath);
              
            // We obtain the dimensions of the image and of the JLabel
            int labelWidth = jPhoto.getWidth();
            int labelHeight = jPhoto.getHeight();
            int imageWidth = imageIcon.getIconWidth();
            int imageHeight = imageIcon.getIconHeight();
    
            // We resize the image to fit the JLabel
            double scaleFactor = Math.min(1d, getScaleFactorToFit(new Dimension(imageWidth, imageHeight), new Dimension(labelWidth, labelHeight)));
            int scaleWidth = (int) Math.round(imageWidth * scaleFactor);
            int scaleHeight = (int) Math.round(imageHeight * scaleFactor);
            Image image = imageIcon.getImage().getScaledInstance(scaleWidth, scaleHeight, Image.SCALE_SMOOTH);
    
            // Assign the resized image to the JLabel
            jPhoto.setIcon(new ImageIcon(image));

            System.out.println(imagePath);
        
        }else{
            panelNotification = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_RIGHT, "Imagen no subida correctamente");
            System.out.println("Imagen no ingresada");
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    private static double getScaleFactorToFit(Dimension original, Dimension toFit) {
        double dScale = 1d;
        if (original != null && toFit != null) {
            double dScaleWidth = getScaleFactor(original.width, toFit.width);
            double dScaleHeight = getScaleFactor(original.height, toFit.height);
            dScale = Math.min(dScaleHeight, dScaleWidth);
        }
        return dScale;
    }

    private static double getScaleFactor(int iMasterSize, int iTargetSize) {
        double dScale = (double) iTargetSize / (double) iMasterSize;
        return dScale;
    }
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        login login = new login();
        dispose();
        login.setVisible(true);

    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        User user = new User();
        Client client= new Client();
        Notification panel;
        Boolean validation=false;
        Integer role=0;
        
        try {
            
            if (validateText(txtID) || validateText(txtName) || validateText(txtLastName) || validateText(txtDateOfBirth) || validateText(txtPhone) || validateText(txtEmail) || validateText(txtPassword) || imagePath.trim().isBlank()) {
                panel = new Notification(this, Notification.Type.INFO, Notification.Location.TOP_CENTER, "Datos Vacios, intentelo nuevamente");    
                panel.showNotification();
            
            } else {
                
                if(SG.user.validationUserRegister(txtID.getText(), txtUser.getText(), txtEmail.getText())){
                    panel = new Notification(this, Notification.Type.INFO, Notification.Location.TOP_CENTER, "DPI, correo o usuario ya existente, intente nuevamente");    
                    panel.showNotification();
                }else{
                    user.setId(txtID.getText());
                    user.setName(txtName.getText());
                    user.setLastName(txtLastName.getText());
                    user.setUser(txtUser.getText());
                    user.setDateOfBirth(txtDateOfBirth.getText());
                    user.setGender(cboGender.getSelectedItem().toString());
                    user.setNationality((String) cboNacionality.getSelectedItem());
                    user.setPhoneNumber(txtPhone.getText());
                    user.setEmail(txtEmail.getText());
                    user.setPhoto(imagePath);
                    
                    role = cboRole.getSelectedIndex();
                    if(cboRole.getSelectedIndex()==2){
                        role=0;
                    }
                    
                    if (role >= 0) {
                        user.setRole(role);
                        if (role == 0) {
                            System.out.println("Administrador");
                        } else if (role == 1) {
                            System.out.println("Cliente");
                            client.setUser(user);
                        }
                    } else {
                        throw new Exception("Datos invalidos");
                    }

                    //Validation password
                    System.out.println("salio");
                    String password = txtPassword.getText();
                    boolean correctPassword = verifyPassword(password);

                    if (correctPassword) {
                        System.out.println("La contraseña cumple con los requisitos");
                        user.setPassword(password);
                        
                    } else {
                        //panel = new Notification(this, Notification.Type.INFO, Notification.Location.TOP_CENTER, "La contraseña no cumple con los requisitos, intentelo nuevamente");    
                        //panel.showNotification();
                        throw new Exception("La contraseña no cumple con los parametros");
                    }
                    validation = true;
                }

                
            }

        } catch (Exception e) {
                panel = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, e.getMessage());    
                panel.showNotification();
            
        }

        if (validation) {
            SG.user.addUserRecord(user);
            
            if (role == 1) {
                SG.user.addCustomerRecord(client);
            }
            System.out.println("Validation complete");

            panel = new Notification(this, Notification.Type.SUCCESS, Notification.Location.TOP_CENTER, "Datos Almacenados correctamente");

            panel.showNotification();
            clearText();
        } else {
            System.out.println("NOOOO");
//            panel = new Notification(this, Notification.Type.WARNING, Notification.Location.TOP_CENTER, "Daots invalido, por favor, vuelvalo a intentar");    
            if(!verifyPassword(txtPassword.getText())){
    //                panel = new Notification(this, Notification.Type.INFO, Notification.Location.TOP_CENTER, "La contraseña no cumple con los parametros");
            }else{
                
            }
            
//            panel.showNotification();
        }
        

    }//GEN-LAST:event_btnRegisterActionPerformed
    
    private void clearText(){
        txtID.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtUser.setText("");
        txtEmail.setText("");
        txtDateOfBirth.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        
        cboGender.setSelectedIndex(-1);
        cboNacionality.setSelectedIndex(-1);
        cboRole.setSelectedIndex(-1);
        
    }
    private boolean validateText(JTextField campoTexto) {
        String texto = campoTexto.getText().trim();
        if (texto.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verifyPassword(String password) {

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        // Check each character of the password
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(character)) {
                hasLowercase = true;
            } else if (Character.isDigit(character)) {
                hasNumber = true;
            } else if (Character.isLetterOrDigit(character) == false) {
                hasSpecialChar = true;
            }
        }

        // Check if all requirements are met
        if (hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javaswing.controls.Combobox cboGender;
    private javaswing.controls.Combobox cboNacionality;
    private javaswing.controls.Combobox cboRole;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPhoto;
    private javaswing.controls.TextField txtDateOfBirth;
    private javaswing.controls.TextField txtEmail;
    private javaswing.controls.TextField txtID;
    private javaswing.controls.TextField txtLastName;
    private javaswing.controls.TextField txtName;
    private javaswing.controls.PasswordField txtPassword;
    private javaswing.controls.TextField txtPhone;
    private javaswing.controls.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
