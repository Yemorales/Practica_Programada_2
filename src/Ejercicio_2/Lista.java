package Ejercicio_2;

/**
 *
 * @author melic
 */
public class Lista {
     private NodoP cabeza;

    public void agregar(String d) {
        NodoP nuevo = new NodoP(d);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        NodoP e = cabeza;

        while (e.getSig() != null) {
            e = e.getSig();
        }
        e.setSig(nuevo);
    }

    public String mostrar() {
        if (cabeza == null) return "Lista vacía";

        String r = "";
        NodoP e = cabeza;

        while (e != null) {
            r += e.getDato() + " | ";
            e = e.getSig();
        }

        return r + "";
    }
}
