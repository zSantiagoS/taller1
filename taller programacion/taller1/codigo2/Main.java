public class Main {
    public static void main(String[] args) {
        // Creación e inicialización de instancias para realizar pruebas

        // Creación de un estudiante
        System.out.println("\n--------------------[ESTUDIANTE]--------------------\n");
        Estudiante estudiante = new Estudiante("Fede", "Rico", "561651651", 69);
        System.out.println("Estudiante creado: " + estudiante.obtenerInformacion() + "\n");

        Estudiante estudiante1 = new Estudiante("Santiago", "Sabogal", "7852222221", 19);
        System.out.println("Estudiante creado: " + estudiante1.obtenerInformacion() + "\n");

        //Inscripción en una materia
        System.out.println("--------------------[AÑADIR MATERIAS]--------------------\n");

        Materia matematicas = new Materia("Matemáticas", "MAT101", 30);
        estudiante.inscribirMateria(matematicas);
        matematicas.agregarEstudiante(estudiante);
        System.out.println("Estudiante inscrito en Matemáticas ");

        Materia fisica = new Materia("Fisica", "FIS102", 30);
        estudiante.inscribirMateria(fisica);
        estudiante1.inscribirMateria(fisica);
        fisica.agregarEstudiante(estudiante);
        fisica.agregarEstudiante(estudiante1);

        System.out.println("\nEstudiante inscrito en Fisica \n");

        //  Registro de calificaciones
        System.out.println("--------------------[REGISTRO DE CALIFICACIONES]--------------------\n");
        estudiante.registrarCalificacion(matematicas, 4, 3, 5, 4);
        System.out.println("Calificaciones registradas para Matemáticas \n"); 

        estudiante.registrarCalificacion(fisica, 2, 3, 2,1.5 );
        System.out.println("Calificaciones registradas para Fisica"); 

        estudiante1.registrarCalificacion(fisica, 4, 5, 4,4 );
        System.out.println("Calificaciones registradas para Fisica"); 
        
        // Mostrar calificaciones del estudiante
        System.out.println("\n--------------------[INFORMACIÓN DEL ESTUDIANTE]--------------------\n");

        VistaEstudiante vistaEstudiante = new VistaEstudiante(estudiante);
        VistaEstudiante vistaEstudiante1 = new VistaEstudiante(estudiante1);
        vistaEstudiante.mostrarMateriasYCalificaciones();
        vistaEstudiante1.mostrarMateriasYCalificaciones();

        // Pruebas adicionales
        System.out.println("\n--------------------[OTRAS PRUEBAS]--------------------\n");


        // Creación e inicialización de un panel administrativo
        PanelAdministrativo panelAdministrativo = new PanelAdministrativo();

        // Cierre de una materia
        System.out.println("--------------------[EJEMPLO CIERRE DE MATERIA]--------------------\n");
        panelAdministrativo.cerrarMateria(matematicas);
        System.out.println("Matemáticas cerrada\n");

        panelAdministrativo.cerrarMateria(fisica);
        System.out.println("Fisica cerrada\n");

        // Mostrar si Habilita o no
        System.out.println("--------------------[HABILITACION]--------------------\n");

        panelAdministrativo.registrarNotaHabilitacion(matematicas, estudiante); 

        panelAdministrativo.registrarNotaHabilitacion(fisica, estudiante); 

        panelAdministrativo.registrarNotaHabilitacion(fisica, estudiante1); 

        // Asignación de calificación de habilitación
        panelAdministrativo.asignarNotaDeHabilitacion(estudiante, fisica, 3, 3 , 3 ,3);
        System.out.println("Nota de habilitación asignada\n");
        
        // Mostrar calificaciones actualizadas del estudiante
        System.out.println("--------------------[CALIFICACIONES ACTUALIZADAS DEL HABILITANTE]--------------------\n");
        vistaEstudiante.mostrarMateriasYCalificaciones(); 


        // Asignación de docente a una materia
        System.out.println("--------------------[DOCENTE]--------------------\n");

        Docente docente = new Docente("Patricio", "Montez", "61651651", "Doctorado en Analisis Numerico");
        panelAdministrativo.asignarDocenteAMateria(docente, matematicas);
        System.out.println("Docente creado: " + docente.obtenerInformacion());
        System.out.println("Docente asignado a Matemáticas \n");


        // Mostrar lista de estudiantes inscritos en una materia cerrada
        System.out.println("\n--------------------[MOSTRAR LISTA DE ESTUDIANTES DE LA MATERIA]--------------------\n");
        panelAdministrativo.mostrarEstudiantesPorMateria(matematicas);
        panelAdministrativo.mostrarEstudiantesPorMateria(fisica);
    }
}
