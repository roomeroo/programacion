public class Libreria {
    String nombre;
    String direccion;
    Libro libros[] = new Libro[3];

    Libreria(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void añadirLibro(Libro libro){
        if(Utilidades.nuevoLibro(libros) >= 0){
            libros[Utilidades.nuevoLibro(libros)] = libro;
        }else System.out.println("Error: no hay espacio disponible."); 
    }
}
