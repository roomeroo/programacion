package prueba;

public class D20 {
    public static void main (String[] arguments) {
        Boolean play = true;
        String ans = "";
        while (play) {
            System.out.print("El dado ha marcado: ");
            System.out.println((int)(Math.random()*20) + 1  );
            System.out.print("\n¿Desea seguir jugando? ");
            ans = System.console().readLine();
            if (ans.equals("no"))
                play = false;
        }
    }
}