package main;
import piramide.Piramide;
import calculadora.Calculadora;
import minijuego.PiedraPapelTijera;
public class Main {
    public static void main(String[] arguments){
        int option = 5;
        do{
        System.out.println("Que desea hacer:");
            System.out.println("1.Calculadora");
            System.out.println("2.Pintar piramide aleatoria.");
            System.out.println("3.Piedra, papel y tijera.");
            System.out.println("5.Nada");
            option = Integer.parseInt(System.console().readLine());
            switch (option) {
                case 1:
                    Calculadora.menu(option);
                    break;
                case 2:
                    Piramide.piramide();
                    break;
                case 3:
                    PiedraPapelTijera.juego();
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("#-#-# ERROR #-#-#");
                    break;
            }
        }while(option != 5);
    }
}
