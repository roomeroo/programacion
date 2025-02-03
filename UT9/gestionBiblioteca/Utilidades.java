public class Utilidades {
    public static int nuevoLibro(Libro libros[]){
        int pos = 0;
        while(libros[pos] != null && pos < libros.length)
            pos++;
        if(pos < libros.length)
            return pos;
        return (-1);
    }
}
