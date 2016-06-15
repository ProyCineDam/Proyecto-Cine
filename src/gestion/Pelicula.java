package gestion;

import java.util.*;

public class Pelicula {

    String nomPeli;
    String nacionalidad;
    double duracion;
    String director;
    String interpretes;
    String argumento;
    String genero;
    private static ArrayList<Sesion> sesionesPeli;

    public Pelicula() {
    }

    public Pelicula(String nomPeli, String nacionalidad, double duracion, String director, String interpretes, String argumento, String genero) {
        this.nomPeli = nomPeli;
        this.nacionalidad = nacionalidad;
        this.duracion = duracion;
        this.director = director;
        this.interpretes = interpretes;
        this.argumento = argumento;
        this.genero = genero;
        this.sesionesPeli = new ArrayList();
    }

    public void añadirSesion(Sesion sesion) {
        sesionesPeli.add(sesion);
    }

    public static ArrayList<Sesion> listarSesiones(Pelicula peli) {
        ArrayList<Sesion> auxi = new ArrayList();

        for (int i = 0; i < sesionesPeli.size(); i++) {
            if (sesionesPeli.get(i).getPelis() == peli) {
                auxi.add(sesionesPeli.get(i));
            }
        }

        return auxi;
    }

    public static Sesion buscaSesion(String nom) {
        Sesion sesion = null;
        int i = 0;
        boolean encontrado = false;

        while (i < sesionesPeli.size() && !encontrado) {
            if (sesionesPeli.get(i).getNomSesion().equals(nom)) {
                sesion = sesionesPeli.get(i);
                encontrado = true;
            }
            i++;
        }
        return sesion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nomPeli=" + nomPeli + ", nacionalidad=" + nacionalidad + ", duracion=" + duracion + ", director=" + director + ", interpretes=" + interpretes + ", argumento=" + argumento + ", genero=" + genero + '}';
    }

    public ArrayList<Sesion> cogerSesionesPeli() {
        ArrayList listaSesiones = new ArrayList();
        for (Sesion sp : sesionesPeli) {
            if (sp.pelis.getNomPeli().equals(this.getNomPeli())) {
                listaSesiones.add(sp);
            }
        }

        return listaSesiones;
    }

    public static ArrayList<Sesion> getSesionesPeli() {
        return sesionesPeli;
    }

    public static void setSesionesPeli(ArrayList<Sesion> sesionesPeli) {
        Pelicula.sesionesPeli = sesionesPeli;
    }

    public String getNomPeli() {
        return nomPeli;
    }

    public void setNomPeli(String nomPeli) {
        this.nomPeli = nomPeli;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
