package UT5.ejercicio25;

public class ejercicio25 {
    public static void main(String[] arguments) {
        System.out.print("Escribe el numerin: ");
        int num = Integer.parseInt(System.console().readLine());
        int revNum = 0;
        char flag = '\0';
        boolean zero=false;
        if(num%10 == 0)
            zero=true;
        while(num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num/10;
        }
        if(zero == true)
            flag = '0';
        System.out.println("El numero al reves es: " + flag +revNum);
    }
    /*      No maneja los casos en el que el numero empiece en 0      */
}