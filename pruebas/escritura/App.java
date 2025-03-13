import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App{
    public static void main(String args[]){
        try {
            File original = new File("fruta.txt");
            File cambiado = new File("fruta.txt.tmp");
            original.renameTo(cambiado);
            String linea = "";

            BufferedWriter bw = new BufferedWriter(new FileWriter(original, true)); //se crea un archivo con el nombre original
            BufferedReader br = new BufferedReader(new FileReader(cambiado));
            linea = br.readLine();
            while(linea != null){
                if(linea.equals("piña")){
                    System.out.println("piña no escrita");
                }else{
                    bw.write(linea + "\n");
                }
                linea = br.readLine();
            }
            br.close();
            bw.close();
            cambiado.delete();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}