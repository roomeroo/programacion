package adelantarPosicion;

public class AdelantarPos {
    public static void main(String[] args){
        int numeros[] = new int[15];
        int adelanto[] = new int[numeros.length];
        System.out.println("Escribeme los valores");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        adelanto[0] = numeros[numeros.length - 1];
        for(int i = 1; i< numeros.length; i++){
            adelanto[i] = numeros[i - 1];
        }
        System.out.println("Estos son tus numeros con una posicion adelantada");
        for(int i = 0; i< numeros.length; i++){
            System.out.println("Posicion " + i + ": " + adelanto[i]);
        }

    }
}
