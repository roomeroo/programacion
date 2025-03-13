import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        /*String url = "jdbc:mariadb://localhost:3306/baloncesto";
        String usuario = "root";
        String contraseña = "";

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        try{
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();
            String query = "SELECT * FROM socio";
            resultado = sentencia.executeQuery(query);
            while(resultado.next()){
                int socioID = resultado.getInt("socioID");
                String nombre = resultado.getString("nombre");
                int estatura = resultado.getInt("estatura");
                int edad = resultado.getInt("edad");
                String localidad = resultado.getString("localidad");

                System.out.println(socioID + " " + nombre + " " + estatura + " " + edad + " " + localidad);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            try{
                if(resultado != null) resultado.close();
                if(conexion != null) conexion.close();
                if(sentencia != null) sentencia.close();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }*/
        //Lakers.createSocio(new Socio(12345, "Adrián Romero", 123, 18, "campanillas"));
        Lakers.listarSocios();
        Lakers.actualizarSocio(12345, "Adrián Romero Maldonado", 120, 12, "campanillas");
    }
}
