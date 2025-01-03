package UT9.ejercicio11;

public class TarjetaRegalo {
    private double saldo = 0;
    private String id = "";
    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        generarId();
    }

    private void generarId(){
        for(int i = 0; i < 5; i++){
            id += (int)(Math.random() * 10);
        }
    }

    public double getSaldo(){
        return (saldo);
    }

    public void eliminarTarjeta(){
        saldo = 0;
        id = null;
    }

    public void fusionaCon(TarjetaRegalo tarjeta){
        this.saldo += tarjeta.getSaldo();
        tarjeta.eliminarTarjeta();
    }

    public String toString(){
        return("Tarjeta nº " + id + " - Saldo: " + saldo);
    }
}
