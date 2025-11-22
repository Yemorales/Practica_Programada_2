package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class Hito {
    String descripcion;
    Hito siguiente;

    public Hito() {
        this.descripcion = "";
        this.siguiente = null;
    }

    public Hito(String descripcion) {
        this.descripcion = descripcion;
    }   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Hito getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Hito siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
