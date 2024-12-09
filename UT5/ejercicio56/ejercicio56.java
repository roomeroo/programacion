package UT5.ejercicio56;
public class ejercicio56 {
    public static void main (String[] arguments){
        System.out.print("Introduzca la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int espacios = 0;
        while (altura > 0) {
            for (int i = 0; i< espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i< altura; i++){
                System.out.print("*");
            }
            System.out.println("");
            espacios++;
            altura--;
        }
    }
}