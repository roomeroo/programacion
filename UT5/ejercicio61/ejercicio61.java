package UT5.ejercicio61;

public class ejercicio61 {
    public static void main (String[] arguments) {
        System.out.print("Introduzca la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura >= 3) {
            int i = 0;
            System.out.println("");
            while (i < altura) {
                int j = 0;
                while (j < 4 * altura) {
                    if (i != altura - 1) {
                        if (i==j || j == i + 1 || j == i + 2 || j == 2 * altura - i + 1 ||j == 2 * altura - i + 2 || j == 2 * altura - i + 3){
                            System.out.print("*");
                        }else System.out.print(" ");
                    }else {
                        if (j >= i && j <= i+5) {
                            System.out.print("*");
                        }else System.out.print(" ");
                    }
                    j++;
                }
                i++;
                System.out.println("");
            }

        }else System.out.println("\nAltura no válida.");
    }
}
