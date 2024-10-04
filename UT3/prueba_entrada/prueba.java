import java.util.Scanner;
package programacion.UT3.prueba_entrada;
public class prueba
{
    public static void main(String[] args)
    {
        System.out.print("Digame un numero, y le dire su cuadrado: ");
        String str = System.console().readLine();
        int i = Integer.parseInt(str);
        System.out.println("El cuadrado de "+ i + " es: " + i*i + ".");
        System.out.print("Ahora lo realizaremos con la clase Scanner, Introduzca un numero: ");
        str = System.console().Scanner();
    }    
}
