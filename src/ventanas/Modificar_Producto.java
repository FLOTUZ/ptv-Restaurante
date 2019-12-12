/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import DAO_Y_VO.ProductoDAO;
import DAO_Y_VO.ProductoVO;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Modificar_Producto extends javax.swing.JPanel {

    private final JInternalFrame frame;
    private ProductoDAO pdao;
    private ArrayList<ProductoVO> productos;

    public Modificar_Producto(JInternalFrame frame) {
        initComponents();
        this.frame = frame;
        pdao = new ProductoDAO(new Conector.Conector().conectarMySQL());
        productos = pdao.consultaMasiva();

        llenar_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_id = new javax.swing.JTextField();
        tf_sku = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        tf_stock = new javax.swing.JTextField();
        tf_precioUnitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        li_Productos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        btn_validar = new javax.swing.JButton();
        btn_leer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_id.setEditable(false);
        add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 60, -1));
        add(tf_sku, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 120, -1));
        add(tf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 170, -1));
        add(tf_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 170, -1));
        add(tf_precioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 170, -1));

        jLabel1.setText("id");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel2.setText("SKU");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel4.setText("Stock");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel5.setText("Precio Unitario");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        jScrollPane1.setViewportView(li_Productos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 340));

        jLabel6.setText("Productos en BD");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_validar.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        btn_validar.setText("<");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });
        add(btn_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 50, 50));

        btn_leer.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        btn_leer.setText(">");
        btn_leer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leerActionPerformed(evt);
            }
        });
        add(btn_leer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, 50));

        jLabel7.setText("DATOS");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        btn_cancelar.setText("Cerrar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_leerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leerActionPerformed
        
        productos = pdao.consultaMasiva();
        
        int seleccion = li_Productos.getSelectedIndex();
        //Se agregan los datos al los campos
        tf_id.setText(String.valueOf(productos.get(seleccion).getId_producto()));
        tf_sku.setText(String.valueOf(productos.get(seleccion).getSku()));
        tf_Nombre.setText(productos.get(seleccion).getNombre());
        tf_stock.setText(String.valueOf(productos.get(seleccion).getEnStok()));
        tf_precioUnitario.setText(String.valueOf(productos.get(seleccion).getPrecio_unitario()));
        
    }//GEN-LAST:event_btn_leerActionPerformed

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed

        ProductoVO producto = new ProductoVO();

        //Se obtienen datos de los fields
        int id = Integer.valueOf(tf_id.getText());
        int sku = Integer.parseInt(tf_sku.getText());
        String nombre = tf_Nombre.getText();
        int stock = Integer.parseInt(tf_stock.getText());
        double precioUnitario = Double.parseDouble(tf_precioUnitario.getText());

        producto.setId_producto(id);
        producto.setSku(sku);
        producto.setNombre(nombre);
        producto.setEnStok(stock);
        producto.setPrecio_unitario(precioUnitario);

        pdao.actualizaProducto(producto);

        llenar_lista();
        li_Productos.updateUI();

    }//GEN-LAST:event_btn_validarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        frame.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public void llenar_lista() {

        //Arreglo de strings para almacenar los nombres de los clientes
        String lista_strings[] = new String[productos.size()];

        try {

            int i = 0;
            for (ProductoVO c : pdao.consultaMasiva()) {
                //Se obtiene el nombre del cliente y se pone en la lista de strings
                lista_strings[i] = c.getNombre();

                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se salio dde rango el arreglo modificarCliente.btn_next()");
        }

        li_Productos.setListData(lista_strings);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_leer;
    private javax.swing.JButton btn_validar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> li_Productos;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_precioUnitario;
    private javax.swing.JTextField tf_sku;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}
