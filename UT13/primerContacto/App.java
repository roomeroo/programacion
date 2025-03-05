import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.socio.Socio;

public class App {
    /*
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mariadb://localhost:3306/baloncesto";
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
        }

    }
        */
        public static void main(String[] args) {
            Lakers.requestAll();
        }
}
       
