public class VistaAdministrador {
    private PanelAdministrativo panelAdministrativo;

    // Constructor
    public VistaAdministrador(PanelAdministrativo panelAdministrativo) {
        this.panelAdministrativo = panelAdministrativo;
    }

    // Método para asignar un docente a una materia
    public void asignarDocenteAMateria(Docente docente, Materia materia) {
        panelAdministrativo.asignarDocenteAMateria(docente, materia);
    }

    // Método para cerrar una materia
    public void cerrarMateria(Materia materia) {
        panelAdministrativo.cerrarMateria(materia);
    }

    // Método para ingresar calificaciones de estudiantes
    public void ingresarCalificaciones(Materia materia, Estudiante estudiante, double nota1, double nota2, double nota3, double nota4) {
        panelAdministrativo.ingresarCalificaciones(materia, estudiante, nota1, nota2, nota3, nota4);
    }

}
