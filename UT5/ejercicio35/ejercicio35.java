package UT5.ejercicio35;

public class ejercicio35 {
    public static void main(String[] arguments) {
        System.out.print("Introduce la altura de la X: ");
        int size = Integer.parseInt(System.console().readLine());
        System.out.println("");
        if(size >= 3 && size % 2 != 0) {
            int i = 0;
            while(i < size) {
                int j = 0;
                while (j < size) {
                    if (i < ((size + 1) / 2)) {
                        if (j == i || j == size - i - 1) {
                            System.out.print("*");
                        }else System.out.print(" ");
                    }
                    if (i >= ((size + 1) / 2)){
                        if (i == j || j == size - i - 1){
                            System.out.print("*");
                        }else System.out.print(" ");
                    }
                    j++;
                }
                i++;
                System.out.println("");
            }
        }else System.out.println("Has introducido un valor no válido.");
    }
}
