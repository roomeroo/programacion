package UT9.ejercicio03;

public class App {
    public static void main(String[] args){
        int personas = Integer.parseInt(System.console().readLine());
        Vivienda casa = new Vivienda(personas,"Juan de anchieta 26");
        System.out.println((casa.toString()));
        System.out.println("Hay algun nuevo inquilino");
        personas = Integer.parseInt(System.console().readLine());
        casa.sumarInquilino(personas);
        System.out.println(casa.toString());
    }
}
