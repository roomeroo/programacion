package provinciaCodPostal;
import java.util.HashMap;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        HashMap<String,ArrayList> lista = new HashMap<String, ArrayList>();
        Utils.inicializarBaseDatos(lista);
        int option = 1;
        while(option != 5){
            System.out.println("Que quieres hacer: ");
            System.out.println("1. Añadir codigo provincia");
            System.out.println("2. Añadir codigo postal.");
            System.out.println("3. Borrar codigo provincia");
            System.out.println("4. Borrar codigo postal.");
            System.out.println("5. Salir.");
            System.out.print("Eleccion: ");
            option = Integer.parseInt(System.console().readLine());
            
        }

        System.out.println(lista);
    }
}
