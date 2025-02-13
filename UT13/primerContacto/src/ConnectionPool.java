import java.sql.Connection;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<ConnectionPool> conexiones;
    private String url;
    private String usuario;
    private String contraseña;

    public ConnectionPool(String url, String usuario, String contraseña){
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
        conexiones = new ArrayList<>();
    }

}
