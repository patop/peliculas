package mx.com.gm.peliculas.domain;

public class Peliculas {
    private String nombre;
    
    public Peliculas(){

    }

    public Peliculas(String nombre){

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
