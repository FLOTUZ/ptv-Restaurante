package sistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conector {
    
        // Librería de MySQL
    public String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    public String database = "ptv_isla";

    // Host
    public String hostname = "localhost";

    // Puerto
    public String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    
    

    // Nombre de usuario
    public String username = "root";

    // Clave de usuario
    public String password = "sintezoide";
    
    private Connection conn = null;
    
    public Connection conectarMySQL() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            
            if (conn != null) {
                System.out.println("\nConexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Algo no funcionó");
        }

        return conn;
    }

    public void cerrar()  {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error en BD");
        }
    }
}
