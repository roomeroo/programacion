package ejercicio100;

public class Gato {
    String nombre = "";
    int edad = 0;
    String raza = "";

    Gato(String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre(){
        return (this.nombre);
    }

    public int getEdad(){
        return (this.edad);
    }

    public String getRaza(){
        return (this.raza);
    }

    public void setEdad(int edad){
        this.edad = edad;  
    }

    public String toString(){
        return("Nombre: "+ nombre + "\nEdad: " + edad + "\nRaza: " + raza);
    }
}
