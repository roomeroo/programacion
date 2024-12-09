package examenTurnoMañana;

public class TablaDeNumeros {
    public static void main (String[] arguments) {
        int numerin = 0;
        System.out.print("Introduce el valor mínimo: ");
        int minimo = buscarMinimo(Integer.parseInt(System.console().readLine()));
        System.out.print("Introduce el valor máximo: ");
        int maximo = buscarMaximo(Integer.parseInt(System.console().readLine()));
        for (int i = 0; i < maximo; i++){
            numerin = (int)(Math.random() * (maximo - minimo) + 1) + minimo;
            for(int h = 0 ; h < (maximo - 1) * 5; h++){
                if(h % 4 == 0){
                    System.out.print(" ");
                }else System.out.print("-");
            }
            System.out.println("");
                System.out.print("| " + numerin + " |");
                for (int j = 0; j < maximo; j++){
                    if(j < numerin){
                        System.out.print(" * |");
                    }else System.out.print("   |");
                }
                System.out.println("");
        }
    }

    public static int buscarMinimo(int numero) {
        int min = 10;
        while(numero > 0){
            if(numero % 10 <= min)
                min = numero % 10;
            numero /= 10;    
        }
        return (min);
    }
    public static int buscarMaximo(int numero) {
        int max = 0;
        while(numero > 0){
            if(numero % 10 >= max)
                max = numero % 10;
            numero /= 10;    
        }
        return (max);
    }

    public static int numeroRandom (int a, int b) {
        return (int)(Math.random() * (b - a +1  )) + a;
    }
}