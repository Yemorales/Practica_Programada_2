
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class ListaCircularDoble {
    private Integrante cabeza;

    public void agregarIntegrante(String nombre) {
        Integrante nuevo = new Integrante(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Integrante ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }
    
    public String mostrarIntegrantes() {
        if (cabeza == null) return "No hay integrantes.";
        StringBuilder sb = new StringBuilder();
        Integrante actual = cabeza;
        do {
            sb.append("Integrante: ").append(actual.nombre).append("\n");
            actual = actual.siguiente;
        } while (actual != cabeza);
        return sb.toString();
    }
}
