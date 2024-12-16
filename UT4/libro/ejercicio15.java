package UT4.libro;
import java.util.Scanner;
public class ejercicio15
{
 
    public static void main(String[] arguments)
    {
        Scanner s = new Scanner(System.in);
        String direccion = "";
        System.out.print("A donde quieres que apunte la piramide");
        do
        {
            direccion = s.next();

        }while(!direccion.equals("izquierda") && !direccion.equals("derecha") && !direccion.equals("abajo") && !direccion.equals("abajo"));
        s.close();
    }


}