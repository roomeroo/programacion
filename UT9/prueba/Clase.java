package prueba;

public class Clase {
    public static int numeroClases = 0;
    public int orden;

    Clase(){
        orden = numeroClases;
        numeroClases++;
    }
}