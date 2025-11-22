
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class ColaTareas {
    private static class NodoTareas {
        String tarea;
        NodoTareas siguiente;
        NodoTareas(String tarea) 
        { 
            this.tarea = tarea; 
        }
    }
    
    private NodoTareas frente = null;
    private NodoTareas fin = null;

    public void encolar(String tarea) {
        NodoTareas nuevo = new NodoTareas(tarea);
        
        if (fin != null) {
            fin.siguiente = nuevo;
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
        
        String tarea = frente.tarea;
        frente = frente.siguiente;
        
        if (frente == null) {
            fin = null;
        }
        return tarea;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    //public String mostrar() {
    //    if (frente == null) return "No hay tareas.";
    //    StringBuilder sb = new StringBuilder();
    //    NodoTareas actual = frente;
    //    while (actual != null) {
    //        sb.append("Tarea: ").append(actual.tarea).append("\n");
    //        actual = actual.siguiente;
    //    }
    //    return sb.toString();
    //}  
}
