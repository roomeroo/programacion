public class lineaPedido {
    String nombre = "";
    int cantidad = 0;
    double precio = 0.0;

    lineaPedido(String nombre, int cantidad, double precio){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    String getNombre(){
        return (nombre);
    }

    int getCantidad(){
        return (cantidad);
    }

    Double getPrecio(){
        return(precio);
    }

    void setCantidad(int cantidad){
        this.cantidad += cantidad;
    }

}
