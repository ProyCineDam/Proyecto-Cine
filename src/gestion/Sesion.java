
package gestion;


import java.util.*;

public class Sesion {
    
    String nomSesion;
    String fecha;
    String hora;
    Sala sala;
    double precio;
    Pelicula pelis;
    ArrayList<Asiento>asientos;

    public Sesion(String nomSesion, String fecha, String hora, Sala sala, double precio, Pelicula pelis) {
        this.nomSesion = nomSesion;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
        this.precio = precio;
        this.pelis = pelis;
        asientos=new ArrayList<Asiento>();
    }
    
    public void añadirAsiento(Asiento asiento){
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

    public Pelicula getPelis() {
        return pelis;
    }

    public void setPelis(Pelicula pelis) {
        this.pelis = pelis;
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
    
}
