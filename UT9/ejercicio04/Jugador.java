package UT9.ejercicio04;

public class Jugador {
    String nombre = "";
    int edad = 0;
    Equipo equipo = null;

    Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    Jugador(String nombre, int edad, Equipo equipo){
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public void asignarEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    public String toString() {
        return ("El nombre del jugador es " + nombre + " tiene " + edad + " y pertenece al equipo " + equipo.getNombre() + ".");
    }
    public String getNombre(){
        return(nombre);
    }

    public int getEdad(){
        return(edad);
    }

    public Equipo getEquipo(){
        return(equipo);
    }
}
