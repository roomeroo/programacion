package UT5.ejercicio57;
public class ejercicio57 {
    public static void main (String[] arguments){
        System.out.print("Introduzca la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int espacios = 0;
        int i = altura;
        while (i > 0) {
            for (int j = 0; j< espacios; j++) {
                System.out.print("_");
            }
            for (int j = 0; j< altura; j++){
                if(i == altura || j == 0 || j == (altura - 1)) {
                    System.out.print("*");
                }
                else if(j >= i && j<= altura) {
                    System.out.print("_");
                }
                
            }
            System.out.println("");
            espacios++;
            i--;
        }
    }
}