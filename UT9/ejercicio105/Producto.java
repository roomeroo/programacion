package ejercicio105;

public class Producto {
    private String nombre;
    private int cantidad;
    private int stock;
    private double precioVenta;
    private double precioCompra;

    Producto(String nombre, int stock, int cantidad, double precioVenta, double precioCompra){
        this.nombre = nombre;
        this.stock = stock;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setStock(int stock){
        this.stock += stock;
    }

    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }

    public void setPrecioCompra(double precioCompra){
        this.precioCompra = precioCompra;
    }

    public int getStock(){
        return (stock);
    }

    public double getprecioCompra(){
        return (precioCompra);
    }

    public double getprecioVenta(){
        return (precioVenta);
    }

    public String getNombre(){
        return (nombre);
    }

    public String toString(){
        return(nombre + ", tenemos " + stock + " en stock, y " +  (cantidad) + " en almacen.");
    }
}
