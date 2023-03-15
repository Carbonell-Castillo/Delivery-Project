/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainDashboard;

import dashboard.style.Header;
import dashboard.style.Menu;
import dashboard.style.menu.EventMenuSelected;
import dashboard.style.menu.EventShowPopupMenu;
import Dashboard.Admin.Form.KioskManagement;
import Dashboard.Admin.Form.Form_Home;
import Dashboard.Admin.Form.MainForm;
import Dashboard.style.menu.MenuItem;
import Dashboard.style.menu.PopupMenu;
import Dashboard.Admin.Form.Account2;
import Dashboard.Admin.Form.DepartmentManagement;
import Dashboard.Admin.Form.ListOfRegionsWithMoreShipments;
import Dashboard.Admin.Form.ListOfUsersWithTheMostPacketsSent;
import Dashboard.Admin.Form.ManagementOfRegionsAndPrices;
import Dashboard.Admin.Form.MunicipalitiesManagement;
import Dashboard.Admin.Form.TotalNumberOfPackagesSent;
import Dashboard.Admin.Form.TotalRevenues;
import InitialData.SG;
import dashboard.Admin.Form.ListOfUsers;
import dashboard.Admin.Form.PriceConfiguration;
import dashboard.Client.Form.Buy;
import dashboard.Client.Form.CreditCardRegister;
import dashboard.Client.Form.DownloadInvoiceAndGuide;
import dashboard.Client.Form.InvoiceRegistration;
import dashboard.Client.Form.PackageQuotation;
import dashboard.Client.Form.SeeRequestedShipments;
//import com.raven.swing.icon.GoogleMaterialDesignIcons;
//import com.raven.swing.icon.IconFontSwing;
import dashboard.style.menu.Menu1;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
/**
 *
 * @author bruce
 */
public class Main2 extends javax.swing.JFrame {

    /**
     * Creates new form Main2
     */
    private MigLayout layout;
    private Menu1 menu;
    private Header header;
    private MainForm main;
    private Animator animator;

    public Main2() {
        initComponents();
        
        init();
    }

    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        bg.setLayout(layout);
        menu = new Menu1();
        header = new Header();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                
                if(SG.SESSION_ROLE==0){
                
                if (menuIndex == 0) {
                    main.showForm(new Form_Home());
                }else if (menuIndex == 1) {
                        main.showForm(new ManagementOfRegionsAndPrices());
                    }else if(menuIndex==2){
                        main.showForm(new KioskManagement());
                        
                    }else if(menuIndex==3){
                        if(subMenuIndex==0){
                            main.showForm(new DepartmentManagement());
                        }else if(subMenuIndex==1){
                            main.showForm(new MunicipalitiesManagement());
                        }
                        
                    }else if (menuIndex==4) {
                        main.showForm(new PriceConfiguration());
                    }else if(menuIndex==5){
                        if(subMenuIndex==0){
                            main.showForm(new ListOfRegionsWithMoreShipments());
                        }else if(subMenuIndex==1){
                            main.showForm(new TotalNumberOfPackagesSent());
                        }else if(subMenuIndex==2){
                            main.showForm(new TotalRevenues());
                        }else if(subMenuIndex==3){
                            main.showForm(new ListOfUsersWithTheMostPacketsSent());
                        }else if(subMenuIndex==4){
                            main.showForm(new ListOfUsers());
                        }
                    }else if(menuIndex==6){
                        main.showForm(new Account2());
                    }else if(menuIndex==7){
                    main.setVisible(false);
                }
            }else if(SG.SESSION_ROLE==1){
                if (menuIndex == 0) {
                    main.showForm(new Form_Home());
                }else if (menuIndex == 1) {
                    if(subMenuIndex==0){
                        main.showForm(new CreditCardRegister());
                    }else if(subMenuIndex==1){
                        main.showForm(new InvoiceRegistration());
                    }
                }else if(menuIndex==2){
                    main.showForm(new PackageQuotation());
                }else if(menuIndex==3){
                    main.showForm(new Buy());
                }else if(menuIndex==4){
                    main.showForm(new DownloadInvoiceAndGuide());
                }else if(menuIndex==5){
                    main.showForm(new SeeRequestedShipments());
                }else if(menuIndex==6){
                    main.showForm(new Account2());
                }else if(menuIndex==7){
                    main.setVisible(false);
                }
                
            }
            }
        });
        menu.addEventShowPopup(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main2.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main2.this.getX() + 52;
                int y = Main2.this.getY() + com.getY() + 86;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        bg.add(menu, "w 255!, spany 2");    // Span Y 2cell
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 60 + (170 * (1f - fraction));
                } else {
                    width = 85 + (170 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                menu.revalidate();
            }

            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnableMenu(true);
            }

        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnableMenu(false);
                if (menu.isShowMenu()) {
                    menu.hideallMenu();
                }
            }
        });
        //  Init google icon font
        //IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
        //  Start with this form
        main.showForm(new Form_Home());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);
        bg.setPreferredSize(new java.awt.Dimension(1366, 783));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
