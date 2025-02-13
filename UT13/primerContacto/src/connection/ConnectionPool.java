package connection;
import java.sql.Connection;
import java.util.ArrayList;

public class ConnectionPool {
    private static ArrayList<Connection> conexiones = new ArrayList<>();
    private String url;
    private String usuario;
    private String contraseña;

    public ConnectionPool(String url, String usuario, String contraseña){
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ArrayList<Connection>getConexiones(){
        return (conexiones);
    }

    public void añadirConexion(Connection conexion){
        conexiones.add(conexion);
    }
}
