
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class ListaCircularDoble {
    private Integrante cabeza = null;

    public void agregarIntegrante(String nombre) {
        Integrante nuevo = new Integrante(nombre);
        
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {            
            Integrante ultimo = cabeza.anterior;
            
            nuevo.siguiente = cabeza;
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
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
    
    public String mostrarAdelante() {
        if (cabeza == null) return "No hay integrantes.\n";

        String texto = "";
        Integrante temp = cabeza;

        do {
            texto = texto + temp.nombre + "\n";
            temp = temp.siguiente;
        } while (temp != cabeza);

        return texto;
    }
    
        public String mostrarAtras() {
        if (cabeza == null) return "No hay integrantes.\n";

        String texto = "";
        Integrante temp = cabeza.anterior;

        do {
            texto = texto + temp.nombre + "\n";
            temp = temp.anterior;
        } while (temp != cabeza.anterior);

        return texto;
    }
}
