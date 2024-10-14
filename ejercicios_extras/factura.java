package programacion.ejercicios_extras;
import java.util.Scanner;
public class factura
{
 
    public static void main(String[] arguments)
    {
        Scanner s = new Scanner(System.in);//Creo mi variable de clase Scanner
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = s.nextLine();//Recojo el nombre del cliente
        System.out.print("\nIngrese la dirección del cliente: ");
        String direccion = s.nextLine();//Recojo la direccion del cliente.
        System.out.print("\nIngrese el número de teléfono del cliente: ");
        String telefono = s.nextLine();//Recojo el telefono del cliente

        System.out.print("\nIngrese el nombre del primer producto: ");
        String producto1 = s.nextLine();
        System.out.print("\nIngrese el precio unitario del primer producto: ");
        Float precio1 = s.nextFloat();
        System.out.print("\nIngrese la cantidad comprada del primer producto: ");
        int cantidad1 =  s.nextInt();
        s.nextLine(); // LIMPIAMOS EL BUFFER
        
        System.out.print("\nIngrese el nombre del segundo producto: ");
        String producto2 = s.nextLine();
        System.out.print("\nIngrese el precio unitario del segundo producto: ");
        Float precio2 = s.nextFloat();
        System.out.print("\nIngrese la cantidad comprada del segundo producto: ");
        int cantidad2 =  s.nextInt();
        s.nextLine(); // LIMPIAMOS EL BUFFER
        
        System.out.print("\nIngrese el nombre del tercer producto: ");
        String producto3 = s.nextLine();
        System.out.print("\nIngrese el precio unitario del tercer producto: ");
        Float precio3 = s.nextFloat();
        System.out.print("\nIngrese la cantidad comprada del tercer producto: ");
        int cantidad3 =  s.nextInt();
            s.nextLine(); // LIMPIAMOS EL BUFFER

        System.out.print("-------------------------------\n");
        System.out.print("            FACTURA\n");
        System.out.print("-------------------------------\n");
        /*              IMPRIMO LA INFORMACION DE MI CLIENTE                */
        System.out.print("Cliente: " + nombre + "\n");
        System.out.print("Dirección: " + direccion + "\n");
        System.out.print("Teléfono: " + telefono + "\n");

        System.out.print("Producto       Precio Unitario  Cantidad  Total Parcial");
        System.out.print("\n-------------------------------------------------------");
        System.out.printf("\n%-15s  %-15.2f %-10d    %-15.2f     ", producto1 , precio1, cantidad1,precio1 * cantidad1 );
        System.out.printf("\n%-15s  %-15.2f %-10d    %-15.2f     ", producto2 , precio2, cantidad2,precio2 * cantidad2 );
        System.out.printf("\n%-15s  %-15.2f %-10d    %-15.2f     ", producto3 , precio3, cantidad3,precio3 * cantidad3 );

        s.close();
    }
}
