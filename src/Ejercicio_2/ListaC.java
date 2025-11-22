package Ejercicio_2;

/**
 *
 * @author melic
 */
public class ListaC {
    
    private NodoC cabeza;

    public void agregar(String d) {
        
        NodoC nuevo = new NodoC(d);

        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.setSig(nuevo);
            return;
        }

        NodoC e = cabeza;

        while (e.getSig() != cabeza) {
            e = e.getSig();
        }

        e.setSig(nuevo);
        nuevo.setSig(cabeza);
    }

    public String mostrar() {
        if (cabeza == null) return "Lista circular vacía";

        String r = "";
        NodoC e = cabeza;

        do {
            r += e.getDato() + " | ";
            e = e.getSig();
        } while (e != cabeza);

        return r + "";
    }
    
}
