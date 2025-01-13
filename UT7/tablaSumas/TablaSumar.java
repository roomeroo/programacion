package tablaSumas;

public class TablaSumar {
    public static void main(String[] args){
        int table[][] = {
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5}
        };
        int sumandoX = 0;
        int sumandoY = 0;
        int total = 0;
        System.out.println("A continuacion, voy a pedirte los 20 numeros");

        // for(int i = 0; i < table.length; i++){
        //     for(int j = 0; j< table[i].length; j++){
        //         table[i][j] = Integer.parseInt(System.console().readLine());
        //     }
        // }

        System.out.println("Esta es la tabla resultante:");
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j< table[i].length; j++){
                System.out.print(table[i][j] + "   ");
                sumandoX += table[i][j];
            }
            System.out.println("  " + sumandoX);        //CONTAR FILAS
            total += sumandoX;
            sumandoX = 0;
        }
        System.out.println();
        for(int j = 0; j < table[0].length; j++){
            for(int i = 0; i < table.length; i++){
                sumandoY +=table[i][j];
            }
            System.out.print(sumandoY + "  ");
            sumandoY = 0;
        }
        System.out.println(total);
    }
}
