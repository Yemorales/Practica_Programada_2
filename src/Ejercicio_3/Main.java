
package Ejercicio_3;
import javax.swing.JOptionPane;

//Practica Programada 2
/**
 *
 * @author yedelyn 
 */
public class Main {

    static ListaCircularDoble integrantes = new ListaCircularDoble();
    static ColaTareas tareas = new ColaTareas();
    static PilaHistorial historial = new PilaHistorial();
    static ListaHitos hitos = new ListaHitos();

    public static void main(String[] args) {
        // chicos, si no les corre este main es porque no lo tienen elegido como 
        // clase principal en el IDE. En la barra de tareas en <default config>
        // se meten y le dan customize, ahí luego escriben en Main class
        // cual main es el que quieren que corra. Saludos, Marlon :)
        menu();
    }

    public static void menu() {

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Proyecto de colaboracion\n"        +
                "=============================\n"     +
                "1. agregar integrante\n"           +
                "2. ver integrantes (hacia delante)\n"   +
                "3. ver integrantes (hacia atras)\n"      +
                "4. agregar tarea\n"                +
                "5. asignar tarea\n"      +
                "6. registrar cambio\n"             +
                "7. ver ultimo cambio\n"            +
                "8. deshacer cambio\n"              +
                "9. agregar hito\n"                 +
                "10. ver hitos\n"                   +
                "11. salir\n"
            );

            if (opcion == null) break;

            switch (opcion) {

                case "1":
                    String nombre = JOptionPane.showInputDialog("nombre del integrante:");
                    if (nombre != null && !nombre.equals("")) {
                        integrantes.agregarIntegrante(nombre);
                    }
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, integrantes.mostrarAdelante());
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, integrantes.mostrarAtras());
                    break;

                case "4":
                    String tarea = JOptionPane.showInputDialog("descripcion de la tarea:");
                    if (tarea != null && !tarea.equals("")) {
                        tareas.encolar(tarea);
                    }
                    break;

                case "5":
                    String asignada = tareas.desencolar();
                    if (asignada == null)
                        JOptionPane.showMessageDialog(null, "no hay tareas por asignar.");
                    else
                        JOptionPane.showMessageDialog(null, "tarea asignada: " + asignada);
                    break;

                case "6":
                    String cambio = JOptionPane.showInputDialog("describe el cambio:");
                    if (cambio != null && !cambio.equals("")) {
                        historial.push(cambio);
                    }
                    break;

                case "7":
                    String ultimo = historial.peek();
                    if (ultimo == null)
                        JOptionPane.showMessageDialog(null, "no hay cambios registrados.");
                    else
                        JOptionPane.showMessageDialog(null, "ultimo cambio: " + ultimo);
                    break;

                case "8":
                    String deshecho = historial.pop();
                    if (deshecho == null)
                        JOptionPane.showMessageDialog(null, "historial vacio.");
                    else
                        JOptionPane.showMessageDialog(null, "cambio deshecho: " + deshecho);
                    break;

                case "9":
                    String hito = JOptionPane.showInputDialog("nigrese hito:");
                    if (hito != null && !hito.equals("")) {
                        hitos.agregarHito(hito);
                    }
                    break;

                case "10":
                    JOptionPane.showMessageDialog(null, hitos.mostrarHitos());
                    break;

                case "11":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "input invalido");
            }
        }
    }
}
    
