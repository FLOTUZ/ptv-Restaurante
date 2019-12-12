/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import DAO_Y_VO.ClienteDAO;
import DAO_Y_VO.ClienteVO;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ceo_emmanuel
 */
public class Modificar_Cliente extends javax.swing.JPanel {

    private final JInternalFrame frame;
    private ClienteDAO cdao;
    private ArrayList<ClienteVO> clientes;

    public Modificar_Cliente(JInternalFrame frame) {

        initComponents();
        this.frame = frame;
        cdao = new ClienteDAO(new Conector.Conector().conectarMySQL());
        clientes = cdao.consultaMasiva();

        llenar_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        li_ListaClientesGUI = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_apellidos = new javax.swing.JTextField();
        tf_RFC = new javax.swing.JTextField();
        tf_compras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        btn_actualiza = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cancelar.setText("Cerrar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 107, -1));

        li_ListaClientesGUI.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(li_ListaClientesGUI);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 350));

        jLabel1.setText("Clientes Registrados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 30));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jLabel6.setText("RFC");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 40, -1));

        jLabel7.setText("Compras");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 250, -1, -1));

        tf_id.setEditable(false);
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 30));
        jPanel1.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 230, -1));
        jPanel1.add(tf_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 230, -1));
        jPanel1.add(tf_RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 230, -1));

        tf_compras.setEditable(false);
        jPanel1.add(tf_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 110, -1));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 350, 320));

        jLabel3.setText("DATOS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 50, -1));

        btn_next.setBackground(new java.awt.Color(254, 254, 254));
        btn_next.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        btn_next.setText(">");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 50, 40));

        btn_actualiza.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        btn_actualiza.setText("<");
        btn_actualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaActionPerformed(evt);
            }
        });
        add(btn_actualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        clientes = cdao.consultaMasiva();
        
        int seleccion = li_ListaClientesGUI.getSelectedIndex();
        //Se agregan los datos al los campos
        tf_id.setText(String.valueOf(clientes.get(seleccion).getId_cliente()));
        tf_nombre.setText(clientes.get(seleccion).getNombre_cliente());
        tf_apellidos.setText(clientes.get(seleccion).getApellidos());
        tf_RFC.setText(clientes.get(seleccion).getRFC());
        tf_compras.setText(String.valueOf(clientes.get(seleccion).getCompras()));
        
        
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed

        frame.dispose();

    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_actualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaActionPerformed
            ClienteVO cliente = new ClienteVO();
            
            //Se obtienen datos de los fields
            int id = Integer.valueOf(tf_id.getText());
            String nombre = tf_nombre.getText();
            String apellido = tf_apellidos.getText();
            String rfc = tf_RFC.getText();
            
            cliente.setId_cliente(id);
            cliente.setNombre_cliente(nombre);
            cliente.setApellidos(apellido);
            cliente.setRFC(rfc);
            
            cdao.actualizaCliente(cliente);
            
            llenar_lista();
            li_ListaClientesGUI.updateUI();
            
    }//GEN-LAST:event_btn_actualizaActionPerformed

    public void llenar_lista() {

        //Arreglo de strings para almacenar los nombres de los clientes
        String lista_strings[] = new String[clientes.size()];

        try {

            int i = 0;
            for (ClienteVO c : cdao.consultaMasiva()) {
                //Se obtiene el nombre del cliente y se pone en la lista de strings
                lista_strings[i] = c.getNombre_cliente();

                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se salio dde rango el arreglo modificarCliente.btn_next()");
        }

        li_ListaClientesGUI.setListData(lista_strings);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualiza;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> li_ListaClientesGUI;
    private javax.swing.JTextField tf_RFC;
    private javax.swing.JTextField tf_apellidos;
    private javax.swing.JTextField tf_compras;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
