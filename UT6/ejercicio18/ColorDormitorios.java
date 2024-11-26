package ejercicio18;

public class ColorDormitorios {
    public static void main (String[] arguments) {
        int color1 = (int)(Math.random() * 6) + 1;
        int color2 = color1;
        while (color2 == color1){
            color2 = (int)(Math.random() * 6) + 1; 
        }   
        int color3 = color1;
        while(color3 == color2 || color3 == color1) {
            color3 = (int)(Math.random() * 6) + 1;
        }

        comprobar(color1);
        comprobar(color2);
        comprobar(color3);       
    }

    public static void comprobar (int color) {
        switch (color) {
            case 1:
                System.out.println("rojo ");
                break;
            case 2:
                System.out.println("azul ");
                break;
            case 3:
                System.out.println("verde ");
                break;
            case 4:
                System.out.println("amarillo ");
                break;
            case 5:
                System.out.println("violeta  ");
                break;

            case 6:
                System.out.println("naranja ");
                break;

            default:
                break;
        }
    }
}
