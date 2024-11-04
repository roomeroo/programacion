//CONTADOR DE NUMEROS + Y-
package programacion.UT5.ejercicio13;

public class ejercicio13 {
    public static void main(String[] arguments){

        int n = 0;
        int positivos, negativos;
        positivos = 0;
        negativos = 0;
        System.out.println("Escriba los numeros 10 numerines.");
        for (int i = 1; i <= 10; i++){
            System.out.print("Escriba el numero " + i + ": ");
            n = Integer.parseInt(System.console().readLine());
            if( n>= 0)//Suponemos que 0 es positivo aunque 
                 positivos++;
            else negativos++;           //no tiene por que serlo
        }
        System.out.println("El numero de indices positivos son: "+ positivos + ".");
        System.out.println("El numero de indices negativos son: "+ negativos + "." );

    }
}
