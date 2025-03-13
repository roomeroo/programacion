package migue;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Migue{
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("migue.txt"));
        for(int i = 0; i < 999999; i++){
            bw.write("migue teton");
        }
        bw.close();
    }
}