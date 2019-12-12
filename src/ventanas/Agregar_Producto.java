/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import Conector.Conector;
import DAO_Y_VO.ProductoDAO;
import DAO_Y_VO.ProductoVO;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ceo_emmanuel
 */
public class Agregar_Producto extends javax.swing.JPanel {

    private JInternalFrame frame;
    private final Conector con;
    private final ProductoDAO ProductoDAO;

    /**
     * Creates new form Agregar_Producto
     * @param frame
     */
    public Agregar_Producto(JInternalFrame frame) {
        initComponents();
        this.frame = frame;
        this.con = (Conector) new Conector();
        this.ProductoDAO = new ProductoDAO(con.conectarMySQL());
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
        tf_sku = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_stock = new javax.swing.JTextField();
        tf_precioUnitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tf_sku, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 90, -1));
        jPanel1.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, -1));
        jPanel1.add(tf_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, -1));
        jPanel1.add(tf_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, -1));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setText("Stock (Unidades)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setText("Precio Unitario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setText("SKU (ej: 123)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 90, -1));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        ProductoVO producto = new ProductoVO();

        //Se obtienen datos de los Fields
        producto.setSku( Integer.parseInt(tf_sku.getText()) );
        producto.setNombre( tf_nombre.getText() );
        producto.setEnStok( Integer.parseInt(tf_stock.getText()) );
        producto.setPrecio_unitario( Double.parseDouble(tf_precioUnitario.getText()) );
        
        ProductoDAO.altaProducto(producto);
        JOptionPane.showMessageDialog(null, "Se agregó con éxito");
        frame.dispose();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        frame.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_precioUnitario;
    private javax.swing.JTextField tf_sku;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}
