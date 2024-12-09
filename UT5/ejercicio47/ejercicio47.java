package UT5.ejercicio47;

public class ejercicio47 {
    public static void main (String[] arguments) {
        System.out.println("Porfavor, introduzca la altura del 8: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura >= 5 && altura % 2 != 0) {
            System.out.println("");
            int i = 0;
            while (i < altura) {
                int j = 0;
                while (j < 6) {
                    if(i == 0 || i == altura - 1 || i == altura / 2) {
                        System.out.print('M');
                    }else {
                        if(j == 0 || j == 5){
                            System.out.print('M');
                        }else System.out.print(' ');
                    }
                    j++;
                }
                i++;
                System.out.println("");
            }

        }else System.out.println("Altura no válida");
    }
}
