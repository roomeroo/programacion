package reloj;

public class reloj {
    private static void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args){
        limpiarPantalla();
        while(true){
            for(int d = 0; d <= 9; d++){//dias
                for(int i = 0; i < 24; i++){//hora
                    for(int j = 0; j < 60; j++){//MINUTERO
                        for(int k = 0; k < 60; k++){   //SEGUNDERO
                            System.out.printf("%02d : %02d : %02d : %02d", d, i, j, k);
                            try{
                                Thread.sleep(1000);
                            }catch(Exception ex){
                                System.out.println("Ha habido un problema, ERROR:" + ex.getClass());
                            }
                            limpiarPantalla();
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
