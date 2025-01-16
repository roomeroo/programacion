package ejercicio105;

public class SistemaGestisimal {
    public static void main(String[] args) {
        Producto productos[] = new Producto[100];
        System.out.println("Bienvenido a tu sistema de gestion de confianza.");
        int option = -1;
        productos[0] = new Producto("Gráfica", 18,5, 280, 200);
        productos[1] = new Producto("disco m.2", 3, 5, 50, 20);
        productos[2] = new Producto("teclado", 54, 5, 20, 14);
        do{
        System.out.println("Seleccione que quiere hacer:");
        System.out.println("1. Listar productos.");
        System.out.println("2. Productos de alta.");
        System.out.println("3. Productos de baja.");
        System.out.println("4. Modificar productos.");
        System.out.println("5. Entrada de mercancia.");
        System.out.println("6. Salida de mercancia.");
        System.out.println("7: Salir.");
        option = Integer.parseInt(System.console().readLine());
        switch(option){
            case 1:
                utils.listarProductos(productos);
                break;
            case 2:
                //productos.altaProducto();
                break;
            case 3:
                //productos.bajaProducto();
                break;
            case 4:
                //productos.modificarProducto();
                break;
            case 5:
                utils.comprarProducto(productos);
                break;
            case 6:
               utils.venderProducto(productos);
                break;
            case 7:
                System.out.println("Hasta luego.");
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
        System.out.println("Pulse intro para continuar.");
        System.console().readLine();
        utils.borrarConsola();
        } while(option >0 && option < 7);
    }
}
