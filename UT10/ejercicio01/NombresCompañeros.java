package ejercicio01;
import java.util.ArrayList;

public class NombresCompañeros{
    public static void main(String[] args) {
        ArrayList<String> compañeros = new ArrayList<String>();
        compañeros.add("miguel del pitillo");
        compañeros.add("pichagorda22");
        compañeros.add("marco");
        compañeros.add("chemaCalvo");
        compañeros.addFirst("miguemugroso");
        compañeros.add("miguehuelepeste");

        for(String nombre : compañeros){
            System.out.println(nombre);
        }
        for(int i = 0; i<compañeros.size(); i++){
            System.out.println(compañeros.get(i));
        }
    }
}