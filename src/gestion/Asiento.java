
package gestion;

import java.util.*;
public class Asiento {
    
    int numAsiento;
    int filaAsiento;
    
    public Asiento(int filaAsiento, int numAsiento){
        this.numAsiento=numAsiento;
        this.filaAsiento=filaAsiento;
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
