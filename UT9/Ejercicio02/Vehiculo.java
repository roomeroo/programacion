public abstract class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrajesTotales = 0;

    public static int getVehiculosCreados(){
        return (vehiculosCreados);
    }

    public static void setVehiculosCreados(){
        vehiculosCreados++;
    }

    public static int getKilometrajesTotales(){
        return(kilometrajesTotales);
    }

    public static void setKilometrajesTotales(int kilometros){
        kilometrajesTotales += kilometros;
    }
}
