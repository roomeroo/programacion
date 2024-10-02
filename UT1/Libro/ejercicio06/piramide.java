package programacion.UT1.Libro.ejercicio06;

public class piramide {
    public static void main(String[] arguments)
    {
        int i, j, size;
        i = 1;
        j = 0;
        size = 9;
        while(i < ((size+ 1) / 2) + 1)
        {
            while(j < ((size + 1) / 2) - i)
            {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while(j < i * 2 - 1)
            {
                System.out.print("*");
                j++;
            }
            j = 0;
            while(j < ((size + 1) / 2) - i)
            {
                System.out.print(" ");
                j++;
            }
            j = 0;
            System.out.println("");
            i++;
        }
    
    }
}
