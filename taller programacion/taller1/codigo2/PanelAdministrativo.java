import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PanelAdministrativo {
    private Administrador administrador;
    private Map<Materia, Docente> asignacionesDocentes;

    // Constructor
    public PanelAdministrativo(Administrador administrador) {
        this.administrador = administrador;
        
    }

    // Constructor
    public PanelAdministrativo() {
        this.asignacionesDocentes = new HashMap<>();
    }


    // Método para asignar un docente a una materia
    public void asignarDocenteAMateria(Docente docente, Materia materia) {
        asignacionesDocentes.put(materia, docente);
    }


    // Método para autenticar al administrador
    public boolean autenticar(String nombreUsuario, String contrasena) {
        return administrador.getNombreUsuario().equals(nombreUsuario) && administrador.getContrasena().equals(contrasena);
    }

    // Método para asignar un docente a una materia
    public void asignarDocente(Materia materia, Docente docente) {
        materia.asignarDocente(docente);
    }

    // Método para cerrar una materia
    public void cerrarMateria(Materia materia) {
        if (!materia.isEstadoApertura()) {
            materia.cerrarMateria();
            System.out.println("La materia " + materia.getNombre() + " ha sido cerrada.");
        } else {
            System.out.println("La materia " + materia.getNombre() + " ya está cerrada.");
        }
    }

    // Método para registrar una nota de habilitación para una materia
    public void registrarNotaHabilitacion(Materia materia, Estudiante estudiante) {
        double promedioEstudiante = materia.calcularPromedioEstudiante(estudiante);
        if (promedioEstudiante >= 2.0 && promedioEstudiante < 3.0) {
            materia.setIndicadorHabilitacion(true);
            System.out.println("Se ha registrado una nota de 3.0 para la habilitación del estudiante " + estudiante.getNombre() + " en la materia " + materia.getNombre());
        } else {
            System.out.println("El estudiante " + estudiante.getNombre() + " no cumple con los requisitos para la nota de habilitación en la materia " + materia.getNombre());
        }
    }

    // Método para gestionar la lista de estudiantes inscritos en una materia
    public void gestionarListaEstudiantes(Materia materia, List<Estudiante> estudiantes) {
        if (estudiantes.size() <= materia.getCapacidadMaximaEstudiantes()) {
            materia.setListaEstudiantes(estudiantes);
            System.out.println("La lista de estudiantes ha sido actualizada para la materia " + materia.getNombre());
        } else {
            System.out.println("Error: Se ha excedido la capacidad máxima de estudiantes para la materia " + materia.getNombre());
        }
    }

    // Método para ingresar las calificaciones de un estudiante en una materia
    public void ingresarCalificaciones(Materia materia, Estudiante estudiante, double nota1, double nota2, double nota3, double nota4) {
        if (!materia.isEstadoApertura()) {
            System.out.println("Error: La materia " + materia.getNombre() + " está cerrada. No se pueden ingresar calificaciones.");
            return;
        }
        materia.ingresarCalificaciones(estudiante, nota1, nota2, nota3, nota4);
        System.out.println("Calificaciones ingresadas para el estudiante " + estudiante.getNombre() + " en la materia " + materia.getNombre());  
    }

    public void mostrarEstudiantesPorMateria(Materia materia) {
        List<String> estudiantesEnMateria = new ArrayList<>();
        System.out.println("Estudiantes de la materia: " + materia.getNombre());

        for (Estudiante estudiante : materia.getListaEstudiantes()) {
            if (estudiante.getMateriasInscritas().contains(materia)) {
                estudiantesEnMateria.add(estudiante.getNombre() + " " + estudiante.getApellidos());
                System.out.println("Los estudiantes son :" + estudiantesEnMateria);
            }
        }
    }

    public void asignarNotaDeHabilitacion(Estudiante estudiante, Materia materia, double nota1, double nota2, double nota3, double nota4){
        materia.ingresarCalificaciones(estudiante, nota1, nota2, nota3, nota4);

        
    }
}