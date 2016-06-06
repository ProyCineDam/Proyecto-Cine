
package datos;

import gestion.Pelicula;
import java.util.*;
public class Cine {
    
   private String nombre;
   private ArrayList<Pelicula> peliculas;
   
   public Cine(){
       
   }
    
    public Cine(String nombre){
        this.nombre=nombre;
        this.peliculas=new ArrayList();
    }
    
    public void añadirPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
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
