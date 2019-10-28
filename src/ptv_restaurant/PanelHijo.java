package ptv_restaurant;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Clases para simulación de mi BD
import datos.Productos;
import datos.Notas;
import java.awt.Graphics;

//Para la fuck'n interfaz
import java.beans.PropertyVetoException;
import javax.swing.DesktopManager;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class PanelHijo extends javax.swing.JPanel {

    private final JPanel terraza;
    ArrayList<Productos> catalogo;
    ArrayList<Notas> notas;
    private int folio;

    public PanelHijo(JPanel terraza, ArrayList<Productos> catalogo, int folio) {
        initComponents();
        this.terraza = terraza;
        this.catalogo = catalogo;
        this.folio = folio;
        lb_folio.setText(String.valueOf(folio));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator3 = new javax.swing.JSeparator();
        pn_cuenta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Nota = new javax.swing.JTable();
        btn_atras = new javax.swing.JButton();
        pn_acciones = new javax.swing.JPanel();
        btn_imprCuenta = new javax.swing.JButton();
        btn_notaEnItem = new javax.swing.JButton();
        btn_tranferirMesa = new javax.swing.JButton();
        pn_tomaComanda = new javax.swing.JPanel();
        btn_clienteReg = new javax.swing.JButton();
        btn_pagar = new javax.swing.JButton();
        btn_borrarItem = new javax.swing.JButton();
        btn_cantidad = new javax.swing.JToggleButton();
        btn_descuento = new javax.swing.JToggleButton();
        btn_precio = new javax.swing.JToggleButton();
        btn_num1 = new javax.swing.JButton();
        btn_num2 = new javax.swing.JButton();
        btn_num3 = new javax.swing.JButton();
        btn_num6 = new javax.swing.JButton();
        btn_num5 = new javax.swing.JButton();
        btn_num4 = new javax.swing.JButton();
        btn_num9 = new javax.swing.JButton();
        btn_num7 = new javax.swing.JButton();
        btn_num8 = new javax.swing.JButton();
        btn_borrarItem10 = new javax.swing.JButton();
        btn_borrarItem11 = new javax.swing.JButton();
        btn_borrarItem12 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_folio = new javax.swing.JLabel();
        tp_categorias = new javax.swing.JTabbedPane();
        pn_platillos = new javax.swing.JPanel();
        btn_pizzaPlatillos = new javax.swing.JButton();
        btn_hamburguesaPlatillos = new javax.swing.JButton();
        btn_molePlatillos = new javax.swing.JButton();
        pn_bebidasFrias = new javax.swing.JPanel();
        btn_cervezaBebidas = new javax.swing.JButton();
        pn_bebidasCalientes = new javax.swing.JPanel();
        btn_cafeBCalientes = new javax.swing.JButton();
        pn_postres = new javax.swing.JPanel();
        btn_pastelPostres = new javax.swing.JButton();
        pn_snacks = new javax.swing.JPanel();
        btn_nachosSnacks = new javax.swing.JButton();
        btn_alitasSnacks = new javax.swing.JButton();
        pn_general = new javax.swing.JPanel();
        btn_hamburguesa = new javax.swing.JButton();
        btn_cafe = new javax.swing.JButton();
        btn_nachos = new javax.swing.JButton();
        btn_pastel = new javax.swing.JButton();
        btn_cerveza = new javax.swing.JButton();
        btn_mole = new javax.swing.JButton();
        btn_pizza = new javax.swing.JButton();
        btn_alitas = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        pn_cuenta.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("TOTAL:   $");

        lbl_total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_total.setText("0.00");

        tb_Nota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Nota.setGridColor(new java.awt.Color(252, 252, 252));
        jScrollPane1.setViewportView(tb_Nota);

        btn_atras.setBackground(new java.awt.Color(110, 200, 155));
        btn_atras.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(225, 225, 225));
        btn_atras.setText("<<");
        btn_atras.setToolTipText("atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        pn_acciones.setBackground(new java.awt.Color(255, 255, 255));

        btn_imprCuenta.setBackground(new java.awt.Color(255, 255, 255));
        btn_imprCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/print_nota.png"))); // NOI18N
        btn_imprCuenta.setText("Cuenta");
        btn_imprCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprCuentaActionPerformed(evt);
            }
        });

        btn_notaEnItem.setBackground(new java.awt.Color(255, 255, 255));
        btn_notaEnItem.setText("Nota");
        btn_notaEnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notaEnItemActionPerformed(evt);
            }
        });

        btn_tranferirMesa.setBackground(new java.awt.Color(255, 255, 255));
        btn_tranferirMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/cambiar.png"))); // NOI18N
        btn_tranferirMesa.setText("Transferir");

        pn_tomaComanda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_clienteReg.setBackground(new java.awt.Color(255, 255, 255));
        btn_clienteReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/cliete.png"))); // NOI18N
        btn_clienteReg.setText("Cliente");
        pn_tomaComanda.add(btn_clienteReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 88, 124));

        btn_pagar.setBackground(new java.awt.Color(255, 255, 255));
        btn_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/pagar.png"))); // NOI18N
        btn_pagar.setText("pagar");
        pn_tomaComanda.add(btn_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 88, 161));

        btn_borrarItem.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/borrar.png"))); // NOI18N
        pn_tomaComanda.add(btn_borrarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 228, 55, 63));

        btn_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_cantidad);
        btn_cantidad.setText("Cant.");
        pn_tomaComanda.add(btn_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 12, 55, 60));

        btn_descuento.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_descuento);
        btn_descuento.setText("Desc");
        pn_tomaComanda.add(btn_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 84, 55, 59));

        btn_precio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_precio);
        btn_precio.setText("Precio");
        pn_tomaComanda.add(btn_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 162, 55, 57));

        btn_num1.setBackground(new java.awt.Color(255, 255, 255));
        btn_num1.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num1.setText("1");
        pn_tomaComanda.add(btn_num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, 94, 78));

        btn_num2.setBackground(new java.awt.Color(255, 255, 255));
        btn_num2.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num2.setText("2");
        pn_tomaComanda.add(btn_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 0, 94, 78));

        btn_num3.setBackground(new java.awt.Color(255, 255, 255));
        btn_num3.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num3.setText("3");
        pn_tomaComanda.add(btn_num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 0, 96, 78));

        btn_num6.setBackground(new java.awt.Color(255, 255, 255));
        btn_num6.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num6.setText("6");
        pn_tomaComanda.add(btn_num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 84, 96, 69));

        btn_num5.setBackground(new java.awt.Color(255, 255, 255));
        btn_num5.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num5.setText("5");
        pn_tomaComanda.add(btn_num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 84, 94, 69));

        btn_num4.setBackground(new java.awt.Color(255, 255, 255));
        btn_num4.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num4.setText("4");
        pn_tomaComanda.add(btn_num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 84, 94, 69));

        btn_num9.setBackground(new java.awt.Color(255, 255, 255));
        btn_num9.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num9.setText("9");
        pn_tomaComanda.add(btn_num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 157, 97, 68));

        btn_num7.setBackground(new java.awt.Color(255, 255, 255));
        btn_num7.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num7.setText("7");
        pn_tomaComanda.add(btn_num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 157, 95, 68));

        btn_num8.setBackground(new java.awt.Color(255, 255, 255));
        btn_num8.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num8.setText("8");
        pn_tomaComanda.add(btn_num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 157, 95, 68));

        btn_borrarItem10.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem10.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_borrarItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/mas_menos.png"))); // NOI18N
        pn_tomaComanda.add(btn_borrarItem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 100, 60));

        btn_borrarItem11.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem11.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_borrarItem11.setText(".");
        pn_tomaComanda.add(btn_borrarItem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 231, 87, 60));

        btn_borrarItem12.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem12.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_borrarItem12.setText("0");
        pn_tomaComanda.add(btn_borrarItem12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 93, 60));

        javax.swing.GroupLayout pn_accionesLayout = new javax.swing.GroupLayout(pn_acciones);
        pn_acciones.setLayout(pn_accionesLayout);
        pn_accionesLayout.setHorizontalGroup(
            pn_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_accionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_accionesLayout.createSequentialGroup()
                        .addComponent(btn_notaEnItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_tranferirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_imprCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_tomaComanda, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_accionesLayout.setVerticalGroup(
            pn_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_accionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_accionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_notaEnItem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tranferirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_imprCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_tomaComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("FOLIO:");

        lb_folio.setText(" ");

        javax.swing.GroupLayout pn_cuentaLayout = new javax.swing.GroupLayout(pn_cuenta);
        pn_cuenta.setLayout(pn_cuentaLayout);
        pn_cuentaLayout.setHorizontalGroup(
            pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cuentaLayout.createSequentialGroup()
                .addGroup(pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cuentaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(pn_cuentaLayout.createSequentialGroup()
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_folio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pn_acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_cuentaLayout.setVerticalGroup(
            pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cuentaLayout.createSequentialGroup()
                .addGroup(pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lb_folio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_acciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tp_categorias.setBackground(new java.awt.Color(255, 255, 255));

        pn_platillos.setBackground(new java.awt.Color(255, 255, 255));
        pn_platillos.setLayout(null);

        btn_pizzaPlatillos.setBackground(new java.awt.Color(255, 255, 255));
        btn_pizzaPlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/pizza.png"))); // NOI18N
        pn_platillos.add(btn_pizzaPlatillos);
        btn_pizzaPlatillos.setBounds(12, 12, 170, 170);

        btn_hamburguesaPlatillos.setBackground(new java.awt.Color(255, 255, 255));
        btn_hamburguesaPlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/hamburguesa.png"))); // NOI18N
        pn_platillos.add(btn_hamburguesaPlatillos);
        btn_hamburguesaPlatillos.setBounds(188, 12, 170, 170);

        btn_molePlatillos.setBackground(new java.awt.Color(255, 255, 255));
        btn_molePlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/mole.jpg"))); // NOI18N
        pn_platillos.add(btn_molePlatillos);
        btn_molePlatillos.setBounds(364, 12, 170, 170);

        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/platillos.png")), pn_platillos, "PLATILLOS"); // NOI18N

        pn_bebidasFrias.setBackground(new java.awt.Color(255, 255, 255));
        pn_bebidasFrias.setLayout(null);

        btn_cervezaBebidas.setBackground(new java.awt.Color(255, 255, 255));
        btn_cervezaBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/cerveza.png"))); // NOI18N
        pn_bebidasFrias.add(btn_cervezaBebidas);
        btn_cervezaBebidas.setBounds(12, 12, 170, 170);

        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/b_frias.png")), pn_bebidasFrias, "BEBIDAS FRIAS"); // NOI18N

        pn_bebidasCalientes.setBackground(new java.awt.Color(255, 255, 255));
        pn_bebidasCalientes.setLayout(null);

        btn_cafeBCalientes.setBackground(new java.awt.Color(255, 255, 255));
        btn_cafeBCalientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/taza-de-cafe.png"))); // NOI18N
        pn_bebidasCalientes.add(btn_cafeBCalientes);
        btn_cafeBCalientes.setBounds(12, 12, 170, 170);

        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/b_calientes.png")), pn_bebidasCalientes, "BEBIDAS CALIENTES"); // NOI18N

        pn_postres.setBackground(new java.awt.Color(255, 255, 255));
        pn_postres.setLayout(null);

        btn_pastelPostres.setBackground(new java.awt.Color(255, 255, 255));
        btn_pastelPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/pastel.png"))); // NOI18N
        pn_postres.add(btn_pastelPostres);
        btn_pastelPostres.setBounds(12, 12, 170, 170);

        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/pastel-dulce.png")), pn_postres, "POSTRES"); // NOI18N

        pn_snacks.setBackground(new java.awt.Color(255, 255, 255));
        pn_snacks.setLayout(null);

        btn_nachosSnacks.setBackground(new java.awt.Color(255, 255, 255));
        btn_nachosSnacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/nachos.png"))); // NOI18N
        pn_snacks.add(btn_nachosSnacks);
        btn_nachosSnacks.setBounds(12, 12, 170, 170);

        btn_alitasSnacks.setBackground(new java.awt.Color(255, 255, 255));
        btn_alitasSnacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/alitas-de-pollo.png"))); // NOI18N
        pn_snacks.add(btn_alitasSnacks);
        btn_alitasSnacks.setBounds(188, 12, 170, 170);

        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/snacks.png")), pn_snacks, "SNACKS"); // NOI18N

        pn_general.setBackground(new java.awt.Color(255, 255, 255));
        pn_general.setLayout(null);

        btn_hamburguesa.setBackground(new java.awt.Color(255, 255, 255));
        btn_hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/hamburguesa.png"))); // NOI18N
        btn_hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hamburguesaActionPerformed(evt);
            }
        });
        pn_general.add(btn_hamburguesa);
        btn_hamburguesa.setBounds(12, 12, 170, 170);

        btn_cafe.setBackground(new java.awt.Color(255, 255, 255));
        btn_cafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/taza-de-cafe.png"))); // NOI18N
        btn_cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cafeActionPerformed(evt);
            }
        });
        pn_general.add(btn_cafe);
        btn_cafe.setBounds(188, 12, 170, 170);

        btn_nachos.setBackground(new java.awt.Color(255, 255, 255));
        btn_nachos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/nachos.png"))); // NOI18N
        pn_general.add(btn_nachos);
        btn_nachos.setBounds(364, 12, 170, 170);

        btn_pastel.setBackground(new java.awt.Color(255, 255, 255));
        btn_pastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/pastel.png"))); // NOI18N
        pn_general.add(btn_pastel);
        btn_pastel.setBounds(364, 188, 170, 170);

        btn_cerveza.setBackground(new java.awt.Color(255, 255, 255));
        btn_cerveza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/cerveza.png"))); // NOI18N
        pn_general.add(btn_cerveza);
        btn_cerveza.setBounds(12, 188, 170, 170);

        btn_mole.setBackground(new java.awt.Color(255, 255, 255));
        btn_mole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/mole.jpg"))); // NOI18N
        pn_general.add(btn_mole);
        btn_mole.setBounds(188, 188, 170, 170);

        btn_pizza.setBackground(new java.awt.Color(255, 255, 255));
        btn_pizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/pizza.png"))); // NOI18N
        pn_general.add(btn_pizza);
        btn_pizza.setBounds(12, 364, 170, 170);

        btn_alitas.setBackground(new java.awt.Color(255, 255, 255));
        btn_alitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_Catalogo/alitas-de-pollo.png"))); // NOI18N
        pn_general.add(btn_alitas);
        btn_alitas.setBounds(188, 364, 170, 170);

        tp_categorias.addTab("GENERAL", pn_general);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(544, 544, 544)
                .addComponent(tp_categorias)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(pn_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(570, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tp_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(pn_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
// Se imprime la nota de venta
    private void btn_imprCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprCuentaActionPerformed
        //Se imprime la nota de venta
        String n = "\t\nfolio: " +folio +"\n\t";
        int r = 0;
        for (Productos p : nota) {
            n+= tb_Nota.getValueAt(r, 0) + "";
            n+= tb_Nota.getValueAt(r, 1) + " ";
            n+= tb_Nota.getValueAt(r, 2) + "\n\t";
            r++;
        }
        
        TEXTOAREA a = new TEXTOAREA(n);
        try {
            a.getTa_Nota().print();
        } catch (PrinterException ex) {
            Logger.getLogger(PanelHijo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_imprCuentaActionPerformed
    //Para minimizar ventana
    JInternalFrame minimiza;
    DesktopManager ventanasAbiertas;
    JDesktopPane escritorio;

    public void mini(JInternalFrame minimiza, JDesktopPane escritorio) throws PropertyVetoException {
        this.minimiza = minimiza;

        if (escritorio.getAllFrames().length == 0) {
            for (JInternalFrame i : escritorio.getAllFrames()) {
                ventanasAbiertas.iconifyFrame(i);
            }
        }

        terraza.setVisible(false);
    }

    //Metodo para mostrar terraza luego de que quiere hacer otra operación fuera de la mesa
    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed

        try {
            minimiza.setIcon(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PanelHijo.class.getName()).log(Level.SEVERE, null, ex);
        }
        terraza.setVisible(true);

    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_notaEnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notaEnItemActionPerformed

        //JOptionPane.showInputDialog(leer);
        String mensaje = "Añadir nota";
        String nota = JOptionPane.showInputDialog(mensaje);

    }//GEN-LAST:event_btn_notaEnItemActionPerformed

    private int clicsHamburguesa = 0;
    private void btn_hamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hamburguesaActionPerformed
        clicsHamburguesa++;
        Productos p = catalogo.get(1);
        generadorNota(p, clicsHamburguesa);
    }//GEN-LAST:event_btn_hamburguesaActionPerformed
    private int clicsCafe = 0;
    private void btn_cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cafeActionPerformed
        clicsCafe++;
        Productos p = catalogo.get(2);
        generadorNota(p, clicsCafe);
    }//GEN-LAST:event_btn_cafeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alitas;
    private javax.swing.JButton btn_alitasSnacks;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_borrarItem;
    private javax.swing.JButton btn_borrarItem10;
    private javax.swing.JButton btn_borrarItem11;
    private javax.swing.JButton btn_borrarItem12;
    private javax.swing.JButton btn_cafe;
    private javax.swing.JButton btn_cafeBCalientes;
    private javax.swing.JToggleButton btn_cantidad;
    private javax.swing.JButton btn_cerveza;
    private javax.swing.JButton btn_cervezaBebidas;
    private javax.swing.JButton btn_clienteReg;
    private javax.swing.JToggleButton btn_descuento;
    private javax.swing.JButton btn_hamburguesa;
    private javax.swing.JButton btn_hamburguesaPlatillos;
    private javax.swing.JButton btn_imprCuenta;
    private javax.swing.JButton btn_mole;
    private javax.swing.JButton btn_molePlatillos;
    private javax.swing.JButton btn_nachos;
    private javax.swing.JButton btn_nachosSnacks;
    private javax.swing.JButton btn_notaEnItem;
    private javax.swing.JButton btn_num1;
    private javax.swing.JButton btn_num2;
    private javax.swing.JButton btn_num3;
    private javax.swing.JButton btn_num4;
    private javax.swing.JButton btn_num5;
    private javax.swing.JButton btn_num6;
    private javax.swing.JButton btn_num7;
    private javax.swing.JButton btn_num8;
    private javax.swing.JButton btn_num9;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JButton btn_pastel;
    private javax.swing.JButton btn_pastelPostres;
    private javax.swing.JButton btn_pizza;
    private javax.swing.JButton btn_pizzaPlatillos;
    private javax.swing.JToggleButton btn_precio;
    private javax.swing.JButton btn_tranferirMesa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_folio;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel pn_acciones;
    private javax.swing.JPanel pn_bebidasCalientes;
    private javax.swing.JPanel pn_bebidasFrias;
    private javax.swing.JPanel pn_cuenta;
    private javax.swing.JPanel pn_general;
    private javax.swing.JPanel pn_platillos;
    private javax.swing.JPanel pn_postres;
    private javax.swing.JPanel pn_snacks;
    private javax.swing.JPanel pn_tomaComanda;
    private javax.swing.JTable tb_Nota;
    private javax.swing.JTabbedPane tp_categorias;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Productos> nota = new ArrayList<>();

    public void generadorNota(Productos añadido, int cantidad) {
        tb_Nota.clearSelection();

        //Se agrega producto si la lista está vacia
        if (nota.isEmpty()) {
            nota.add(añadido);
        } else {
            nota.add(añadido);
        }

        //Se agrega una unidad al producto vendido
        for (Productos p : nota) {
            if (p == añadido) {
                p.setUnidades(cantidad + 1);
            }
        }

        //Se le restan las unidades compradas
        añadido.setUnidades(añadido.getUnidades() - 1);
        //Se actualiza la cantidad de producto disponible
        Productos nuevo = añadido;
        //Se actualiza el caalogo
        catalogo.set(añadido.getSku(), nuevo);

        //Se imprime producto en nota de venta
        int r = 0;
        for (Productos p : nota) {
            tb_Nota.setValueAt(p.getNombre(), r, 0);
            tb_Nota.setValueAt(cantidad, r, 1);
            tb_Nota.setValueAt(p.getPrecio() * cantidad, r, 2);
            r++;
        }

        int total = 0;
        for (Productos p : nota) {
            total += p.getPrecio();
        }
        lbl_total.setText(String.valueOf(total));

    }
}
