package UT9.ejercicio03;

public class Vivienda {
    int numPersonas = 0;
    String direccion = "";
    public Vivienda(int numPersonas, String direccion){
        this.direccion = direccion;
        this.numPersonas = numPersonas;
    }
    public void sumarInquilino(int numInquilino){
        System.out.println("Se han sumado " + numInquilino + " al total de inquilinos.");
        numPersonas += numInquilino;
    }

    public String toString(){
        return("En el domicilio de " + direccion + ", vive un total de " + numPersonas + " personas");
    }
}