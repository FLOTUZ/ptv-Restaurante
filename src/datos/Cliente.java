
package datos;

public class Cliente {
    private int id;
    private String nombre;
    private String rfc;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "ID: " + id + "Nombre: " + nombre + "RFC: " + rfc;
    }
    
    
}
