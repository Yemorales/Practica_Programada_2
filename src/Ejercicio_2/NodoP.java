package Ejercicio_2;

/**
 *
 * @author melic
 */
public class NodoP {
    private String dato;
    private NodoP sig;

    public NodoP(String d) {
        dato = d;
        }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
    

}
