package UT9.ejercicio14;

public class Ficha {
    private int delante = 0;
    private int detras = 0;
    
    public Ficha(int delante, int detras){
        this.delante = delante;
        this.detras = detras;
    }

    public String voltea(){
        return ("[" + print(detras) + "|"+ print(delante) + "]");
    }

    public Boolean encaja(Ficha f){
        if(detras == f.getDelante() || detras == f.getDetras()){
            return(true);
        }else if(delante == f.getDelante() || delante == getDetras())
            return (true);
        return (false);
    }

    public String print(int x){
        if(x == 0)
            return (" ");
        return (""+x);
    }

    public int getDelante(){
        return (delante);
    }

    public int getDetras(){
        return (detras);
    }

    public String toString(){
        return ("[" + print(delante) + "|"+ print(detras) + "]");
    }
}
