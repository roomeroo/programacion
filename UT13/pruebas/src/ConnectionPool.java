import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool {
    private String url = "";
    private String user = "";
    private String pass = "";
    ConnectionPool(String url, String user, String pass){
        this.url = url;
        this.user = user;
        this.pass = pass;
    }
    public Connection getConnection(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(this.url, this.user, this.pass);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return conexion;
    }
}