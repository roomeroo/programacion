public class Coche extends Vehiculo{
    private int kilometrajeCoche = 0;

    Coche(){
        Vehiculo.setVehiculosCreados();
    }

    Coche(int kilometraje){
        Vehiculo.setKilometrajesTotales(kilometraje);
        Vehiculo.setVehiculosCreados();
        kilometrajeCoche = kilometraje;
    }

    public void setKilometraje(int kilometros){
        Vehiculo.setKilometrajesTotales(kilometros);
        kilometrajeCoche += kilometros;
    }

    public int getKilometraje(){
        return (kilometrajeCoche);
    }

    public void andarcoche(int kilometros){
        System.out.println("Wow, has hecho movido tu coche " + kilometros + " kms.");
        Vehiculo.setKilometrajesTotales(kilometros);
        kilometrajeCoche += kilometros;
    }

    public static void quemarRueda(int segundos){
        System.out.println("Wow has quemado rueda " + segundos + " segundos.");
    }
}
