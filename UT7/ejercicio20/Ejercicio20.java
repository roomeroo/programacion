package ejercicio20;

public class Ejercicio20 {

    public static int numero(String str[], String nombre, int pos){
        int repeticion = 0;
        for(int i = 0; i < str.length && i <= pos; i++){
            if(str[i].equals(nombre))
                repeticion++;
        }
        if(repeticion == 0)
            repeticion++;
        return (repeticion);
    }
    public static void main(String[] args) {
        String nombres[] = new String[8];
        nombres[0] = "Miguel";    
        nombres[1] = "Jose";
        nombres[2] = "Jose";
        nombres[3] = "Miguel";
        nombres[4] = "Miguel";    
        nombres[5] = "Jose";
        nombres[6] = "Jose";
        nombres[7] = "Miguel";
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + " " + numero(nombres, nombres[i], i) + "º");

        }
    }
}
