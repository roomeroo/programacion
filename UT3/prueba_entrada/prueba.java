package programacion.UT3.prueba_entrada;
import java.util.Scanner;
public class prueba
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        /*System.out.print("Digame un numero, y le dire su cuadrado: ");
        String str = System.console().readLine();
        int i = Integer.parseInt(str);

        System.out.println("El cuadrado de "+ i + " es: " + i*i + ".");
        System.out.print("Ahora lo realizaremos con la clase Scanner, Introduzca un numero: ");
        i = a.nextInt();
        System.out.println("\nEl cuadrado de" + i + " es: " + i*i + " \u8341.");*/

        
      
        int num = Integer.parseInt(a.next());
        if(!a.hasNext())
        {
            a.next();
            System.out.println("\nhubo problema");
        }
        System.out.println(" " + num);
        a.close();
    }
}
