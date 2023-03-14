
package dashboard.style.menu;

import Dashboard.style.menu.MenuAnimation;
import Dashboard.style.menu.MenuItem;
import InitialData.SG;



import dashboard.style.ScrollBarCustom;
import dashboard.style.ScrollBarCustom;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javaswingdev.GoogleMaterialDesignIcon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class Menu1 extends javax.swing.JPanel {

    public boolean isShowMenu() {
        return showMenu;
    }

    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public void addEventShowPopup(EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }

    private final MigLayout layout;
    private EventMenuSelected event;
    private EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public Menu1() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }

    public void initMenuItem() {
         addMenu(new ModelMenu(GoogleMaterialDesignIcon.DASHBOARD, "Dashboard"));
     if(SG.getSESSION_ROLE()==0){
        
        
        
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ACCESSIBILITY, "Kioscos"));
        
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ACCOUNT_BALANCE_WALLET, "Regiones y precios"));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ADD_LOCATION, "Departamentos y Municipios", "Añadir Departamentos", "Añadir Municipios"));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.SEARCH, "Reportes", "Regiones con mas envios", "Total de paquetes enviados", "Ingreso totales", "Usuarios com mas paquetes", "Listado de usuarios"));
        
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ACCOUNT_BOX, "Cuenta"));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.EXIT_TO_APP, "Cerrar Sesion"));
     
        
}else if(SG.getSESSION_ROLE()==1){
        
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ADD, "Registro de datos", "Registro de tarjeta","Registro de facturacion"));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ATTACH_MONEY, "Cotizacion de paquetes"));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.BUSINESS, "Compra"));
        
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.FILE_DOWNLOAD, "Descargar factura / Guía "));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.SEARCH, "Ver envios solicitados"));        
        
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.ACCOUNT_BOX, "Cuenta"));
        addMenu(new ModelMenu(GoogleMaterialDesignIcon.EXIT_TO_APP, "Cerrar Sesion"));
        
        //}    
        /*addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/2.png")), "Charts", "Morris", "Flot", "Line"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/3.png")), "Report", "Income", "Expense", "Profit"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/4.png")), "Message", "Sender", "Inbox", "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/5.png")), "Staff", "Sender", "Inbox", "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/6.png")), "Student", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/7.png")), "Library", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/8.png")), "Holiday", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/9.png")), "Calendar", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("../../icon/10.png")), "Chat App", "Menu 001", "Menu 002", "Menu 003"));

*/
}
    }

    private void addMenu(ModelMenu menu) {
        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }

    private EventMenu getEventMenu() {
        return new EventMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {
                if (enableMenu) {
                    if (isShowMenu()) {
                        if (open) {
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    } else {
                        eventShowPopup.showPopup(com);
                    }
                }
                return false;
            }
        };
    }

    public void hideallMenu() {
        for (Component com : panel.getComponents()) {
            MenuItem item = (MenuItem) com;
            if (item.isOpen()) {
                new MenuAnimation(layout, com, 500).closeMenu();
                item.setOpen(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        profile1 = new dashboard.style.Profile();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(33, 105, 249), getWidth(), 0, new Color(93, 58, 196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel;
    private dashboard.style.Profile profile1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
