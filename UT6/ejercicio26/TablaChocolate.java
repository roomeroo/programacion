package ejercicio26;

public class TablaChocolate {
    public static void main(String[] arguments){
        System.out.print("Introduzca la anchura de la tableta: ");
        int ancho = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca la altura de la tableta: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("\n");
        int lado = random(1,4);
        
        int x = 0;
        int y = 0;

        switch (lado) {
            case 1:         //IZQUIERDA
                x = 1;
                y = random(1,altura);
                break;
        
            case 2:         //ABAJO
                x = random(1, ancho);
                y = altura;
                break;

            case 3:         //DERECHA
                x = ancho;
                y = random(1,altura);
                break;

            case 4:         //ARRIBA
                x = random(1,ancho);
                y = 1;
                break;
            
            default:
                System.out.println("ERROR");
                break;
        }

        for(int i = 1; i <= altura; i++){
            for(int j = 1; j <= ancho; j++){
                if(i == x && j == y){
                    System.out.print(" ");
                }else System.out.print("*");
            }
            System.out.println("");
        }
    } 
    public static int random(int min, int max){
        return (int)(Math.random() * (max - min)) + min;
    } 
}
