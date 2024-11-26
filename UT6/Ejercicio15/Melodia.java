package Ejercicio15;

public class Melodia {
    public static void main (String[] arguments){
        int primera;
        int nota = (int)(Math.random() * 7) + 1;
        primera = nota;
        int estrofa = (int)(Math.random() * 7) + 1;
        for (int i = 0 ; i < estrofa; i++) {
            for (int j = 0; j < 4; j++){
                if(i == 0) {
                    escribirNota(primera);
                    System.out.print(" ");
                    j++;
                }
                if(i== estrofa - 1 && j == 3){
                    escribirNota(primera);
                }else{
                    nota = (int)(Math.random() * 7) + 1;
                    escribirNota(nota);
                }
            }
            System.out.print(" |");
        }
        System.out.print("|");
    }

    public static void escribirNota(int nota) {
        switch (nota) {
            case 1:
               System.out.print(" do"); 
                break;

            case 2:
                System.out.print(" re");
                break;

            case 3:
                System.out.print(" mi");
                break;

            case 4:
                System.out.print(" fa");
                break;

            case 5:
                System.out.print(" sol");
                break;

            case 6:
                System.out.print(" la");
                break;

            case 7:
                System.out.print(" si");
                break;
        
            default:
            System.out.print("ERROR");
                break;
        }
    }
}
