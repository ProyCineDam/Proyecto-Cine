package datos;

public class CineExceptionAsientos extends Exception {

    String m;

    public CineExceptionAsientos(String mensaje) {
        this.m = mensaje;
    }

    @Override
    public String toString() {
        return m;
    }
}
