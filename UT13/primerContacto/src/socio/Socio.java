package socio;
public class Socio {
    private int socioID;
    private String nombre;
    private int estatura;
    private int edad;
    private String localidad;

    public Socio(Socio socio){
        this.nombre = socio.getNombre();
        this.estatura = socio.getEstatura();
        this.edad = socio.getEdad();
        this.localidad = socio.getLocalidad();
    }

    public Socio(String nombre, int estatura, int edad, String localidad){
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
        this.localidad = localidad;   
    }

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

    public void setSocioID(int socioID) {
        this.socioID = socioID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return ("Socio [socioID=" + socioID + ", nombre=" + nombre + ", estatura=" + estatura + ", edad=" + edad+ ", localidad=" + localidad + "]");
    }

    
}
