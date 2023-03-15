package Dashboard.Admin.Form;


import Dashboard.table.ModelProfile;
import InitialData.Client;
import InitialData.PackageDelivery;
import InitialData.SG;
import InitialData.User;
import dashboard.style.Model_Card;
import dashboard.table.StatusType;
//import java.awt.Color;
//import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {
        
//        initNoticeBoard();
        initTableData();
        initCards();
    }
    
    private void initCards(){
        if (SG.SESSION_ROLE == 0) {
            card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Total de usuarios", SG.user.getLength().toString(), "Incremento del 12%"));
            card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Total de pedidos", SG.packages.getLength().toString(), "Incremento del 25%"));
            card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon//flag.png")), "Total de kioscos", SG.kiosks.getLength().toString(), "Incremento del 30%"));
        } else if (SG.SESSION_ROLE == 1) {
            card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/stock.png")), "Tarjetas de credito", String.valueOf(SG.clientFound.getAllCreditCards().size()), "Incremento del 12%"));
            card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/profit.png")), "Datos de facturacion", String.valueOf(SG.clientFound.getBillingDatas().size()), "Incremento del 25%"));
            card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon//flag.png")), "Total de pedidos", String.valueOf(SG.packages.allPackageClient(SG.clientFound).size()), "Incremento del 30%"));
        }
            
    }
    

    private void initTableData() {
        
        //We added column names
        
        lblWelcome.setText("¡Bievenido "+ SG.userFound.getName()+" "+SG.userFound.getLastName()+"!" );
        //If is admin
        if (SG.SESSION_ROLE == 0) {
           lblNameTable.setText("Listado de usuarios");
            table1.addColumn("Name");
            table1.addColumn("Usuario");
            table1.addColumn("Genero");
            table1.addColumn("Nacionalidad");
            table1.addColumn("Telefono");
            table1.addColumn("Rol");
            table1.addColumn("Estado");
        Integer quantity = SG.user.getUsers().size();
        for (int i = 0; i < quantity; i++) {
            User user =SG.user.getUserRecord(i);
            table1.addRow(new Object[]{new ModelProfile(new ImageIcon(user.getPhoto()), user.getName() + " " + user.getLastName()), user.getUser(), user.getGender(), user.getNationality(),user.getPhoneNumber(), SG.getTypeRole(user.getRole()), StatusType.APPROVED});
        }
        } else if (SG.SESSION_ROLE == 1) {
            lblNameTable.setText("Listado de paquetes");
            table1.addColumn("Paquete");
            table1.addColumn("Origen");
            table1.addColumn("Destino");
            table1.addColumn("Tipo de pago");
            table1.addColumn("Precio");
            table1.addColumn("Estado");
            
        table1.clearTable();
        Integer quantity= SG.packages.allPackageClient(SG.clientFound).size();
        double total=0;
        for (int i = 0; i < quantity; i++) {
            PackageDelivery packageDelivery = (PackageDelivery) SG.packages.allPackageClient(SG.clientFound).get(i);
            Client client = packageDelivery.getClient();
            total= total + packageDelivery.getTotal();
            User user = client.getUser();
            table1.addRow(new Object[]{new ModelProfile(new ImageIcon(getClass().getResource("/icon/package.jpg")), packageDelivery.getDescription()), packageDelivery.getOrigin(), packageDelivery.getDestiny(), SG.getTypeOfPayment(packageDelivery.getPaymentMethod()), packageDelivery.getTotal(), StatusType.PENDING});
        }
        }

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNameTable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Dashboard.table.Table();
        lblWelcome = new javax.swing.JLabel();
        card1 = new dashboard.style.Card1();
        card2 = new dashboard.style.Card1();
        card3 = new dashboard.style.Card1();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Dashboard / Home");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblNameTable.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        lblNameTable.setForeground(new java.awt.Color(76, 76, 76));
        lblNameTable.setText("Data Student");
        lblNameTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNameTable)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 0));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWelcome.setText("¡Bievenido Bruce Castillo!");

        card1.setColor1(new java.awt.Color(153, 51, 255));
        card1.setColor2(new java.awt.Color(204, 0, 204));

        card2.setColor1(new java.awt.Color(51, 153, 255));
        card2.setColor2(new java.awt.Color(0, 102, 153));

        card3.setColor1(new java.awt.Color(255, 51, 51));
        card3.setColor2(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dashboard.style.Card1 card1;
    private dashboard.style.Card1 card2;
    private dashboard.style.Card1 card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameTable;
    private javax.swing.JLabel lblWelcome;
    private Dashboard.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
