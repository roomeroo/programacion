import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.mariadb.jdbc.export.Prepare;

public class Lakers {
    

    public static void createSocio(Socio socio){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        try{
            conexion = new ConnectionPool("jdbc:mariadb://localhost:3306/baloncesto", "root", "").getConnection();
            String query = "INSERT INTO socio (SocioID, nombre, estatura, edad, localidad) VALUES (?, ?, ?, ?, ?)";
            sentencia = conexion.prepareStatement(query);
            sentencia.setInt(1,socio.getSocioID());
            sentencia.setString(2, socio.getNombre());
            sentencia.setInt(3, socio.getEstatura());
            sentencia.setInt(4,socio.getEdad());
            sentencia.setString(5,socio.getLocalidad());
            sentencia.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void eliminarSocio(Socio socio){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        try{
        conexion = new ConnectionPool("jdbc:mariadb://localhost:3306/baloncesto", "root", "").getConnection();
        String query = "DELETE FROM socio WHERE socioID = ?";
        sentencia = conexion.prepareStatement(query);
        sentencia.setInt(1, socio.getSocioID());
        sentencia.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void listarSocios(){
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;
        try{
            conexion = new ConnectionPool("jdbc:mariadb://localhost:3306/baloncesto", "root", "").getConnection();
            sentencia = conexion.createStatement();
            String query = "SELECT * FROM socio";
            resultado = sentencia.executeQuery(query);
            while(resultado.next()){
                System.out.print(resultado.getString("nombre"));
                System.out.println(" " + resultado.getInt("socioID"));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void actualizarSocio(int socioID, String nombre, int estatura, int edad, String localidad){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        try {
            conexion = new ConnectionPool("jdbc:mariadb://localhost:3306/baloncesto", "root", "").getConnection();
            String query = "UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ? WHERE socioID = ?";
            sentencia = conexion.prepareStatement(query);
            sentencia.setString(1, nombre);
            sentencia.setInt(2, estatura);
            sentencia.setInt(3,edad);
            sentencia.setString(4,localidad);
            sentencia.setInt(5, socioID);
            sentencia.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
