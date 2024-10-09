package programacion.UT1.Libro.ejercicio04;

public class horario
{
    public static void main(String[] args)
    {   System.out.println("┌────────────┬────────────┬───────────┬────────────┬───────────┐");
        System.out.printf("│%9s   │%9s   │ %9s │ %9s  │%9s  │\n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        System.out.println("├────────────┼────────────┼───────────┼────────────┼───────────┤");
        System.out.printf("│%9s   │%9s   │%9s  │%9s   │%9s  │\n", "Edes", "Dig", "Lmsg", "Lmsg", "BADAT");
        System.out.println("├────────────┼────────────┼───────────┼────────────┼───────────┤");
        System.out.printf("│%9s   │%9s   │%9s  │%9s   │%9s  │\n", "Edes", "Badat", "prog", "Lmsg", "BADAT");
        System.out.println("├────────────┼────────────┼───────────┼────────────┼───────────┤");
        System.out.printf("│%9s   │%9s   │%9s  │%9s   │%9s  │\n", "Edes", "Badat", "prog", "sist", "sist");
        System.out.println("├────────────┼────────────┼───────────┼────────────┼───────────┤");
        System.out.printf("│%9s   │%9s   │%9s  │%9s   │%9s  │\n", "prog", "Ipei", "prog", "sist", "sist");    
        System.out.println("├────────────┼────────────┼───────────┼────────────┼───────────┤");
        System.out.printf("│%9s   │%9s   │%9s  │%9s   │%9s  │\n", "prog", "Ipei", "Badat", "prog", "sist");
        System.out.println("├────────────┼────────────┼───────────┼────────────┼───────────┤");
        System.out.printf("│%9s   │%9s   │%9s  │%9s   │%9s  │\n", "prog", "Ipei", "Badat", "prog", "    ");
        System.out.println("└────────────┴────────────┴───────────┴────────────┴───────────┘");
    }
}