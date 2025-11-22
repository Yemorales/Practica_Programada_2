package Ejercicio_2;

/**
 *
 * @author melic
 */
public class NodoC {
    
    private String dato;
    private NodoC sig;

    public NodoC(String d) {
        dato = d;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
    
}
