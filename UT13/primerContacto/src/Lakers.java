import java.sql.SQLException;
import java.util.ArrayList;
import CRUD.CRUD;
import socio.Socio;

public class Lakers{
    private String url = "jdbc:mariadb://localhost:3306/baloncesto";
    private String usuario = "root";
    private String contraseña = "";
    
    public static int pedirEntero(String mensaje){
        int numero;
        boolean correcto = false;
        try{
            while(!correcto){
                System.out.println(mensaje);
                numero = Integer.parseInt(System.console().readLine());
                correcto = true;
                return numero;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return -1;  //pongo -1 como error aunque nose si podria necesitar numeros negativos
    }

    public void añadirSocio() throws SQLException{
        int socioID = pedirEntero("Digame el codigo dle socio: ");
        System.out.print("Escribe el nombre del nuevo socio: ");
        String nombre = System.console().readLine();
        System.out.print("Y la estatura: ");
        int estatura = Integer.parseInt(System.console().readLine());
        int edad = pedirEntero("Y la edad: ");
        System.out.print("Y la localidad");
        String localidad = System.console().readLine();
    }

    public static void bajaSocio(){
 
    }

    public static void modificarSocio(int identificador){

    }

    public static void listarSocios(){

    }

    public static void buscarSocio(int identificador){
    
    }
}
