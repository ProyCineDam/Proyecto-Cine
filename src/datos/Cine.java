package datos;

import gestion.Pelicula;
import gestion.Sala;
import java.util.*;

public class Cine {

    private String nombre;
    private static ArrayList<Pelicula> peliculas;
    private static ArrayList<Sala> listaSalas;

    public Cine() {

    }

    public Cine(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList();
        this.listaSalas = new ArrayList();
    }

    public void añadirPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void añadirSala(Sala sala) {
        listaSalas.add(sala);
    }

    public static  ArrayList<Sala> getListaSalas() {
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

    public static void setPeliculas(ArrayList<Pelicula> pl) {
        peliculas = pl;
    }

    public static Pelicula buscaPelicula(String nom) {
        Pelicula peli = null;
        int i = 0;
        boolean encontrado = false;

        while (i < peliculas.size() && !encontrado) {
            if (peliculas.get(i).getNomPeli().equals(nom)) {
                peli = peliculas.get(i);
                encontrado = true;
            }
            i++;
        }
        return peli;
    }

    public static Sala buscaSala(int nom) {
        Sala sala = null;
        int i = 0;
        boolean encontrado = false;

        while (i < listaSalas.size() && !encontrado) {
            if (listaSalas.get(i).getNumSala() == nom) {
                sala = listaSalas.get(i);
                encontrado = true;
            }
            i++;
        }
        return sala;
    }

    public static void borrarPelicula(Pelicula p) {
        peliculas.remove(p);
    }

    public static void borrarSala(Sala s) {
        listaSalas.remove(s);
    }
}
