package programacion.UT5.ejercicio07;
public class ejercicio07 {
    public static void main(String[] arguments){
        int pass = 1234;
        int user_pass = 0;
        do{
           System.out.print("Introduzca el código de 4 dígitos: ");
           user_pass = Integer.parseInt(System.console().readLine());
           if(user_pass != pass)
                System.out.println("Contraseña errónea.");
            else
                System.out.println("Contraseña correcta");

        }while(user_pass != pass);
    }
}
