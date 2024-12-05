package UT5.ejercicio12;
public class ejercicio12 {
    public static void main(String[] arguments){
        long primero, segundo, temporal, fibonacci;
        System.out.print("Introduzca el numero de posiciones de la secuencia de Fibonacci que quieres ver: ");
        int pos = Integer.parseInt(System.console().readLine());
        primero = 0;
        segundo = 1;
        temporal = '\0';// Inicializo como caracter nulo
        fibonacci = '\0';
        System.out.print(primero + " ,"); 
        System.out.print(segundo);
        for (int i = 2; i<= pos; i++){
            fibonacci = primero + segundo;
            System.out.print(", " + fibonacci);
            temporal = primero;
            primero = segundo;
            segundo = segundo + temporal;
            i++;
        }
        System.out.print(".");                    
    }
}
