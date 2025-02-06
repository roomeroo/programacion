public class Coche implements Serializable<Coche>{
    private String matricula;
    private String marca;
    private int anioCompra;

    Coche(String matricula, String marca, int anioCompra){
        this.matricula = matricula;
        this.marca = marca;
        this.anioCompra = anioCompra;
    }

    Coche(String str){
        this.deserializar(str);
    }

    public String getMatricula(){
        return(matricula);
    }

    public String getMarca(){
        return(marca);
    }

    public int getAnioCompra(){
        return(anioCompra);
    }

    public String serializar(){
        return String.format("%s;%s;%d", matricula, marca, anioCompra);
    }

    public void deserializar(String str){
        String[] datos = str.split(";");
        this.matricula = datos[0];
        this.marca = datos[1];
        this.anioCompra = Integer.parseInt(datos[2]);
    }
}
