package UT9.ejercicio04;

public class TorneoBaloncesto {
    Equipo equipos[] = new Equipo[3];

    public TorneoBaloncesto(Equipo a, Equipo b, Equipo c){
        equipos[0] = a;
        equipos[1] = b;
        equipos[2] = c;
    }

    public String toString(){
        String strJugadores = "";
        for(int i = 0; i < 3; i++){
            strJugadores += "equipo " + (i + 1) + ":\n" + equipos[i].devolverJugadores() + "\n";
        }
        return(strJugadores);
    }
}
