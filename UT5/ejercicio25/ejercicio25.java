package programacion.UT5.ejercicio25;

public class ejercicio25 {
    public static void main(String[] arguments) {
        System.out.print("Escribe el numerin: ");
        int num = Integer.parseInt(System.console().readLine());
        int revNum = 0;
        while(num>0) {
            revNum = revNum * 10 + num % 10;
            num = num/10;
        }
        System.out.println("El numero al reves es: " + revNum);
    }
}