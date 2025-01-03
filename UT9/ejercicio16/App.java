package ejercicio16;

public class App {
    public static void main(String[] args){
        Punto punto1 = new Punto (3,2);
        Punto punto2 = new Punto (6,7);
        Linea linea1 = new Linea (punto1, punto2);
        System.out.println(linea1);
    }
}
