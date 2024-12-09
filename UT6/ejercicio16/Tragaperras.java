package ejercicio16;

public class Tragaperras {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main (String[] arguments) {
        System.out.println("\n\n\n\n"+ ANSI_PURPLE +" BIENVENIDO A MI TRAGAPERRILLA\n\n\n\n" + ANSI_RESET);
        int key1 = (int)(Math.random() * 5) + 1;
        int key2 = (int)(Math.random() * 5) + 1;
        int key3 = (int)(Math.random() * 5) + 1;
        prueba(key1);
        prueba(key2);
        prueba(key3);
        if(key1 == key2 && key2 == key3){
            System.out.println(ANSI_CYAN + "\nVictoria magistral." + ANSI_RESET);
        }else if (key1 == key2 || key2 == key3 || key3 == key2)
            System.out.println(ANSI_CYAN + "\n\nEnhorabuena, no has perdido dinero" + ANSI_RESET);
    }

    public static void prueba(int key) {
        switch (key) {
            case 1:
                System.out.print(ANSI_RED + "Corazón " + ANSI_RESET);
                break;

            case 2:
                System.out.print(ANSI_BLUE + "Diamante " + ANSI_RESET);
                break;
            
            case 3:
            System.out.print(ANSI_PURPLE + "Herradura " + ANSI_RESET);    
                break;
            
            case 4:
                System.out.print(ANSI_GREEN + "Campana " + ANSI_RESET);  
                break;

            case 5:
                System.out.print(ANSI_YELLOW + "limon " + ANSI_RESET);
                break;
        
            default:
                break;
        }
    }
}
