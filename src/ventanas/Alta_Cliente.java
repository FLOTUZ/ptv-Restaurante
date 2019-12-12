
package ventanas;

import Conector.Conector;
import DAO_Y_VO.ClienteDAO;
import DAO_Y_VO.ClienteVO;
import javax.swing.JInternalFrame;

public class Alta_Cliente extends javax.swing.JPanel {

    private JInternalFrame ventana;
    public Alta_Cliente(JInternalFrame vhija) {
        ventana = vhija;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfRFC = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setText("Apellidos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("RFC");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 220, -1));
        add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 220, -1));
        add(tfRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Conector con = new Conector();
        ClienteVO cliente = new ClienteVO();
        ClienteDAO inserta = new ClienteDAO(con.conectarMySQL());
        
        String nombre, apellidos, RFC;
        
            nombre = tfNombre.getText();
            apellidos = tfApellidos.getText();
            RFC = tfRFC.getText();
        
        cliente.setNombre_cliente(nombre);
        cliente.setApellidos(apellidos);
        cliente.setRFC(RFC);
        
        inserta.altaCliente(cliente);
        
        tfNombre.setText("");
        tfApellidos.setText("");
        tfRFC.setText("");
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ventana.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRFC;
    // End of variables declaration//GEN-END:variables
}
