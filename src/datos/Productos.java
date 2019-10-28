package datos;

public class Productos {
    private int sku;
    private String nombre;
    private int unidades;
    private Double precio;

    public Productos() {
        
    }

    public Productos(int sku, String nombre, int unidades, Double precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return sku + " " + nombre + " " + unidades + " " + precio ;
    }
    
    
}
