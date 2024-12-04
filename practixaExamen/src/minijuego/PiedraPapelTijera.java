package minijuego;

public class PiedraPapelTijera {
    public static int randInt() {
        return ((int)(Math.random() * (3)) + 1);
    }

    public static boolean comprobar(int cpu, int player){           // CPU GANA == TRUE
        if (cpu == 1 && player == 3){   // tijeras gana a papel
            return (true);
        }else if (cpu == 2 && player == 1){ //piedra gana a tijera
            return (true);
        }else if (cpu == 3 && player ==1){  //papel gana a piedra
            return (true);
        }else return (false);      //CPU pierde
    }

    public static void juego(){
        String jugar = "si";
        do{    
            System.out.println("Que vas a sacar:");
            System.out.println("1.Tijeras.");
            System.out.println("2.Piedra.");
            System.out.println("3.Papel.");
            int player = Integer.parseInt(System.console().readLine());
            int cpu = randInt();
            if(cpu == player){
                System.out.println("Empate");
            }else if(comprobar(cpu,player)){
                System.out.println("Pierdes...");
            }else System.out.println("Ganas");
            System.out.println("Desea seguir jugando? T/F");
            jugar = System.console().readLine();
        }while(jugar.equals("Si") || jugar.equals("si"));
    }
}
