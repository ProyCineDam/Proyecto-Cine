/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author crist
 */
public class Sala {
    int numSala;
    int filas;
    int columnas;
    boolean tresD;

    public Sala(int numSala, int filas, int columnas) {
        this.numSala = numSala;
        this.filas = filas;
        this.columnas = columnas;
        tresD=false;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    
}
