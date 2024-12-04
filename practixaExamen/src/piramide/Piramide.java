package piramide;

public class Piramide {
    public static int randInt() {
        return ((int)(Math.random() * (20)) + 1);
    }
    public static void piramide(){
        int altura = randInt();
        for (int i = 0; i < altura; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
