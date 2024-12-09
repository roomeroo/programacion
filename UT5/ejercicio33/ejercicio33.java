package UT5.ejercicio33;

public class ejercicio33 {
    public static void main(String[] arguments) {
        System.out.print("Escriba la altura de la U: ");
        int size = Integer.parseInt(System.console().readLine());
        int i = 0;
        while (i < size){
            int j = 0;
            while (j < size) {
                if (i != size - 1) {
                    if (j == 0 || j == size - 1){
                        System.out.print("*");
                    }
                    else System.out.print("  ");
                }else {
                    if (j > 0 && j < size - 1){
                        System.out.print("*");
                    }else System.out.print(" ");

                    
                }
                j++;
            }
            i++;
            System.out.println("");
        }
    }

}