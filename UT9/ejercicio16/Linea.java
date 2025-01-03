package ejercicio16;

public class Linea {
    Punto p1 ;
    Punto p2;

    public Linea(Punto p, Punto g){
        p1 = p;
        p2 = g;
    }

    public String toString(){
        return("El primer punto es," + p1 + " y el segundo punto es " + p2);
    }
}
