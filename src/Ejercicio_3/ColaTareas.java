package Ejercicio_3;

/**
 *
 * 
 * @author yedel
 */
public class ColaTareas {

    private NodoTarea frente = null;
    private NodoTarea fin = null;

    public void encolar(String tarea) {
        NodoTarea nuevo = new NodoTarea();
        nuevo.setTarea(tarea);
        if (fin != null) {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        
        if (frente == null) {
            frente = nuevo;
        }
    }
    public String desencolar() {
        if (frente == null) { 
            return null;
        }
        String tarea = frente.getTarea();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        return tarea;
    }

    public boolean estaVacia() {
        return frente == null;
    }
}
