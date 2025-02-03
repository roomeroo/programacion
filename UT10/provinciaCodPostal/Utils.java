package provinciaCodPostal;

import java.util.ArrayList;
import java.util.HashMap;

public class Utils {
    public static void inicializarBaseDatos(HashMap<String, ArrayList<Integer>> lista){
        lista.put("Málaga", new ArrayList<Integer>());
            lista.get("Málaga").add(29550);
            lista.get("Málaga").add(29321);
            lista.get("Málaga").add(29100);
            lista.get("Málaga").add(29700);
        lista.put("Sevilla", new ArrayList<Integer>());
            lista.get("Sevilla").add(41100);
            lista.get("Sevilla").add(41500);
            lista.get("Sevilla").add(41231);
        lista.put("Granada", new ArrayList<Integer>());
            lista.get("Granada").add(072);
            lista.get("Granada").add(012452);
    }

    public static void añadirProvincia(HashMap<String, ArrayList<Integer>> lista){
        System.out.print("¿Cual es el nombre de la provincia?: ");
        String nombre = System.console().readLine();
        if(lista.containsKey(nombre)){
            System.out.println("Esta provincia ya existe.");
        }else{
            lista.put(nombre, new ArrayList<Integer>());
        }
    }

    public static void añadirCodigoPostal(HashMap<String, ArrayList<Integer>> lista){
        System.out.print("¿Cual es el nombre de la provincia?: ");
        String nombre = System.console().readLine();
        if(!lista.containsKey(nombre)){
            System.out.println("Esta provincia no existe en nuestra base de datos.");
        }else{
            System.out.print("Que codigo postal quieres añadir: ");
            int codPostal = Integer.parseInt(System.console().readLine());
            if(!lista.get(nombre).contains(codPostal)){
                lista.get(nombre).add(codPostal);
                System.out.println("Codigo postal introducido correctamente");
            }else System.out.println("Ese codigo postal ya existe en la base de datos");
        }
    }

    public static void borrarProvincia(HashMap<String, ArrayList<Integer>> lista){
        System.out.println("Que provincia quieres borrar");
        String provincia = System.console().readLine();
        if(!lista.containsKey(provincia)){
            System.out.println("Me temo que no tenemos esa provincia en la base de datos");
        }else{
            lista.remove(provincia);
            System.out.println("provincia borrada");
        }
    }

    public static void borrarCodigoPostal(HashMap<String, ArrayList<Integer>> lista){
        System.out.println("De que provincia quieres borrar el codigo postal");
        String provincia = System.console().readLine();
        if(!lista.containsKey(provincia)){
            System.out.println("No la tenemos en carta.");
        }else{
            System.out.println("Que codigo postal quieres borrar");
            int codPostal = Integer.parseInt(System.console().readLine());
            if(!lista.get(provincia).contains(codPostal)){
                System.out.println("Me temo que ese  codigo postal no esta en la base de datos");
            }else{
                lista.get(provincia).remove(codPostal);
                System.out.println("Codigo postal borrado");
            }
        }
    }
}
