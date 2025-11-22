
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class PilaHistorial {
    private static class NodoHistorial {
        String cambio;
        NodoHistorial siguiente;
        
        NodoHistorial(String cambio) 
        { 
            this.cambio = cambio; 
        }
    }

    private NodoHistorial tope = null;

    public void push(String cambio) {
        NodoHistorial nuevo = new NodoHistorial(cambio);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public String peek() {
        if (tope != null){
            return tope.cambio;
        } else {
            return null;
        }
    }
    
    public String pop(){
        if (tope == null) {
            return null;
        }
        
        String camb = tope.cambio;
        tope = tope.siguiente;
        
        return camb;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    //public String mostrar() {
    //    if (tope == null) return "No hay cambios.";
    //    StringBuilder sb = new StringBuilder();
    //    NodoHistorial actual = tope;
    //     while (actual != null) {
    //        sb.append("Cambio: ").append(actual.cambio).append("\n");
    //        actual = actual.siguiente;
    //    }
    //    return sb.toString();
    //}
    
}
