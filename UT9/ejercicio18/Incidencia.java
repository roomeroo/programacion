public class Incidencia{
    private String codigo = "";
    private String motivo = "";
    int puesto = 0;
    private String estado = "pendiente";
    private String solucion = "";
    private static int numero = 0;
    private int numObjeto = 0;
    private static int numeroPendientes = 0;
    public Incidencia(int puesto, String motivo){
        this.puesto = puesto;
        this.motivo = motivo;
        numObjeto = ++numero;
        numeroPendientes++;
        generarCodigo();
    }

    private void generarCodigo(){
        codigo = "" + (int)(Math.random() * 1000);
    }

    public void resolver(String solucion){
        this.solucion = solucion;
        estado = "resuelta";
        numeroPendientes--;
    }

    public static int getPendientes(){
        return (numeroPendientes);
    }

    public String toString(){
        if(estado.equals("resuelta"))
            return ("Incidencia " + numObjeto + " - Puesto: " + codigo + " - " + motivo + " - " + estado + " - " + solucion);
        return ("Incidencia " + numObjeto + " - Puesto: " + codigo + " - " + motivo + " - " + estado);
    }
}