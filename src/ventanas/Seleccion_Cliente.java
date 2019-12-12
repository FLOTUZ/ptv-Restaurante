
package ventanas;

import Conector.Conector;
import DAO_Y_VO.ClienteDAO;
import DAO_Y_VO.ClienteVO;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class Seleccion_Cliente extends javax.swing.JPanel {

    
    private JDesktopPane escritorio;
    private JInternalFrame frame;
    private ArrayList<ClienteVO> lista_clientes;
    
    public Seleccion_Cliente(JDesktopPane escritorio, JInternalFrame frame) {
        this.escritorio = escritorio;
        this.frame = frame;
        lista_clientes = new ArrayList<>();
        initComponents();
        
    }
    
    public void llenar_Tabla(){
        Conector con = new Conector();
        ClienteDAO cl = new ClienteDAO(con.conectarMySQL());
        lista_clientes = cl.consultaMasiva();
        
        int r=0;
            for (ClienteVO c : lista_clientes) {
                System.out.println(c.toString());
                
                    tb_cliente.setValueAt(c.getId_cliente(), r, 0);
                    tb_cliente.setValueAt(c.getNombre_cliente(), r, 1);
                    tb_cliente.setValueAt(c.getApellidos(), r, 2);
                    tb_cliente.setValueAt(c.getRFC(), r, 3);
                    tb_cliente.setValueAt(c.getCompras(), r, 4);
                    r++;
            }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_cliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVerClientes = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apelldios", "RFC", "Compras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 460, 250));

        jLabel1.setText("Seleccione Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 19, -1, -1));

        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 200, -1));

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 120, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 140, -1));

        btnVerClientes.setText("Ver Clientes");
        btnVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        JInternalFrame interno = new JInternalFrame("Crear Cliente");
        Alta_Cliente altaCliente = new Alta_Cliente(interno);
        
        interno.add(altaCliente);
        interno.pack();
        interno.setLocation(200,80);
        interno.setTitle("Crea Cliente");
        interno.setVisible(true);
        escritorio.add(interno);
        escritorio.getDesktopManager().activateFrame(interno);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frame.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientesActionPerformed
        llenar_Tabla();
    }//GEN-LAST:event_btnVerClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVerClientes;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_cliente;
    // End of variables declaration//GEN-END:variables
}
