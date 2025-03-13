import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("numerosPrimos.txt"));
        for(int i = 1; i < 500; i++){
            if(esPrimo(i))
                bw.write(i + "\n");
        }

        bw.close();
    }

    public static boolean esPrimo(int numero){
        boolean primo = true;
        for(int i = 2; i <= numero / 2; i++){
            if(numero % i == 0){
                primo = false;
            }

        }
        return (primo);
    }
}
