package ejercicio100;

public class App {
    public static void main(String[] args){
        Gato gatetes[] = new Gato[4];
        for(int i = 0; i < gatetes.length; i++){
            System.out.println("Dime el nombre del gato " + (i + 1));
            String nombre = System.console().readLine();
            System.out.println("Dime la edad del gatete " + (i + 1));
            int edad = Integer.parseInt(System.console().readLine());
            System.out.println("Especifique la raza del gato " + (i + 1));
            String raza = System.console().readLine();

            gatetes[i] = new Gato(nombre, edad, raza);
        }

        System.out.println("Estos son tus gatetes:");
        for(int i = 0; i < gatetes.length; i++){
            System.out.println(gatetes[i]);
        }
    }
}
