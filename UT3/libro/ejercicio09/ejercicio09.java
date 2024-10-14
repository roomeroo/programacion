package programacion.UT3.libro.ejercicio09;
import java.util.Scanner;
public class ejercicio09
{
    public static void main(String[] arguments)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime el radio del cono: ");
        float r = s.nextFloat();
        System.out.print("\nDime la altura del cono: ");
        float h = s.nextFloat();
        System.out.printf("\nEl volumen del cono es %.3f m2.", (((3.1415 / 3) * (r * r) * h)));
        s.close();
    }
}
