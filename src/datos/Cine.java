
package datos;

import gestion.Pelicula;
import gestion.Sala;
import java.util.*;
public class Cine {

   
    
   private String nombre;
   private static ArrayList<Pelicula> peliculas;
   private static ArrayList<Sala>listaSalas;
   public Cine(){
       
   }
    
    public Cine(String nombre){
        this.nombre=nombre;
        this.peliculas=new ArrayList();
    }
    
    public void añadirPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public void añadirSala(Sala sala){
        listaSalas.add(sala);
    }

    public static ArrayList<Sala> getListaSalas() {
        return listaSalas;
    }

    public static void setListaSalas(ArrayList<Sala> listaSalas) {
        Cine.listaSalas = listaSalas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public static Pelicula buscaPelicula(String nom){
        Pelicula peli=null;
        int i=0;
        boolean encontrado=false;
        
        while(i<peliculas.size() && !encontrado){
            if(peliculas.get(i).getNomPeli().equals(nom)){
                peli=peliculas.get(i);
                encontrado=true;
            }
            i++;
        }
        return peli;   
    }
    
    public static void borrarPelicula(Pelicula p){
        peliculas.remove(p);
    }
}
