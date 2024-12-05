package UT5.ejercicio09;

public class ejercicio09 {
    public static void main(String[] arguments){
        int digitos = 1;
        long numerin;
        System.out.print("Introduzca un numero, y le dire cuantos dígitos tiene: ");
        numerin = Long.parseLong(System.console().readLine());
            while(numerin > 9){
                digitos++;
                numerin = numerin/10;
            }
            System.out.println("Tú numero tiene " + digitos + " dígitos.");
    }
}
