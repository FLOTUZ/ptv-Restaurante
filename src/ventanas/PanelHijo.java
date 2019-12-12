package ventanas;

import Conector.Conector;
import DAO_Y_VO.ClienteVO;
import DAO_Y_VO.NotaVentaDAO;
import DAO_Y_VO.Nota_VentaVO;
import DAO_Y_VO.ProductoDAO;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Para la fuck'n interfaz
import java.beans.PropertyVetoException;
import javax.swing.DesktopManager;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import DAO_Y_VO.ProductoVO;
import DAO_Y_VO.RenglonesDAO;
import DAO_Y_VO.RenglonesVO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;
import javax.swing.JDialog;

public class PanelHijo extends javax.swing.JPanel {

    private final JPanel terraza;
    ArrayList<ProductoVO> catalogo;
    ArrayList<ClienteVO> cliente;
    private int folio;
    JDesktopPane escritorio;
    private final JInternalFrame frame;

    public PanelHijo(JPanel terraza, int folio, ArrayList<ClienteVO> cliente, JDesktopPane escritorio, JInternalFrame frame) {
        
        initComponents();
        this.nota = new ArrayList<>();
        this.terraza = terraza;
        this.catalogo = new ArrayList<>();
        this.folio = folio;
        lb_folio.setText(String.valueOf(folio));
        this.cliente = cliente;
        this.escritorio = escritorio;
        this.frame = frame;
        llenarCbx_clientes();
        llenar_catalogo();
        llenar_btns_catalog();
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
        cbx_cliente = new javax.swing.JComboBox<>();
        tp_categorias = new javax.swing.JTabbedPane();
        pn_platillos = new javax.swing.JPanel();
        pn_bebidasFrias = new javax.swing.JPanel();
        pn_bebidasCalientes = new javax.swing.JPanel();
        pn_postres = new javax.swing.JPanel();
        pn_snacks = new javax.swing.JPanel();
        pn_general = new javax.swing.JPanel();
        pn_botones_catalogo = new javax.swing.JScrollPane();
        pn_botones_con = new javax.swing.JPanel();

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

        btn_pagar.setBackground(new java.awt.Color(255, 255, 255));
        btn_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/pagar.png"))); // NOI18N
        btn_pagar.setText("pagar");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });

        btn_borrarItem.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/borrar.png"))); // NOI18N

        btn_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_cantidad);
        btn_cantidad.setText("Cant.");

        btn_descuento.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_descuento);
        btn_descuento.setText("Desc");

        btn_precio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btn_precio);
        btn_precio.setText("Precio");

        btn_num1.setBackground(new java.awt.Color(255, 255, 255));
        btn_num1.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num1.setText("1");

        btn_num2.setBackground(new java.awt.Color(255, 255, 255));
        btn_num2.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num2.setText("2");

        btn_num3.setBackground(new java.awt.Color(255, 255, 255));
        btn_num3.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num3.setText("3");

        btn_num6.setBackground(new java.awt.Color(255, 255, 255));
        btn_num6.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num6.setText("6");

        btn_num5.setBackground(new java.awt.Color(255, 255, 255));
        btn_num5.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num5.setText("5");

        btn_num4.setBackground(new java.awt.Color(255, 255, 255));
        btn_num4.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num4.setText("4");

        btn_num9.setBackground(new java.awt.Color(255, 255, 255));
        btn_num9.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num9.setText("9");

        btn_num7.setBackground(new java.awt.Color(255, 255, 255));
        btn_num7.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num7.setText("7");

        btn_num8.setBackground(new java.awt.Color(255, 255, 255));
        btn_num8.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_num8.setText("8");

        btn_borrarItem10.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem10.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_borrarItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/mas_menos.png"))); // NOI18N

        btn_borrarItem11.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem11.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_borrarItem11.setText(".");

        btn_borrarItem12.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarItem12.setFont(new java.awt.Font("Lato Semibold", 0, 22)); // NOI18N
        btn_borrarItem12.setText("0");

        javax.swing.GroupLayout pn_tomaComandaLayout = new javax.swing.GroupLayout(pn_tomaComanda);
        pn_tomaComanda.setLayout(pn_tomaComandaLayout);
        pn_tomaComandaLayout.setHorizontalGroup(
            pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                .addComponent(btn_pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_borrarItem10, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_num8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrarItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_num3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_num6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_num9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_borrarItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(btn_borrarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_tomaComandaLayout.setVerticalGroup(
            pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                        .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_num3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(btn_num9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btn_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_borrarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))
                    .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                        .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_tomaComandaLayout.createSequentialGroup()
                                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_num4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_num5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_num6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_num8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_num7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_tomaComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_borrarItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_borrarItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_borrarItem10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

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
                    .addComponent(pn_tomaComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(pn_tomaComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbx_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(pn_acciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_cuentaLayout.setVerticalGroup(
            pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_cuentaLayout.createSequentialGroup()
                .addGroup(pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(lb_folio))
                    .addGroup(pn_cuentaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbx_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/platillos.png")), pn_platillos, "PLATILLOS"); // NOI18N

        pn_bebidasFrias.setBackground(new java.awt.Color(255, 255, 255));
        pn_bebidasFrias.setLayout(null);
        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/b_frias.png")), pn_bebidasFrias, "BEBIDAS FRIAS"); // NOI18N

        pn_bebidasCalientes.setBackground(new java.awt.Color(255, 255, 255));
        pn_bebidasCalientes.setLayout(null);
        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/b_calientes.png")), pn_bebidasCalientes, "BEBIDAS CALIENTES"); // NOI18N

        pn_postres.setBackground(new java.awt.Color(255, 255, 255));
        pn_postres.setLayout(null);
        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/pastel-dulce.png")), pn_postres, "POSTRES"); // NOI18N

        pn_snacks.setBackground(new java.awt.Color(255, 255, 255));
        pn_snacks.setLayout(null);
        tp_categorias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iconos/ParaPos/snacks.png")), pn_snacks, "SNACKS"); // NOI18N

        pn_general.setBackground(new java.awt.Color(255, 255, 255));

        pn_botones_con.setLayout(new java.awt.GridLayout(0, 3));
        pn_botones_catalogo.setViewportView(pn_botones_con);

        javax.swing.GroupLayout pn_generalLayout = new javax.swing.GroupLayout(pn_general);
        pn_general.setLayout(pn_generalLayout);
        pn_generalLayout.setHorizontalGroup(
            pn_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_generalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_botones_catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_generalLayout.setVerticalGroup(
            pn_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_generalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_botones_catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );

        tp_categorias.addTab("GENERAL", pn_general);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(647, Short.MAX_VALUE)
                .addComponent(tp_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(pn_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tp_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(pn_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
// Se imprime la nota de venta
    private void btn_imprCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprCuentaActionPerformed
        //Se agregan los productos
        String n = "";
        int confirm = 0;
        try {
            n = "\t\n\t\tfolio: " + folio + "\n\t";
            int r = 0;

            for (int i = 0; i < nota.size(); i++) {
                n += tb_Nota.getValueAt(r, 0) + "\t";
                n += tb_Nota.getValueAt(r, 1) + "\t";
                n += tb_Nota.getValueAt(r, 2) + "\n\t";
                r++;
            }
        } catch (Exception e) {
            confirm = JOptionPane.showInternalConfirmDialog(this, "La nota está vacía ¿Desea continuar?");
            System.out.println(e);
        }
        n += "\n\t\t    Total a pagar: " + lbl_total.getText();
        n += "\n\t¡ Gracias por comer con nostros !";

        //Se imprime la nota de venta
        TEXTOAREA a = new TEXTOAREA(n);
        try {
            a.getTa_Nota().print();
        } catch (PrinterException ex) {
            Logger.getLogger(PanelHijo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Devuelve el cliente
        int client = cbx_cliente.getSelectedIndex()+1;
        //Devuelve el numero del titulo de la orden
        int mesa = Integer.parseInt(frame.getTitle().substring(1));
        //Se obtiene el valor de lbl_total
        double total = Integer.parseInt(lbl_total.getText());
        
        altaNota(client, mesa, total);
        meter_renglonesToBD();

    }//GEN-LAST:event_btn_imprCuentaActionPerformed
    //Para minimizar ventana
    JInternalFrame minimiza;
    DesktopManager ventanasAbiertas;

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

    private int regresaClienteSeleccionado(int i) {
        return i;
    }
    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        JInternalFrame frame = new JInternalFrame("", false, true);
        Pasarela_Pago pago = new Pasarela_Pago(lbl_total.getText(), escritorio);

        frame.add(pago);
        frame.pack();
        frame.setLocation(200, 80);
        frame.setTitle("P A G U E");
        frame.setVisible(true);
        escritorio.add(frame);
        escritorio.getDesktopManager().activateFrame(frame);        

    }//GEN-LAST:event_btn_pagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_borrarItem;
    private javax.swing.JButton btn_borrarItem10;
    private javax.swing.JButton btn_borrarItem11;
    private javax.swing.JButton btn_borrarItem12;
    private javax.swing.JToggleButton btn_cantidad;
    private javax.swing.JToggleButton btn_descuento;
    private javax.swing.JButton btn_imprCuenta;
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
    private javax.swing.JToggleButton btn_precio;
    private javax.swing.JButton btn_tranferirMesa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbx_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_folio;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel pn_acciones;
    private javax.swing.JPanel pn_bebidasCalientes;
    private javax.swing.JPanel pn_bebidasFrias;
    private javax.swing.JScrollPane pn_botones_catalogo;
    private javax.swing.JPanel pn_botones_con;
    private javax.swing.JPanel pn_cuenta;
    private javax.swing.JPanel pn_general;
    private javax.swing.JPanel pn_platillos;
    private javax.swing.JPanel pn_postres;
    private javax.swing.JPanel pn_snacks;
    private javax.swing.JPanel pn_tomaComanda;
    private javax.swing.JTable tb_Nota;
    private javax.swing.JTabbedPane tp_categorias;
    // End of variables declaration//GEN-END:variables

    private ArrayList<ProductoVO> nota;

    public void generadorNota(ProductoVO añadido, int cantidad) {
        //Nombre    Cantidad    total
        //Se imprime producto en nota de venta

        //Se agrega producto si la lista está vacia
        nota.add(añadido);

        int r = 0;
        for (ProductoVO p : nota) {
            tb_Nota.setValueAt(p.getNombre(), r, 0);
            tb_Nota.setValueAt(cantidad, r, 1);
            tb_Nota.setValueAt(p.getPrecio_unitario() * cantidad, r, 2);
            r++;
        }

        int total = 0;
        for (ProductoVO p : nota) {
            total += p.getPrecio_unitario();
        }
        lbl_total.setText(String.valueOf(total));

    }

    //Para cerrar despues de reallizar el pago
    public void disponse() {
        this.disponse();
    }

    public void llenar_btns_catalog() {

        //Se recorre la lista de productos
        for (ProductoVO p : catalogo) {
            //Se crea nuevo botón | Se seta el nombre del producto p
            BtnPersonalizado btn = new BtnPersonalizado();
            btn.setText(p.getNombre());

            btn.setProducto(p);
            //Se agrega al panel de botones
            pn_botones_con.add(btn);

            btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    //Se obtiene el producto del boton y las veces presionadas
                    ProductoVO añadido = btn.getProducto();
                    int cant = btn.getPresionado();
                    btn.setPresionado(cant++);
                    //Se pasa a nota
                    generadorNota(añadido, cant);
                }
            });
        }

        pn_botones_con.updateUI();

    }

    private void llenar_catalogo() {
        Connection con = new Conector().conectarMySQL();
        ProductoDAO dame = new ProductoDAO(con);

        catalogo = dame.consultaMasiva();
    }

    private void meter_renglonesToBD() {
        ArrayList<RenglonesVO> lista_renglones = new ArrayList<>();
        NotaVentaDAO ndao = new NotaVentaDAO(new Conector().conectarMySQL());
        RenglonesDAO renDao = new RenglonesDAO(new Conector().conectarMySQL());
        
        for (ProductoVO prod : nota) {

            //Se genera el renglon a partir de los siguientes datos
            int cantidad = dame_Cantidad(prod);
            int idProducto = prod.getId_producto();
            double subtotal = (double) (prod.getPrecio_unitario() * cantidad);
            int folio = ndao.ultimaNota();
            int idCliente = cbx_cliente.getSelectedIndex()+1;
            
            //Se crea el nuevo renglon
            RenglonesVO reng = new RenglonesVO();
            reng.setCantidad(cantidad);
            reng.setSubtotal(subtotal);
            reng.setProducto_idProducto(idProducto);
            reng.setNotas_venta_idnotas_folio(folio);
            reng.setNotas_venta_clientes_idclientes(idCliente);
            
            lista_renglones.add(reng);       
        }
        
        //Se dan de alta renglones a BD
        for (RenglonesVO ren : lista_renglones) {
            renDao.altaRenglon(ren);
        }
        
        if (JOptionPane.showConfirmDialog(null, "Desea cerrar nota de esta mesa?" ) == 0) {
            frame.dispose();
            terraza.setVisible(true);
        }
        
    }

    private int dame_Cantidad(ProductoVO prod) {
        int cant = 0;
        //Dame su id
        int id = prod.getId_producto();

        //Dame otro producto de la nota
        for (ProductoVO p : nota) {
            if (id == p.getId_producto()) {
                cant++;
            }
        }

        return cant;
    }

    private static void altaNota(int cliente, int mesa, Double total) {
        Nota_VentaVO nota = new Nota_VentaVO();
        NotaVentaDAO inserta_en_bd = new NotaVentaDAO(new Conector().conectarMySQL());
        String fecha;
        String hora;

        Date date = new Date();
        //Obtener la hora y formatearlo:
        DateFormat horaFormat = new SimpleDateFormat("HH:mm:ss");
        hora = horaFormat.format(date);

        //Obtener la hora y formatearlo:
        DateFormat fechaFormat = new SimpleDateFormat("yyyy-MM-dd");
        fecha = fechaFormat.format(date);

        nota.setClientes_idclientes(cliente);
        nota.setTotal(total);
        nota.setMesa(mesa);
        nota.setFecha(fecha);
        nota.setHora(hora);

        inserta_en_bd.nuevaNota(nota);
    }

    private void llenarCbx_clientes() {
        
        
        
        for (ClienteVO cl : cliente) {
            cbx_cliente.addItem(cl.getNombre_cliente());
        }
        cbx_cliente.setSelectedIndex(0);
        
    }
}
