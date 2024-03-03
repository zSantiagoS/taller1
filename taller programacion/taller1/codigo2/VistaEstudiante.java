public class VistaEstudiante {
    private Estudiante estudiante;

    // Constructor
    public VistaEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    // Método para mostrar las materias y calificaciones del estudiante
    public void mostrarMateriasYCalificaciones() {
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Materias inscritas:");
        for (Materia materia : estudiante.getMateriasInscritas()) {
            System.out.println("- " + materia.getNombre());
            System.out.println("  Calificaciones:");
            for (Calificacion calificacion : materia.getCalificaciones()) {
                if (calificacion.getEstudiante().equals(estudiante)) {
                    System.out.println("  - Nota 1: " + calificacion.getNota1());
                    System.out.println("  - Nota 2: " + calificacion.getNota2());
                    System.out.println("  - Nota 3: " + calificacion.getNota3());
                    System.out.println("  - Nota 4: " + calificacion.getNota4());
                    System.out.println("  - Promedio: " + calificacion.calcularPromedio());
                }
            }
        }
    }
}




