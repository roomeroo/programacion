package ejercicio16;

public class Punto {
    double x = 0;
    double y = 0;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return("(" + x + ", " + y + ")");
    }
}
