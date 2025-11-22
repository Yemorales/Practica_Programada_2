package Ejercicio_2;

/**
 *
 * @author melic
 */
public class Cola {
    private NodoC inicio;
    private NodoC fin;

    public void elemento(String d) {
        NodoC nuevo = new NodoC(d);

        if (inicio == null) {
            inicio = fin = nuevo;
            return;
        }

        fin.setSig(nuevo);
        fin = nuevo;
    }

    public String elemento() {
        if (inicio == null){
            return "Sin registro";
        }

        String d = inicio.getDato();
        inicio = inicio.getSig();

        if (inicio == null){
            fin = null;
        }

        return d;
    }

    public String mostrar() {
        if (inicio == null) return "Sin registro";

        String r = "";
        NodoC e = inicio;

        while (e != null) {
            r += e.getDato() + "\n";
            e = e.getSig();
        }

        return r;
    }
}
