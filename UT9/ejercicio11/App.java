package UT9.ejercicio11;

public class App {
    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(150.65);
        TarjetaRegalo t2 = new TarjetaRegalo(200);
        TarjetaRegalo t3 = new TarjetaRegalo(500);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
    }   
}
