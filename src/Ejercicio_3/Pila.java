
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class Pila {
    private static class Nodo {
        String cambio;
        Nodo siguiente;
        Nodo(String cambio) { this.cambio = cambio; }
    }

    private Nodo tope;

    public void push(String cambio) {
        Nodo nuevo = new Nodo(cambio);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public String peek() {
        return (tope != null) ? tope.cambio : null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public String mostrar() {
        if (tope == null) return "No hay cambios.";
        StringBuilder sb = new StringBuilder();
        Nodo actual = tope;
        while (actual != null) {
            sb.append("Cambio: ").append(actual.cambio).append("\n");
            actual = actual.siguiente;
        }
        return sb.toString();
    }
    
}
