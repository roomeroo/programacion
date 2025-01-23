public abstract class Dispositivo {
    private static int contadorDispositivo = 0;
    private String marca;

    Dispositivo(String marca){
        this.marca = marca;
        contadorDispositivo++;
    }

    public static int getContadorDispositivos(){
        return (contadorDispositivo);
    }

    public static void setContadorDispositivos(){
        contadorDispositivo += 1;
    }

    public String getMarca(){
        return (marca);
    }

    public String toString(){
        return ("De la marca " + marca + " hay un total de " + contadorDispositivo + " dispositivos.");
    }
}
