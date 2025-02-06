import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorCoches implements CRUD<Coche>{
    private File fichero;

    
    @Override
    public ArrayList<Coche> recuperarTodos() {
        ArrayList<Coche> coches = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea = "";
            while((linea = br.readLine()) != null){
                Coche coche = new Coche(linea);
                coches.add(coche);
            }
            br.close();
            return (coches);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return (null);
    }

    @Override
    public Coche recuperarUno(String id) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea = br.readLine();
            br.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return (null);
    }

    @Override
    public Coche añadir(Coche type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'añadir'");
    }

    @Override
    public Coche eliminar(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public Coche modificar(Coche type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

}
