package ejercicio105;

public class Producto {
    private String nombre;
    private int cantidad;
    double precioVenta;
    double precioCompra;

    Producto(String nombre, int cantidad, double precioVenta, double precioCompra){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad){
        this.cantidad += cantidad;
    }

    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }

    public void setPrecioCompra(double precioCompra){
        this.precioCompra = precioCompra;
    }

    public int getCantidad(){
        return (cantidad);
    }

    public double getprevioCompra(){
        return (precioCompra);
    }

    public String getNombre(){
        return (nombre);
    }

    public String toString(){
        return(nombre + ", tenemos " + cantidad + " en stock.");
    }
}
