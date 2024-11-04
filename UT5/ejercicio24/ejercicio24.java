package programacion.UT5.ejercicio24;

public class ejercicio24 {
    public static void main(String[] args) {
        int filas;
        System.out.print("Digite el numero de filas que quieres para la piramide ");
        filas = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(i * 2 - j);
                }

            }
            System.out.println("");

        }

    }

}
