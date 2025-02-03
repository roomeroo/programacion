import java.util.ArrayList;
import java.util.HashMap;

public class Utils {
    public static void inicializarBD(HashMap<String, Double> lista){
        lista.put("avena", 2.21);
        lista.put("garbanzos", 2.39);
        lista.put("tomate", 1.59);
        lista.put("jengibre", 3.13);
        lista.put("quinoa", 4.58);
        lista.put("guisantes", 1.6);
    }

    public static int buscarPedido(String nombre, ArrayList<lineaPedido> lista){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNombre().equals(nombre))
                return(i);
        }
        
        return (-1);
    }
}
