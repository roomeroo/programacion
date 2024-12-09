package UT5.ejercicio38;

public class ejercicio38 {
    public static void main(String[] arguments) {
        System.out.print("dime la altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        int i = 0;
        int j = 0;
        while (i < altura) {
            j = 0;
            if (i <= (altura / 2)) {
                while (j < i) {
                    System.out.print("_");
                    j++;
                }
                j = 0;
                while (j < altura - (2*i)) {
                        System.out.print ("*");
                        j++;
                }
            }else {
                j = 0;
                while(j < altura - i -1) {
                    System.out.print("_");
                    j++;
                }
                j = 0;
                while (j < 2*(i - 2) - 1) {
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println("");
            i++;

        }
    }
}
