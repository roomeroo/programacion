package UT5.ejercicio23;

public class ejercicio23 {
    public static void main(String[] arguments){
        int acumulador = 0, index = 0, media = 0;
        Boolean fin = false;
        do{
            System.out.print("Cuanto quieres sumar?: ");
            media = Integer.parseInt(System.console().readLine());
            if(media + acumulador <= 1000){
                acumulador += media;
                index++;
            }else fin = true;
            
        }while(fin==false);
        System.out.println("El numero que has sumado es: " + acumulador);
        System.out.println("Y la media es: " + (float)acumulador/(float)index);

    }
}
