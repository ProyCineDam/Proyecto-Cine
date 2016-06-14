
package gestion;

import java.util.ArrayList;


public class Sala {
    int numSala;
    static int filas;
    static int columnas;
    String tresD;
    ArrayList<Asiento>asientos;

    public Sala(int numSala, int filas, int columnas, String tresD) {
        this.numSala = numSala;
        this.filas = filas;
        this.columnas = columnas;
        this.tresD= tresD;
    }

    @Override
    public String toString() {
        return "Sala{" + "numSala=" + numSala + ", filas=" + filas + ", columnas=" + columnas + ", tresD=" + tresD + '}';
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public static int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public static int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String getTresD() {
        return tresD;
    }

    public void setTresD(String tresD) {
        this.tresD = tresD;
    }

    
    
}
