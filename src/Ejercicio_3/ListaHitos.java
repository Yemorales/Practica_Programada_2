package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class ListaHitos {
    private Hito cabeza;

    public void agregarHito(String descripcion) {
        Hito nuevo = new Hito(descripcion);
        
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Hito actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    
    public String mostrarHitos() {
        if (cabeza == null) {
            return "No hay hitos.";
        }
        String texto = "";
        Hito temporal = cabeza;
        
        while (temporal != null){
            texto = texto + temporal.descripcion + "\n";
            temporal = temporal.siguiente;
        }
        
        return texto;
    }


    
}
