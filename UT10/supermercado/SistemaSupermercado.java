import java.util.HashMap;
import java.util.ArrayList;

public class SistemaSupermercado{
    public static void main(String args[]){
        String strEntrada = "";
        int intEntrada = 0;
        HashMap<String, Double>lista = new HashMap<>();
        
        ArrayList<lineaPedido>factura = new ArrayList<>();

        Utils.inicializarBD(lista);
        while(!strEntrada.equals("fin")){
            System.out.print("Producto: ");
            strEntrada = System.console().readLine();
            if(lista.containsKey(strEntrada)){
                System.out.print("Cantidad: ");
                intEntrada = Integer.parseInt(System.console().readLine());
                if(Utils.buscarPedido(strEntrada, factura) >= 0){
                    factura.get(Utils.buscarPedido(strEntrada, factura)).setCantidad(intEntrada);
                }else
                    factura.add(new lineaPedido(strEntrada, intEntrada, lista.get(strEntrada)));
            }
        }
        System.out.println("Producto    Precio  Cantidad    Subtotal");
        System.out.println("-----------------------------------------------");
        double total = 0.0;
        for(int i = 0; i < factura.size(); i++){
            System.out.print(factura.get(i).getNombre() + "        " + factura.get(i).getPrecio() + "         " + factura.get(i).getCantidad() + "          " + factura.get(i).getCantidad() * factura.get(i).getPrecio());
            total += factura.get(i).getCantidad() * factura.get(i).getPrecio();
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Total: " + total);
    }
}