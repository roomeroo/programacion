package provinciaCodPostal;

import java.util.ArrayList;
import java.util.HashMap;

public class Utils {
    public static void inicializarBaseDatos(HashMap<String, ArrayList> lista){
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
            lista.get("Granada").add(18007);
            lista.get("Granada").add(18220);
    }
}
