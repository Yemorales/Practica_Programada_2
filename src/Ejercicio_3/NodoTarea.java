package Ejercicio_3;

/**
 *
 * @author melic
 */
public class NodoTarea {
    
    private String tarea;
    private NodoTarea siguiente;
    
    NodoTarea() { 
        this.siguiente=null; 
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public NodoTarea getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTarea siguiente) {
        this.siguiente = siguiente;
    }
    
}
