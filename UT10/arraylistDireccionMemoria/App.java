package arraylistDireccionMemoria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Malaga");
        lista.add("Malaga");
        lista.add("Malaga");
        lista.add("Malaga");
        lista.add("Sevilla");

        HashMap<String,ArrayList<Integer>> miHashMap = new HashMap<>();
        miHashMap.put("hola",new ArrayList<Integer>());
        miHashMap.get("hola").add(1);
        miHashMap.get("hola").add(2);
        miHashMap.get("hola").add(3);
        miHashMap.get("hola").add(4);

        miHashMap.put("adios",new ArrayList<Integer>());
        miHashMap.get("adios").add(1);
        miHashMap.get("adios").add(2);
        miHashMap.get("adios").add(3);
        miHashMap.get("adios").add(4);
        

        for(Map.Entry<String, ArrayList<Integer>> parValores: miHashMap.entrySet()){
            System.out.print("La palabra " + parValores.getKey() + " tiene los siguientes valores: ");
            for(int i = 0; i < parValores.getValue().size(); i++){
                if(i < parValores.getValue().size() - 1){
                    System.out.print(parValores.getValue().get(i) + ", ");
                }else{
                    System.out.print(parValores.getValue().get(i) + " ");
                }
            }
            System.out.println();
        }   
    }
    
    
}
