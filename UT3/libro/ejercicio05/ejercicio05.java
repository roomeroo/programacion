package programacion.UT3.libro;
import java.util.Scanner;
public class ejercicio05
{
    public static void main (String[] arguments)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Escriba la base del rectángulo(m): ");
        int base = s.nextInt();
        System.out.print("\nEscriba la altura del rectángulo(m): ");
        int altura = s.nextInt();
        System.out.print("El área del rectangulo es: " + base * altura + " m2.");
    }

}
