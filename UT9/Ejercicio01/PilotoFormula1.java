package Ejercicio01;

public class PilotoFormula1 {
    int edad = 0;
    String nombre = "";
    int anosExp = 0;
    
    PilotoFormula1(String nombre, int edad, int anosExp){
        this.nombre += nombre;
        this.edad = edad;
        this.anosExp = anosExp;
    }
    public void firmar(){
        System.out.println("Firmado por " + nombre);
    }
    public void darDatos(){
        System.out.println("Tengo " + edad + " años.");
        System.out.println("Y llevo " + anosExp + " años corriendo.");
    }
    public void sumarAnos(){
        System.out.println("Felicidades, + " + this.nombre);
        this.edad += 1;
        this.anosExp += 1;
    }
}