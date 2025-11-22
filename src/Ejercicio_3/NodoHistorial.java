package Ejercicio_3;

/**
 *
 * @author melic
 */
public class NodoHistorial {
    private String cambio;
    private NodoHistorial siguiente;

    public NodoHistorial() {
        this.siguiente = null;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public NodoHistorial getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoHistorial siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
