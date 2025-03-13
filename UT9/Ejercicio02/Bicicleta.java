public class Bicicleta extends Vehiculo{
    private int kilometrajeBici = 0;
    
    Bicicleta(){
        Vehiculo.setVehiculosCreados();
    }

    public void setKilometraje(int kilometros){
        Vehiculo.setKilometrajesTotales(kilometros);
        kilometrajeBici += kilometros;
    }

    public int getKilometraje(){
        return (kilometrajeBici);
    }

    public void hacerCaballito(int metros){
        System.out.println("Wow, has hecho el caballito " + metros + " metros.");
        Vehiculo.setKilometrajesTotales(metros / 1000);
        kilometrajeBici += (metros / 1000);
    }

    public void andarBicicleta(int metros){
        System.out.println("Wow, has hecho movido tu bicicleta " + metros + " metros.");
        Vehiculo.setKilometrajesTotales(metros / 1000);
        kilometrajeBici += (metros / 1000);
    }
}
