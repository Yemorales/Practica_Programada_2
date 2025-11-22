package Ejercicio_2;

/**
 *
 * @author melic
 */
public class Pila {
    private NodoP cima;

    public void push(String d) {
        NodoP n = new NodoP(d);
        n.setSig(cima);
        cima = n;
    }

    public String pop() {
        if (cima == null) return "Sin registro";

        String dato = cima.getDato();
        cima = cima.getSig();
        return dato;
    }

    public String mostrar() {
        if (cima == null) return "Sin registro";

        String r = "";
        NodoP e = cima;

        while (e != null) {
            r += e.getDato() + "\n";
            e = e.getSig();
        }

        return r;
    }
}
