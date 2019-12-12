package ventanas;

import Conector.Conector;
import DAO_Y_VO.ClienteDAO;
import DAO_Y_VO.ClienteVO;
import DAO_Y_VO.ProductoDAO;
import DAO_Y_VO.ProductoVO;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author ceo_emmanuel
 */
public class VentanaPadre extends javax.swing.JFrame {

    JDesktopPane escritorio;
    String nombreMesaOprimida;
    private int folio;
    private ArrayList <ClienteVO> clientes;
    
    public VentanaPadre() {
        llenarBD();

        //Inicializamos la variable de escritorio
        escritorio = new JDesktopPane();
        //Inicializamos mesasOcupadas
        mesasOcupadas = new ArrayList<>();
        //Seteamos al escriotorio como un contenedor de paneles
        this.setContentPane(escritorio);

        //Forzamos a que se calcule el tamaño de todos los elementos
        this.pack();

        initComponents();

    }
    
        private void llenarBD() {
        ArrayList<ProductoVO> productos = new ArrayList<>();
        folio = 0;
        clientes = new ArrayList<>();

        Conector con = new Conector();
        
        //Consulta productos de la BD
        ProductoDAO producto = new ProductoDAO(con.conectarMySQL());
        productos = producto.consultaMasiva();
        System.out.println("Hay: "+productos.size() + " productos");
        
        //Consulta clientes de la BD
        ClienteDAO cliente = new ClienteDAO(con.conectarMySQL());
        clientes = cliente.consultaMasiva();
        System.out.println("Hay: "+clientes.size() + " clientes");
        
        con.cerrar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_lugares = new javax.swing.JPanel();
        btn_terraza = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_lobby = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pn_terraza = new javax.swing.JPanel();
        btn_mesa1 = new javax.swing.JButton();
        btn_mesa2 = new javax.swing.JButton();
        btn_mesa3 = new javax.swing.JButton();
        btn_mesa4 = new javax.swing.JButton();
        btn_mesa5 = new javax.swing.JButton();
        btn_mesa6 = new javax.swing.JButton();
        btn_mesa7 = new javax.swing.JButton();
        btn_mesa8 = new javax.swing.JButton();
        btn_barra = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menNuevaOrden = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mi_agregarCliente = new javax.swing.JMenuItem();
        mi_modificarCliente = new javax.swing.JMenuItem();
        mi_agregarProducto = new javax.swing.JMenuItem();
        mi_modificarProducto = new javax.swing.JMenuItem();
        menu_ver = new javax.swing.JMenu();
        mi_buscarNota = new javax.swing.JMenuItem();
        mi_reportes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        sobreNosotros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pn_lugares.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn_terraza.setBackground(new java.awt.Color(239, 237, 237));

        jLabel3.setFont(new java.awt.Font("Lato Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 56, 56));
        jLabel3.setText("Terraza");

        javax.swing.GroupLayout btn_terrazaLayout = new javax.swing.GroupLayout(btn_terraza);
        btn_terraza.setLayout(btn_terrazaLayout);
        btn_terrazaLayout.setHorizontalGroup(
            btn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(btn_terrazaLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(207, 207, 207))
        );
        btn_terrazaLayout.setVerticalGroup(
            btn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_terrazaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_lobby.setBackground(new java.awt.Color(110, 200, 155));

        jLabel2.setFont(new java.awt.Font("Lato Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lobby");

        javax.swing.GroupLayout btn_lobbyLayout = new javax.swing.GroupLayout(btn_lobby);
        btn_lobby.setLayout(btn_lobbyLayout);
        btn_lobbyLayout.setHorizontalGroup(
            btn_lobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_lobbyLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addGap(239, 239, 239))
        );
        btn_lobbyLayout.setVerticalGroup(
            btn_lobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_lobbyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout pn_lugaresLayout = new javax.swing.GroupLayout(pn_lugares);
        pn_lugares.setLayout(pn_lugaresLayout);
        pn_lugaresLayout.setHorizontalGroup(
            pn_lugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_lugaresLayout.createSequentialGroup()
                .addComponent(btn_lobby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_terraza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_lugaresLayout.setVerticalGroup(
            pn_lugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_lobby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_terraza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_terraza.setBackground(new java.awt.Color(230, 230, 230));
        pn_terraza.setBorder(null);

        btn_mesa1.setBackground(new java.awt.Color(53, 211, 116));
        btn_mesa1.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa1.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa1.setText("T1");
        btn_mesa1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa1.setBorderPainted(false);
        btn_mesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa2.setBackground(btn_mesa1.getBackground());
        btn_mesa2.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa2.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa2.setText("T2");
        btn_mesa2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa2.setBorderPainted(false);
        btn_mesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa3.setBackground(btn_mesa1.getBackground());
        btn_mesa3.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa3.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa3.setText("T3");
        btn_mesa3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa3.setBorderPainted(false);
        btn_mesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa4.setBackground(new java.awt.Color(222, 67, 78));
        btn_mesa4.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa4.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa4.setText("T4");
        btn_mesa4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa4.setBorderPainted(false);
        btn_mesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa5.setBackground(new java.awt.Color(108, 109, 236));
        btn_mesa5.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa5.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa5.setText("T5");
        btn_mesa5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa5.setBorderPainted(false);
        btn_mesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa6.setBackground(btn_mesa1.getBackground());
        btn_mesa6.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa6.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa6.setText("T6");
        btn_mesa6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa6.setBorderPainted(false);
        btn_mesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa7.setBackground(btn_mesa1.getBackground());
        btn_mesa7.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa7.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa7.setText("T7");
        btn_mesa7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa7.setBorderPainted(false);
        btn_mesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_mesa8.setBackground(btn_mesa1.getBackground());
        btn_mesa8.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_mesa8.setForeground(new java.awt.Color(253, 251, 251));
        btn_mesa8.setText("T8");
        btn_mesa8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mesa8.setBorderPainted(false);
        btn_mesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentana(evt);
            }
        });

        btn_barra.setBackground(new java.awt.Color(235, 191, 109));
        btn_barra.setFont(new java.awt.Font("Lato Semibold", 0, 14)); // NOI18N
        btn_barra.setForeground(new java.awt.Color(253, 251, 251));
        btn_barra.setText("B A R R A");
        btn_barra.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_barra.setBorderPainted(false);

        javax.swing.GroupLayout pn_terrazaLayout = new javax.swing.GroupLayout(pn_terraza);
        pn_terraza.setLayout(pn_terrazaLayout);
        pn_terrazaLayout.setHorizontalGroup(
            pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_terrazaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_mesa2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(btn_mesa1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mesa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(188, 188, 188)
                .addGroup(pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_mesa5, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(btn_mesa4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(209, 209, 209)
                .addGroup(pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mesa7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mesa8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mesa6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
            .addGroup(pn_terrazaLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btn_barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(164, 164, 164))
        );
        pn_terrazaLayout.setVerticalGroup(
            pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_terrazaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_terrazaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pn_terrazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_terrazaLayout.createSequentialGroup()
                                .addComponent(btn_mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btn_mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_terrazaLayout.createSequentialGroup()
                                .addComponent(btn_mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btn_mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pn_terrazaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btn_mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );

        jMenu1.setText("Tools");

        menNuevaOrden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menNuevaOrden.setText("Nueva Orden");
        jMenu1.add(menNuevaOrden);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Cerrar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        mi_agregarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mi_agregarCliente.setText("Agregar Cliente");
        mi_agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mi_agregarCliente);

        mi_modificarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        mi_modificarCliente.setText("Modificar Cliente");
        mi_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mi_modificarCliente);

        mi_agregarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        mi_agregarProducto.setText("Agregar Producto");
        mi_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(mi_agregarProducto);

        mi_modificarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        mi_modificarProducto.setText("Modificar Producto");
        mi_modificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(mi_modificarProducto);

        jMenuBar1.add(jMenu2);

        menu_ver.setText("Ver");

        mi_buscarNota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mi_buscarNota.setText("Buscar Nota");
        mi_buscarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_buscarNotaActionPerformed(evt);
            }
        });
        menu_ver.add(mi_buscarNota);

        mi_reportes.setText("Reportes");
        mi_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_reportesActionPerformed(evt);
            }
        });
        menu_ver.add(mi_reportes);

        jMenuBar1.add(menu_ver);

        jMenu4.setText("About");

        sobreNosotros.setText("Sobre papayon's");
        sobreNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosotrosActionPerformed(evt);
            }
        });
        jMenu4.add(sobreNosotros);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_lugares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_terraza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pn_lugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pn_terraza, javax.swing.GroupLayout.PREFERRED_SIZE, 349, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<JInternalFrame> mesasOcupadas;

    private void nuevaVentana(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaVentana
        folio ++;
        boolean existe = false;

        if (existe == false) {

            //Se agrega nueva ventana hija
            JInternalFrame vHija = new JInternalFrame(null, true, false, true);
            //Se crea el panel interno
            PanelHijo hijo = new PanelHijo(pn_terraza ,folio, clientes, escritorio, vHija);

            // Se agregan propiedades de la ventana hijo
            vHija.add(hijo);
            vHija.pack();
            vHija.setLocation(0, 53);
            vHija.setVisible(true);
            //Se recupera el texto de botón para ponerlo al titulo de la ventana hija
            String nombreMesa = ((JButton) evt.getSource()).getText();
            vHija.setTitle(nombreMesa);
            System.out.println(nombreMesa);
            vHija.setIconifiable(false);
            vHija.setClosable(true);

            escritorio.add(vHija);
            pn_terraza.setVisible(false);
            //Se pone en una lista de mesas ocupadas
            mesasOcupadas.add(vHija);

            try {
                //Agregamos la ventana hija al escritorio
                hijo.mini(vHija, escritorio);
            } catch (PropertyVetoException ex) {
                System.out.println("No hay más ventanas abiertas");
            }
        }
    }//GEN-LAST:event_nuevaVentana

    private void sobreNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreNosotrosActionPerformed
        pn_terraza.setVisible(false);
        JInternalFrame vHija = new JInternalFrame("Sobre nosotros", true, true, true, true);
        SobreNosotros hijo = new SobreNosotros();
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
    }//GEN-LAST:event_sobreNosotrosActionPerformed

    
    private void mi_agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarClienteActionPerformed
        JInternalFrame vHija = new JInternalFrame(null, true, true, true, true);
        Alta_Cliente hijo = new Alta_Cliente(vHija);
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setTitle("Añadir un cliente");
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
        
    }//GEN-LAST:event_mi_agregarClienteActionPerformed

    private void mi_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarProductoActionPerformed
        JInternalFrame vHija = new JInternalFrame(null, true, true, true, true);
        Agregar_Producto hijo = new Agregar_Producto(vHija);
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setTitle("Añadir un Producto");
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
        
        
    }//GEN-LAST:event_mi_agregarProductoActionPerformed

    private void mi_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarClienteActionPerformed
        JInternalFrame vHija = new JInternalFrame(null, false, true, false);
        Modificar_Cliente hijo = new Modificar_Cliente(vHija);
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setTitle("Modificar cliente");
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
        
    }//GEN-LAST:event_mi_modificarClienteActionPerformed

    private void mi_modificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarProductoActionPerformed
        
        JInternalFrame vHija = new JInternalFrame(null, false, true, false);
        Modificar_Producto hijo = new Modificar_Producto(vHija);
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setTitle("Modificar Producto");
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
        
    }//GEN-LAST:event_mi_modificarProductoActionPerformed

    private void mi_buscarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_buscarNotaActionPerformed
        
        JInternalFrame vHija = new JInternalFrame(null, false, true, false);
        Modificar_Nota hijo = new Modificar_Nota(vHija);
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setTitle("Consultar Nota");
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
        
    }//GEN-LAST:event_mi_buscarNotaActionPerformed

    private void mi_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_reportesActionPerformed
        JInternalFrame vHija = new JInternalFrame(null, false, true, false);
        Reportes hijo = new Reportes(vHija);
        
        vHija.add(hijo);
        vHija.pack();
        vHija.setLocation(200,80);
        vHija.setTitle("Reportes");
        vHija.setVisible(true);
        escritorio.add(vHija);
        pn_terraza.setVisible(true);
        escritorio.getDesktopManager().activateFrame(vHija);
    }//GEN-LAST:event_mi_reportesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPadre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPadre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_barra;
    private javax.swing.JPanel btn_lobby;
    private javax.swing.JButton btn_mesa1;
    private javax.swing.JButton btn_mesa2;
    private javax.swing.JButton btn_mesa3;
    private javax.swing.JButton btn_mesa4;
    private javax.swing.JButton btn_mesa5;
    private javax.swing.JButton btn_mesa6;
    private javax.swing.JButton btn_mesa7;
    private javax.swing.JButton btn_mesa8;
    private javax.swing.JPanel btn_terraza;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menNuevaOrden;
    private javax.swing.JMenu menu_ver;
    private javax.swing.JMenuItem mi_agregarCliente;
    private javax.swing.JMenuItem mi_agregarProducto;
    private javax.swing.JMenuItem mi_buscarNota;
    private javax.swing.JMenuItem mi_modificarCliente;
    private javax.swing.JMenuItem mi_modificarProducto;
    private javax.swing.JMenuItem mi_reportes;
    private javax.swing.JPanel pn_lugares;
    private javax.swing.JPanel pn_terraza;
    private javax.swing.JMenuItem sobreNosotros;
    // End of variables declaration//GEN-END:variables

}
