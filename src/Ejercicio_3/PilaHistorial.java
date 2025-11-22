
package Ejercicio_3;

/**
 *
 * @author yedel
 */
public class PilaHistorial {

    private NodoHistorial tope;

    public PilaHistorial() {
        this.tope = null;
    }
    
    public void push(String cambio) {
        NodoHistorial nuevo = new NodoHistorial();
        nuevo.setCambio(cambio);
        nuevo.setSiguiente(tope);
        tope = nuevo;
    }

    public String peek() {
        if (tope != null){
            return tope.getCambio();
        } else {
            return null;
        }
    }
    
    public String pop(){
        if (tope == null) {
            return null;
        }
        
        String camb = tope.getCambio();
        tope.setSiguiente(tope);
        
        return camb;
    }

    public boolean estaVacia() {
        return tope == null;
    }
    
}
