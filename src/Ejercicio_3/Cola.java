
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class Cola {
    private static class Nodo {
        String tarea;
        Nodo siguiente;
        Nodo(String tarea) { this.tarea = tarea; }
    }
    
    private Nodo frente, fin;

    public void encolar(String tarea) {
        Nodo nuevo = new Nodo(tarea);
        if (fin != null) {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        if (frente == null) {
            frente = nuevo;
        }
    }
    public String desencolar() {
        if (frente == null) return null;
        String tarea = frente.tarea;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return tarea;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public String mostrar() {
        if (frente == null) return "No hay tareas.";
        StringBuilder sb = new StringBuilder();
        Nodo actual = frente;
        while (actual != null) {
            sb.append("Tarea: ").append(actual.tarea).append("\n");
            actual = actual.siguiente;
        }
        return sb.toString();
    }  
}
