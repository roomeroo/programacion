public class App {
    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia(219, "discos kingSpec");
        Incidencia inc2 = new Incidencia(129, "pantalla congelada");
        Incidencia inc3 = new Incidencia(03, "no windows instalados");
        Incidencia inc4 = new Incidencia(9, "no worker in bound");

        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        inc3.resolver("Descargar windows");
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(Incidencia.getPendientes());

    }
}
