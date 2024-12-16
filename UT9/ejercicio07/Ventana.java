package UT9.ejercicio07;

public class Ventana {
    int largo = 0;
    int ancho = 0;
    String nombre = "";

    Ventana(int largo, int ancho, String nombre){
        this.largo = largo;
        this.ancho = ancho;
        this.nombre = nombre;
    }

    public void redimensionar(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    public void cerrar(){
        this.largo = 0;
        this.ancho = 0;
        this.nombre = "";
    }

    public int getLongitud(){
        return (largo);
    }

    public int getAncho(){
        return (ancho);
    }

    public String getNombre(){
        return (nombre);
    }

    public String toString(){
        return("Es " + largo + " pixeles de largo y " + ancho + " pixeles de ancho, se llama " + nombre);
    }
}
