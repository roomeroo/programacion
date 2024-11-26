package UT1.Libro.ejercicio08;

public class piramide_hueca_invertida {
    public static void main(String[] arguments)
    {
        int i, j, size;
        j = 0;
        size = 9;
        i = ((size+ 1) / 2);
        while(i > 0)
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
            i--;
        }
    
    }
}