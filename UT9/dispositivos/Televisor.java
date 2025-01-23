public class Televisor extends Dispositivo implements Encendible{
    private int diagonal;
    private String tecnologia;
    private boolean encendido;
    private String canal;

    Televisor(int diagonal,String marca, String tecnologia, String canal, boolean encendido){
        super(marca);
        this.diagonal = diagonal;
        this.tecnologia = tecnologia;
        this.canal = canal;
        this.encendido = encendido;
    }

    public void encender(String canal){
        this.canal = canal;
        encendido = true;
    }

    public void apagar(){
        canal = "";
        encendido = false;
    }

    @Override
    public String toString(){
        return ("Televisor[Diagonal: " + diagonal + ", marca: " + super.getMarca() + ", tecnologia: "+ tecnologia + ", canal " + canal + " + encendido: " + encendido + "]");
    }
}
