public class Socio {
    int socioID;
    String nombre;
    int estatura;
    public int getSocioID() {
        return socioID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    int edad;
    String localidad;

    Socio(int socioID, String nombre, int estatura, int edad, String localidad){
        this.socioID = socioID;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.localidad = localidad;
    }

    public String toString(){
        return String.format("%d,'%s',%d,%d,'%s'", socioID, nombre, estatura, edad, localidad);
    }
}
