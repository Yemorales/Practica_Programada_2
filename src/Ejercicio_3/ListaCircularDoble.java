
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class ListaCircularDoble {
    private Integrante cabeza;

    public void agregarIntegrante(String nombre) {
        Integrante nuevo = new Integrante();
        nuevo.setNombre(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
            cabeza.setAnterior(cabeza);
        } else {            
            Integrante ultimo = cabeza.getAnterior();
            nuevo.setSiguiente(cabeza);
            nuevo.setAnterior(ultimo);
            ultimo.setSiguiente(nuevo);
            cabeza.setAnterior(nuevo);
        }
    }
    
    public String mostrarIntegrantes() {
        if (cabeza == null) return "No hay integrantes.";
        String resultado = "";
        Integrante actual = cabeza;
        do {
            resultado = resultado + "Integrante: " + actual.getNombre() + "\n";
            actual = actual.getSiguiente();
        } while (actual != cabeza);
        return resultado;
    }
    
    public String mostrarAdelante() {
        if (cabeza == null) return "No hay integrantes.\n";
        String texto = "";
        Integrante temp = cabeza;
        do {
            texto = texto + temp.getNombre() + "\n";
            temp = temp.getSiguiente();
        } while (temp != cabeza);
        return texto;
    }
    
        public String mostrarAtras() {
        if (cabeza == null) return "No hay integrantes.\n";
        String texto = "";
        Integrante temp = cabeza.getAnterior();
        do {
            texto = texto + temp.getNombre() + "\n";
            temp = temp.getAnterior();
        } while (temp != cabeza.getAnterior());
        return texto;
    }
}
