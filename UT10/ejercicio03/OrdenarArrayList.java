package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Introduce 10 numeros: ");
        for(int i = 0; i< 10; i++){
            System.out.print("introduce: ");
            int number = Integer.parseInt(System.console().readLine());
            numeros.add(number);
        }
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
