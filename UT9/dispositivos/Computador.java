public class Computador extends Dispositivo implements Encendible {
    private String ram;
    private String disco;
    private String procesador;
    private String programa;
    private boolean encendido;

    Computador(String ram, String disco, String procesador, String marca){
        super(marca);
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        encendido = false;
        programa = "";
    }

    public void apagar(){
        encendido = false;
        programa = "";
    }

    public void apagar(String programa){
        encendido = true;
        this.programa = programa;
    }

    @Override
    public String toString(){
        return ("RAM: " + ram + ".\nDISCO: " + disco + ".\nPROCESADOR: " + procesador + " programa: " + programa + " encendido: " + encendido);
    }
}
