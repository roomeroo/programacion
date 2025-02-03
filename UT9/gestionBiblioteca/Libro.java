public class Libro{
    private float precioVenta;
    private String titulo;
    private String autor = "Anónimo";
    private int anioPub;
    private String genero = "";

    Libro(String titulo, float precioVenta, int anioPub){
        this.titulo = titulo;
        this.precioVenta = precioVenta;
        this.anioPub = anioPub;
    }
    Libro(String titulo, float precioVenta, int anioPub, String autor, String genero){  //Constructor mas completo
        this.titulo = titulo;
        this.precioVenta = precioVenta;
        this.anioPub = anioPub;
        this.autor = autor;
        this.genero = genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return (genero);
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return (autor);
    }

    public void setAAnioPub(int anioPub){
        this.anioPub = anioPub;
    }

    public int getAnioPub(){
        return (anioPub);
    }

    public float getPrecioVenta(){
        return (precioVenta);
    }

    public String getTitulo(){
        return (titulo);
    }
}