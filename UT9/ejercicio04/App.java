package UT9.ejercicio04;

public class App {
    public static void main(String[] args){
        Jugador Federico = new Jugador("Federico", 32);
        Jugador Migue = new Jugador("MiguelDelPitillo", 19);
        Jugador Joseantonio22 = new Jugador("JoseAntonio", 19);

        Jugador Parras = new Jugador("Parras",152);
        Jugador Jamal = new Jugador("Jamal", 1229);
        Jugador Lobo = new Jugador("lobo", 19);

        Jugador Adri = new Jugador("Adri",120);
        Jugador Porron = new Jugador("Porron", 12);
        Jugador Abdul = new Jugador("Abdul", 19);

        Equipo malaga = new Equipo(3,12000000, "malaga");

        Federico.asignarEquipo(malaga);
        Migue.asignarEquipo(malaga);
        Joseantonio22.asignarEquipo(malaga);
        malaga.asignarJugadores(Federico,Migue,Joseantonio22);

        Equipo sevilla = new Equipo(3,6000000, "sevilla");

        Parras.asignarEquipo(sevilla);
        Jamal.asignarEquipo(sevilla);
        Lobo.asignarEquipo(sevilla);
        sevilla.asignarJugadores(Parras, Jamal, Lobo);

        Equipo maqueda = new Equipo(3,12,"maqueda");

        Adri.asignarEquipo(maqueda);
        Porron.asignarEquipo(maqueda);
        Abdul.asignarEquipo(maqueda);
        maqueda.asignarJugadores(Adri, Porron, Abdul);

        TorneoBaloncesto torneo1 = new TorneoBaloncesto(malaga, sevilla, maqueda);

        System.out.println("\n\n");
        System.out.println(torneo1.toString());
    }
}
