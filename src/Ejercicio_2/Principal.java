package Ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author yedelyn
 */
public class Principal {

    static ListaC cursos = new ListaC();
    static Lista modulos = new Lista();
    static Pila pilaAntoine = new Pila();
    static Pila pilaMelissa = new Pila();
    static Pila pilaMarlon = new Pila();
    static Cola cola = new Cola();
    
    public static void main(String[] args) {
        // TODO code application logic here
        cursos.agregar("Matematicas");
        cursos.agregar("Calculo");
        cursos.agregar("Estructura de Datos");

        modulos.agregar("Diagramas de Venn");
        modulos.agregar("Limites");
        modulos.agregar("Programacion competitiva");

        pilaAntoine.push("Diagramas de flujo");
        pilaMelissa.push("Trigonometria");
        pilaMarlon.push("Listas enlazadas simples");

        cola.elemento("Antoine");
        cola.elemento("Melissa");
        cola.elemento("Marlon");

        while (true) {
            String menu = JOptionPane.showInputDialog(null,
                    "Seleccione una opción:\n"
                    + "1. Mostrar cursos\n"
                    + "2. Mostrar modulos\n"
                    + "3. Actividades del estudiante\n"
                    + "4. Leer reportes de soporte\n"
                    + "5. Nuevo curso\n"
                    + "6. Nuevo modulo\n"
                    + "7. Actividades pendientes\n"
                    + "8. Solicitud de soporte\n"
                    + "9. Salir");

            if (menu == null || menu.equals("9")) {
                break;
            }

            switch (menu) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Cursos:\n" + cursos.mostrar());
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Módulos:\n" + modulos.mostrar());
                    break;
                case "3":
                    mostrarActEst();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Solicitudes soporte:\n" + cola.mostrar());
                    break;
                case "5":
                    String nuevoCurso = JOptionPane.showInputDialog("Indica el nombre del curso:");
                    if (nuevoCurso != null && !nuevoCurso.trim().isEmpty()) {
                        cursos.agregar(nuevoCurso.trim());
                        JOptionPane.showMessageDialog(null, "Curso agregado correctamente.");
                    }
                    break;
                case "6":
                    String nuevoModulo = JOptionPane.showInputDialog("Indica el nombre del modulo:");
                    if (nuevoModulo != null && !nuevoModulo.trim().isEmpty()) {
                        modulos.agregar(nuevoModulo.trim());
                        JOptionPane.showMessageDialog(null, "Modulo agregado");
                    }
                    break;
                case "7":
                    agregarActEst();
                    break;
                case "8":
                    String solicitud = JOptionPane.showInputDialog("Ingrese la solicitud de soporte:");
                    if (solicitud != null && !solicitud.trim().isEmpty()) {
                        cola.elemento(solicitud.trim());
                        JOptionPane.showMessageDialog(null, "Reporte recibido.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }

    private static void mostrarActEst() {
        String alumno = JOptionPane.showInputDialog(null,
                "Seleccione el estudiante:\n"
                + "1. Antoine\n"
                + "2. Melissa\n"
                + "3. Marlon");

        if (alumno == null) return;

        switch (alumno) {
            case "1":
                JOptionPane.showMessageDialog(null, "Actividades de Antoine:\n" + pilaAntoine.mostrar());
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Actividades de Melissa:\n" + pilaMelissa.mostrar());
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Actividades de Marlon:\n" + pilaMarlon.mostrar());
                break;
        }
    }

    private static void agregarActEst() {
        String alumno = JOptionPane.showInputDialog(null,
                "Elige el estudiante:\n"
                + "1. Antoine\n"
                + "2. Melissa\n"
                + "3. Marlon");

        if (alumno == null) return;

        String actividad = JOptionPane.showInputDialog("Ingrese la actividad:");

        if (actividad == null || actividad.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registra segun caracteres");
            return;
        }

        switch (alumno) {
            case "1":
                pilaAntoine.push(actividad.trim());
                JOptionPane.showMessageDialog(null, "Pendiente añadida: Antoine.");
                break;
            case "2":
                pilaMelissa.push(actividad.trim());
                JOptionPane.showMessageDialog(null, "Pendiente añadida: Melissa.");
                break;
            case "3":
                pilaMarlon.push(actividad.trim());
                JOptionPane.showMessageDialog(null, "Pendiente añadida: Marlon.");
                break;
        }
    
    }
    
}
