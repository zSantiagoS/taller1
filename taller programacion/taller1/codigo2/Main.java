public class Main {
    public static void main(String[] args) {
        // Creación e inicialización de instancias para realizar pruebas

        // Creación de un estudiante
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456789", 20);
        System.out.println("Estudiante creado: " + estudiante.obtenerInformacion());

        //Inscripción en una materia
        Materia matematicas = new Materia("Matemáticas", "MAT101", 30);
        estudiante.inscribirMateria(matematicas);
        matematicas.agregarEstudiante(estudiante);
        System.out.println("Estudiante inscrito en Matemáticas");

        Materia sexanal = new Materia("Sexanal", "SEX102", 30);
        estudiante.inscribirMateria(sexanal);
        sexanal.agregarEstudiante(estudiante);

        System.out.println("Estudiante inscrito en Sexanal");

        //  Registro de calificaciones
        estudiante.registrarCalificacion(matematicas, 4, 3, 5, 4);
        System.out.println("Calificaciones registradas para Matemáticas"); 

        estudiante.registrarCalificacion(sexanal, 2, 3, 2,1.5 );
        System.out.println("Calificaciones registradas para Sexanal"); 
        
        // Mostrar calificaciones del estudiante
        VistaEstudiante vistaEstudiante = new VistaEstudiante(estudiante);
        vistaEstudiante.mostrarMateriasYCalificaciones();

        // Pruebas adicionales
        System.out.println("\n--- Otras pruebas ---");

        // Creación e inicialización de un panel administrativo
        PanelAdministrativo panelAdministrativo = new PanelAdministrativo();

        // Mostrar si Habilita o no
        panelAdministrativo.registrarNotaHabilitacion(matematicas, estudiante); 

        panelAdministrativo.registrarNotaHabilitacion(sexanal, estudiante); 

        // Asignación de calificación de habilitación
        panelAdministrativo.asignarNotaDeHabilitacion(estudiante, sexanal, 3, 3 , 3 ,3);
        System.out.println("Nota de habilitación asignada");
        
        // Mostrar calificaciones actualizadas del estudiante
        vistaEstudiante.mostrarMateriasYCalificaciones(); 

        // Asignación de docente a una materia
        Docente docente = new Docente("Pedro", "García", "987654321", "Doctorado en Artes Sexuales");
        panelAdministrativo.asignarDocenteAMateria(docente, matematicas);
        System.out.println("Docente asignado a Matemáticas");

        System.out.println("Docente creado: " + docente.obtenerInformacion());


        // Cierre de una materia
        panelAdministrativo.cerrarMateria(matematicas);
        System.out.println("Matemáticas cerrada");

        panelAdministrativo.cerrarMateria(sexanal);
        System.out.println("Sexanal cerrada");

        // Mostrar lista de estudiantes inscritos en una materia cerrada
        panelAdministrativo.mostrarEstudiantesPorMateria(matematicas);
        panelAdministrativo.mostrarEstudiantesPorMateria(sexanal);
    }
}


