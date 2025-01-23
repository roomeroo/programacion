public class GestionDispositivos{
    public static void main(String args[]) {
        Dispositivo dispositivos[] = new Dispositivo[10];
        dispositivos[0] = new Televisor(40,"LG", "OLED", "machupichu", true);
        dispositivos[1] = new Televisor(40,"LG", "OLED", "machupichu", true);
        ((Encendible) dispositivos[0]).encender();
    }
}