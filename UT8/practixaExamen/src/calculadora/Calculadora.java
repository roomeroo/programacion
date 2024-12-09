package calculadora;

public class Calculadora {
    public static void menu(int option){
        System.out.print("Primer numero: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Segundo numero¨");
        int num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Tenemos estas opciones:");
        System.out.println("1.Sumar.");
        System.out.println("2.Restar.");
        System.out.println("3.Multiplicar.");
        System.out.println("4.Dividir.");
        int calculatorOption = Integer.parseInt(System.console().readLine());
        switch (calculatorOption) {
            case 1:
                System.out.println(sumar(num1 , num2));
                break;
            case 2:
                System.out.println(restar(num1 , num2));
                break;
            case 3:
                System.out.println(multiplicar(num1, num2));
                break;
            case 4:
                System.out.println(dividir(num1, num2));
                break;
            default:
                System.out.println("#-#-# ERROR #-#-#");
                break;
        }
    }
    public static int sumar(int a, int b){
        return (a + b);
    }

    public static int restar(int a, int b){
        return (a - b);
    }

    public static float dividir(int a, int b){
        return((float)a / (float)b);
    }

    public static int multiplicar(int a,int b){
        return (a * b);
    }
}
