package gestion;

import java.util.*;

public class Asiento {

    int numAsiento;
    int filaAsiento;

    public Asiento(int fila, int num) {
        this.numAsiento = num;
        this.filaAsiento = fila;
        
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
}
