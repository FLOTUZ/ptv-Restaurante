package DAO_Y_VO;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class NotaVentaDAO {

    private Connection conector = null;

    public NotaVentaDAO(Connection conector) {
        this.conector = conector;
    }

    public Nota_VentaVO getNota_ByID(int idNotaFolio) {
        Nota_VentaVO nota = new Nota_VentaVO();
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL
                = "SELECT idnotas_folio, fecha, hora, mesa, total, clientes_idclientes, mesero_idmesero "
                + "FROM notas_venta "
                + "where idnotas_folio = ?;";

        try {
            consulta = conector.prepareStatement(consultaSQL);

            //El 1 es el indice del primer signo de interrogación
            consulta.setInt(1, idNotaFolio);

            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while (resultSet != null && resultSet.next()) {

                //Se crea el objeto con los datos que retorna la BD
                nota = new Nota_VentaVO();
                nota.setId_notas_folio(resultSet.getInt(1));
                nota.setFecha(String.valueOf(resultSet.getDate(2)));
                nota.setHora(String.valueOf(resultSet.getTime(3)));
                nota.setMesa(resultSet.getInt(4));
                nota.setTotal(resultSet.getDouble(5));
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde clienteDAO.getNotaByID()");
        }

        return nota;
    }

    public int nuevaNota(Nota_VentaVO nota) {
        PreparedStatement objetoSQL = null;
        ResultSet generatedKeys = null;
        int id = 0;

        String inserta
                = "INSERT INTO notas_venta (fecha, hora, mesa, total, clientes_idclientes, mesero_idmesero) "
                + "VALUES (?, ?, ?, ?, ?, ?);";

        try {
            conector.setAutoCommit(false);

            objetoSQL = conector.prepareStatement(inserta, PreparedStatement.RETURN_GENERATED_KEYS);

            //Se llena el objeto PreparedStatement
            objetoSQL.setDate(1, Date.valueOf(nota.getFecha()));
            objetoSQL.setTime(2, Time.valueOf(nota.getHora()));
            objetoSQL.setInt(3, nota.getMesa());
            objetoSQL.setDouble(4, nota.getTotal());
            objetoSQL.setInt(5, nota.getClientes_idclientes());
            objetoSQL.setInt(6, nota.getMesero_idmesero());

            //Se ejecuta la sentencia
            objetoSQL.executeUpdate();

            //Se recogen llaves generadas
            generatedKeys = objetoSQL.getGeneratedKeys();

            if (generatedKeys.next()) {
                id = generatedKeys.getConcurrency();
            }
            conector.commit();

        } catch (SQLException e) {
            try {
                conector.rollback();
                JOptionPane.showMessageDialog(null, "Se hizo rollback desde NotaVentaDAO.nuevaNota()");
                System.out.println("Error desde NotaVentaDAO.nuevaNota() -> " + e.toString());
            } catch (SQLException ex1) {
                System.out.println("Error en la transacción " + ex1.toString());
                JOptionPane.showMessageDialog(null, "Error desde clienteDAO.nuevaNota()");
            }
        }
        return id;
    }

    public ArrayList<Nota_VentaVO> consultaMasiva() {
        ArrayList<Nota_VentaVO> lista_de_notas = new ArrayList<>();

        Nota_VentaVO nota = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL
                = "SELECT idnotas_folio, fecha, hora, mesa, total, clientes_idclientes, mesero_idmesero "
                + "FROM notas_venta";
        try {
            consulta = conector.prepareStatement(consultaSQL);
            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while (resultSet != null && resultSet.next()) {

                //Se crea el objeto con los datos que retorna la BD
                nota = new Nota_VentaVO();
                nota.setId_notas_folio(resultSet.getInt(1));
                nota.setFecha(String.valueOf(resultSet.getDate(2)));
                nota.setHora(String.valueOf(resultSet.getTime(3)));
                nota.setMesa(resultSet.getInt(4));
                nota.setTotal(resultSet.getDouble(5));
                nota.setClientes_idclientes(resultSet.getInt(6));
                nota.setClientes_idclientes(resultSet.getInt(7));

                //Se agrega cada objeto nuevo al arraylist
                lista_de_notas.add(nota);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde clienteDAO.consultaMasiva()");
        }
        return lista_de_notas;
    }

    public int ultimaNota() {
        int ultimaNota = 0;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL
                = "select max(idnotas_folio) as id_ultimaNota from notas_venta;";

        try {
            consulta = conector.prepareStatement(consultaSQL);

            resultSet = consulta.executeQuery();

            if (resultSet.next()) {
                ultimaNota = resultSet.getInt(1);

            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde clienteDAO.UltimaNota()");
        }

        return ultimaNota;
    }

    public int actualizarNota(Nota_VentaVO nota, int folioNota) {
        PreparedStatement objetoSQL = null;
        ResultSet generatedKeys = null;
        int id = 0;

        String actualiza
                = "UPDATE notas_venta SET hora = ?, mesa = ?, total = ?, mesero_idmesero = ? "
                + "WHERE idnotas_folio = ? "
                + "AND clientes_idclientes = ? "
                + "AND mesero_idmesero = ?;";

        try {
            conector.setAutoCommit(false);

            objetoSQL = conector.prepareStatement(actualiza, PreparedStatement.RETURN_GENERATED_KEYS);

            //Se llena el objeto PreparedStatement
            objetoSQL.setTime(1, Time.valueOf(nota.getHora()));
            objetoSQL.setInt(2, nota.getMesa());
            objetoSQL.setDouble(3, nota.getTotal());
            objetoSQL.setInt(4, folioNota);
            objetoSQL.setInt(5, nota.getId_notas_folio());
            objetoSQL.setInt(6, nota.getClientes_idclientes());
            objetoSQL.setInt(7, nota.getMesero_idmesero());

            //Se ejecuta la sentencia
            objetoSQL.executeUpdate();

            //Se recogen llaves generadas
            generatedKeys = objetoSQL.getGeneratedKeys();

            if (generatedKeys.next()) {
                id = generatedKeys.getConcurrency();
            }
            conector.commit();

        } catch (SQLException e) {
            try {
                conector.rollback();
                JOptionPane.showMessageDialog(null, "Se hizo rollback desde NotaVentaDAO.actualizarNota()");
                System.out.println("Error desde NotaVentaDAO.actualizarNota() -> " + e.toString());
            } catch (SQLException ex1) {
                System.out.println("Error en la transacción " + ex1.toString());
                JOptionPane.showMessageDialog(null, "Error desde clienteDAO.actualizarNota()");
            }
        }
        return id;
    }

    public ArrayList<Nota_Detalles> consultaDetallesDeNota(int folio) {
        ArrayList<Nota_Detalles> detalles = new ArrayList<>();

        Nota_Detalles detalle = null;
        //Se encapsula query
        PreparedStatement consulta = null;
        //Se obtiene el set de resultado
        ResultSet resultSet = null;

        //Se crea el query para ponerlo en el objeto PrepareStatement
        String consultaSQL
                = "select p.sku, p.nombre, cantidad, p.precio_unitario "
                + "from producto p "
                + "inner join renglones r on p.idproducto = r.producto_idproducto "
                + "inner join notas_venta nv on r.notas_venta_idnotas_folio = nv.idnotas_folio and r.notas_venta_clientes_idclientes = nv.clientes_idclientes "
                + "where nv.idnotas_folio = ? ;";
        try {
            consulta = conector.prepareStatement(consultaSQL);
            consulta.setInt(1, folio);
            resultSet = consulta.executeQuery();

            //Mientras haya registros de la BD se ejecuta este codigo
            while (resultSet != null && resultSet.next()) {

                //Se crea el objeto con los datos que retorna la BD
                detalle = new Nota_Detalles();

                detalle.setSku(resultSet.getInt(1));
                detalle.setNombre(resultSet.getString(2));
                detalle.setCantidad(resultSet.getInt(3));
                detalle.setPrecioUnitario(resultSet.getDouble(4));
                //Se agrega cada objeto nuevo al arraylist
                detalles.add(detalle);
            }

        } catch (SQLException ex) {
            System.out.println("Error en la transacción " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error desde clienteDAO.consultaDetallesDeNota()");
        }
        return detalles;
    }

}
