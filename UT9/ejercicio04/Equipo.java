package UT9.ejercicio04;

public class Equipo {
    String nombreEquipo = "";
    int numJugadores = 0;
    float precio = 0;
    Jugador[] jugadores = new Jugador[3];
    
    Equipo(int numJugadores, float precio, String nombreEquipo){
        this.numJugadores = numJugadores;
        this.precio = precio;
        this.nombreEquipo = nombreEquipo;
    }

    public void asignarJugadores(Jugador a, Jugador b, Jugador c){
        jugadores[0] = a;
        jugadores[1] = b;
        jugadores[2] = c;
    }

    public String getNombre(){
        return (nombreEquipo);
    }

    public String devolverJugadores(){
        String strJugadores = "";
        for(int i = 0; i < 3; i++){
            strJugadores += jugadores[i].toString() + "\n";
        }
        return (strJugadores);
    }
}
