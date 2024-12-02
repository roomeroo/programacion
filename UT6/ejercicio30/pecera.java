package ejercicio30;

public class pecera {
    public static void main (String[] arguments){
        System.out.print("Altura de la pecera: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Ancho de la pecera: ");
        int ancho = Integer.parseInt(System.console().readLine());
        int x1 = random(2,ancho-1);
        int y1 = random(2,altura-1);
        int x2 = random(2,ancho-1);
        int y2 = random(2,altura-1);
        while(x1 == x2 || y2==y1){
            x2 = random(2,ancho-1);
            y2 = random(2,altura-1);  
        }
        int x3 = random(2,ancho-1);
        int y3 = random(2,altura-1);
        while((x1 == x3 || y3==y1 )&&(x2 == x3 || y2 == y3)){
            x3 = random(2,ancho-1);
            y3 = random(2,altura-1);  
        }
        for(int i = 1; i <= altura; i++){
            for(int j = 1; j <=ancho; j++){
                if(i == 1 || i== altura){
                    System.out.print("*");
                }else if(i==y1 && j==x1){
                    System.out.print("@");
                }else if(i==y2 && j==x2){
                    System.out.print("&");
                }else if(i==y3 && j==x3){
                    System.out.print("$");
                }
                else if (j == 1 || j == ancho){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static int random (int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
