package gestion;

import java.util.*;

public class Asiento {

    int numAsiento;
    int filaAsiento;
    Disponibilidad dispo;

    public Asiento(int fila, int num, Disponibilidad dispo) {
    
        this.filaAsiento = fila;
        this.numAsiento = num;
        this.dispo = dispo;
    }
@Override
    public String toString() {
        String cadena = "";
        cadena += "NºFila: " + this.filaAsiento + "\nNºAsiento: " + this.numAsiento + "\nDisponibilidad: " + this.dispo;
        return cadena;
    }
    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public int getFilaAsiento() {
        return filaAsiento;
    }

    public void setFilaAsiento(int filaAsiento) {
        this.filaAsiento = filaAsiento;
    }
     public Disponibilidad getDispo() {
        return dispo;
    }

    public void setDispo(Disponibilidad dispo) {
        this.dispo = dispo;
    }
}
