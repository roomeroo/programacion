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
        System.out.print("\nEl volumen del cono es " + ((1/3) *3.14 * (r * r) * h));
    }
}
