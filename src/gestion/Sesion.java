package gestion;

import java.util.*;

public class Sesion {

    String nomSesion;
    String fecha;
    String hora;
    Sala sala;
    double precio;
    Pelicula pelis;
    public ArrayList<Asiento> asientos;

    public Sesion(String nomSesion, String fecha, String hora, Sala sala, double precio, Pelicula pelis) {
        this.nomSesion = nomSesion;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
        this.precio = precio;
        this.pelis = pelis;
        asientos = new ArrayList();
        cargarAsientos();
    }

    public void cargarAsientos() {
        for (int i = 0; i < this.sala.getFilas(); i++) {
            for (int j = 0; j < this.sala.getColumnas(); j++) {
                this.asientos.add(new Asiento(i, j, Disponibilidad.LIBRE));
            }
        }
    }

    @Override
    public String toString() {
          String cadena="";
       cadena+= "Sesion{" + "nomSesion=" + nomSesion + ", fecha=" + fecha + ", hora=" + hora + ", sala=" + sala + ", precio=" + precio + ", pelis=" + pelis + '-';
        for (Asiento a : this.asientos) {
            if (a.getDispo().equals(Disponibilidad.LIBRE)) {
                cadena += "l";
            } else {
                cadena += "o";
            }
        }
        return cadena;

    }

    public Sesion(String palabra, String palabra0, double parseDouble) {
        
    }

    public void añadirAsiento(Asiento asiento) {
        asientos.add(asiento);
    }

    public String getNomSesion() {
        return nomSesion;
    }

    public void setNomSesion(String nomSesion) {
        this.nomSesion = nomSesion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelis() {
        return pelis;
    }

    public void setPelis(Pelicula pelis) {
        this.pelis = pelis;
    }

}
