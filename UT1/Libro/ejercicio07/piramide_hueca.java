package UT1.Libro.ejercicio07;

public class piramide_hueca {
    public static void main(String[] arguments)
    {
        int i, j, size;
        i = 1;
        j = 0;
        size = 17;
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
                if(i != ((size+ 1) / 2))
                {
                    if(j == 0 || j == i * 2 - 2)
                        System.out.print("*");
                    else
                        System.out.print(" "); 
                }
                else
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
