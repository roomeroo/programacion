package Ejercicio02;

public class BarajaDePoker {
    public static void main (String[] arguments) {
        int carta = 0;
        String palo = "";
        System.out.print("Te voy a mostrar una carta de la baraja francesa: ");
        
        carta = (int)(Math.random() * 52) + 1;
        if (carta <= 13) {
            palo = "picas";
        }else if (carta <= 26){
            palo = "corazones";
        }else if (carta <= 39) {
            palo = "diamantes";
        }else palo = "tréboles";

        switch (carta) {
            case 1:
            System.out.print("A de " + palo);
            break;

            case 11:
            System.out.print("J de " + palo);
            break;

            case 12:
            System.out.print("Q de " + palo);
            break;

            case 13:
            System.out.print("K de " + palo);
            break;

            default:
            System.out.print(carta + " de " + palo);
                break;
        }
    }
}
