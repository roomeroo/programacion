public class Programa {
    public static void main(String[] args) {
        boolean salir = false;
        int option = -1;
        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();

        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println("VEHÍCULOS\n" + //
                    "=========\n" + //
                    "1. Anda con la bicicleta\n" + //
                    "2. Haz el caballito con la bicicleta\n" + //
                    "3. Anda con el coche\n" + //
                    "4. Quema rueda con el coche\n" + //
                    "5. Ver kilometraje de la bicicleta\n" + //
                    "6. Ver kilometraje del coche\n" + //
                    "7. Ver kilometraje total\n" + //
                    "8. Salir");
            System.out.print("Que eliges: ");
            option = Integer.parseInt(System.console().readLine());

            switch (option) {
                case 1:
                    System.out.print("Durante cuantos metros has estado andando: ");
                    bici.andarBicicleta(Integer.parseInt(System.console().readLine()));
                    break;
                case 2:
                    System.out.print("Durante cuantos metros has hecho el caballito: ");
                    bici.andarBicicleta(Integer.parseInt(System.console().readLine()));
                    break;
                case 3:
                    System.out.print("Durante cuantos kilometros has andado con el coche: ");
                    coche.andarcoche(Integer.parseInt(System.console().readLine()));
                    break;
                case 4:
                    System.out.print("Cuantos segundos has quemado rueda: ");
                    coche.quemarRueda(Integer.parseInt(System.console().readLine()));
                    break;
                case 5:
                    System.out.println("Tu bicicleta ha recorrido un total de " + bici.getKilometraje() + " kilometros");
                    break;
                case 6:
                    System.out.println("Tu coche tiene un total de " + coche.getKilometraje() + " kilometros.");
                    break;
                case 7:
                    System.out.println("Los vehiculos tienen un total de " + Vehiculo.getKilometrajesTotales() + " kilometros.");
                    break;
                case 8:
                    System.out.println("adios imbecil");
                    salir = true;
                    break;

                default:
                    salir = false;
                    break;
            }
            System.console().readLine();
        } while (!salir);
    }
}