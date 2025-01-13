package ejercicio105;

public class utils {
    public static Producto buscarObjeto(Producto str[], String nombreProducto){
        nombreProducto = minusculas(nombreProducto);
        for(int i = 0; i < str.length && str[i] != null; i++){
            if(nombreProducto.equals((str[i].getNombre()).toLowerCase())){
                return (str[i]);
            }
        }
        return(null);
    }

    public static String minusculas(String str){
        return (str.toLowerCase());
    }

    public static void listarProductos(Producto str[]){
        System.out.println("");
        for(int i = 0; i < str.length && str[i] != null; i++){
            System.out.println((i + 1) + ". " + str[i]);
        }
    }

    public static void comprarProducto(Producto str[]){
        System.out.print("Dime que producto deseas comprar: ");
        String nombre = System.console().readLine();
        int cantidad = -1;
        if(buscarObjeto(str, nombre) != null){
            System.out.println("Este producto consta de " + buscarObjeto(str, nombre).getCantidad());  
            System.out.print("Cuanto quieres comprar: ");
            cantidad = Integer.parseInt(System.console().readLine());
            buscarObjeto(str, nombre).setCantidad(cantidad);         //AÑADE LA CANTIDAD 
        }else{
            System.out.println("Ese producto no existe o ha sido mal escrito.");
            System.out.println("¿Desea crear uno?");
            String respuesta = System.console().readLine();
            if((respuesta.toLowerCase()).equals("si")){
                System.out.print("Cuanto quieres comprar: ");
                cantidad = Integer.parseInt(System.console().readLine());
                System.out.println("Cuanto cuesta el producto");
                double precioCompra = Integer.parseInt(System.console().readLine());
                System.out.println("¿Cual es el precio de venta?");
                int precioVenta = Integer.parseInt(System.console().readLine());
                int pos = buscarUltima(str);
                System.out.println(pos);
                str[pos] = new Producto(nombre, cantidad, precioCompra, precioVenta);
            }


        }
    }

    public static int buscarUltima(Producto str[]){
        int i = 0;
        while(i < str.length && str[i] != null)
            i++;
        return (i);
    }

    public static void venderProducto(Producto str[]){
        System.out.print("Dime que producto se desea vender: ");
        String nombre = System.console().readLine();
        int cantidad = -1;
        if(buscarObjeto(str, nombre) != null){
            System.out.println("Este producto consta de " + buscarObjeto(str, nombre).getCantidad());  
            System.out.print("Cuanto quieres vender: ");
            cantidad = Integer.parseInt(System.console().readLine());
            if(cantidad <= buscarObjeto(str, nombre).getCantidad()){
                buscarObjeto(str, nombre).setCantidad(cantidad * (- 1));          //AÑADE LA CANTIDAD 
            }System.out.println("Lo sentimos, no tenemos stock suficiente.");
        }else{
            System.out.println("Ese producto no existe o ha sido mal escrito.");
        }
    }

}