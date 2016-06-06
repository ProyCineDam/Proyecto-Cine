
package gestion;


import java.util.*;

public class Sesion {
    
    String nomSesion;
    Calendar fecha;
    int hora;
    int sala;
    double precio;
    ArrayList<Asiento>asientos;

    public Sesion(String nomSesion, Calendar fecha, int hora, int sala, double precio) {
        this.nomSesion = nomSesion;
        this.fecha = fecha;
        this.hora = hora;
        this.sala = sala;
        this.precio = precio;
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
