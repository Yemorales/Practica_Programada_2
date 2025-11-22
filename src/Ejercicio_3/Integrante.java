
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class Integrante {
    private String nombre;
    private Integrante siguiente;
    private Integrante anterior;

    public Integrante() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integrante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Integrante siguiente) {
        this.siguiente = siguiente;
    }

    public Integrante getAnterior() {
        return anterior;
    }

    public void setAnterior(Integrante anterior) {
        this.anterior = anterior;
    }

    
    
}
