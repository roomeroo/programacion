import java.sql.Connection;

public class GestorSocios {
    Connection conexion = null;

    public GestorSocios(Connection conexion){
        this.conexion = conexion;
    }
}
