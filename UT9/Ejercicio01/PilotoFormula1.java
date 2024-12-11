package UT9.Ejercicio01;

public class PilotoFormula1 {
    int edad = 0;
    String nombre = "";
    int anosExp = 0;
    public PilotoFormula1(String nombre, int edad, int anosExp){
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
}