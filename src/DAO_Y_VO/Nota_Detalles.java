/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_Y_VO;

/**
 *
 * @author ceo_emmanuel
 */
public class Nota_Detalles extends Nota_VentaVO{
    
    int sku;
    String nombre;
    int cantidad;
    double precioUnitario;

    public Nota_Detalles() {
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Nota_Detalles{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario;
    }


    
    
}
