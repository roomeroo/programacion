package TRYCATCH;

public class Prueba{
    public static void main(String[] args) {
        System.out.println("Introduzca un numero");
        int num = 0;
        boolean incorrecta = true;
    while(true && incorrecta == true){
            try{
                num = Integer.parseInt(System.console().readLine());
                incorrecta = false;
                System.out.println("tu numero es america " + num);
            }catch(Exception ex){
                System.out.println("Eso no es un numero, informacion mas detallada:");
                System.out.println(ex);
                System.out.println("Vuelva a decir un numero anda");
            }
        }
    }
}