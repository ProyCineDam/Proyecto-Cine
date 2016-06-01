
package gestion;

import java.util.*;
public class Cine {
    
    String nombre;
    ArrayList<Pelicula> peliculas;
    
    Cine(String nombre){
        this.nombre=nombre;
        this.peliculas=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
