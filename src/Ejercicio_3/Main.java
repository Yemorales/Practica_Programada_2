
package Ejercicio_3;
import javax.swing.JOptionPane;

//Practica Programada 2
/**
 *
 * @author yedelyn 
 */
public class Main {
    
    private ListaCircularDoble integrantes = new ListaCircularDoble ();
    private Cola tareas = new Cola ();
    private Pila historial = new Pila();
    private ListaSimple hitos = new ListaSimple ();
        
    public void menu (){
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "=== Sistema de Gestión de Proyectos ===\n" +
                "1. Agregar integrante\n" +
                "2. Mostrar integrantes\n" +
                "3. Agregar tarea\n" +
                "4. Asignar tarea\n" +
                "5. Registrar cambio\n" +
                "6. Mostrar último cambio\n" +
                "7. Agregar hito\n" +
                "8. Mostrar hitos\n" +
                "9. Mostrar todo el proyecto\n" +
                "0. Salir" ));
            
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Nombre del integrante:");
                    integrantes.agregarIntegrante(nombre);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, integrantes.mostrarIntegrantes());
                    break;
                case 3:
                    String tarea = JOptionPane.showInputDialog("Descripción de la tarea:");
                    tareas.encolar(tarea);
                    break;
                case 4:
                    String asignada = tareas.desencolar();
                    if (asignada != null)
                        JOptionPane.showMessageDialog(null, "Asignando tarea: " + asignada);
                    else
                        JOptionPane.showMessageDialog(null, "No hay tareas pendientes.");
                    break;
                case 5:
                    String cambio = JOptionPane.showInputDialog("Describe el cambio realizado:");
                    historial.push(cambio);
                    break;
                case 6:
                    String ultimo = historial.peek();
                    JOptionPane.showMessageDialog(null, 
                        (ultimo != null) ? "Último cambio: " + ultimo : "No hay cambios registrados.");
                    break;
                case 7:
                    String hito = JOptionPane.showInputDialog("Descripción del hito:");
                    hitos.agregarHito(hito);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, hitos.mostrarHitos());
                    break;
                case 9:
                    mostrarProyecto();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 0);
    }
        
    public void mostrarProyecto (){
        StringBuilder sb = new StringBuilder();
        sb.append("--- Integrantes ---\n").append(integrantes.mostrarIntegrantes()).append("\n");
        sb.append("--- Tareas pendientes ---\n").append(tareas.mostrar()).append("\n");
        sb.append("--- Historial de cambios ---\n").append(historial.mostrar()).append("\n");
        sb.append("--- Hitos ---\n").append(hitos.mostrarHitos());
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Main proyecto = new Main ();
        proyecto.menu();
    }    
 }
    
