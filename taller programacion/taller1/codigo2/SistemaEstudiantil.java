import java.util.HashMap;
import java.util.Map;

public class SistemaEstudiantil {
    private Map<String, Estudiante> estudiantesRegistrados;

    // Constructor
    public SistemaEstudiantil() {
        this.estudiantesRegistrados = new HashMap<>();
    }

    // Método para registrar un estudiante en el sistema
    public void registrarEstudiante(Estudiante estudiante) {
        estudiantesRegistrados.put(estudiante.getIdentificacion(), estudiante);
    }

    // Método para autenticar a un estudiante
    public boolean autenticarEstudiante(String identificacion) {
        return estudiantesRegistrados.containsKey(identificacion);
    }

    // Método para obtener la vista del estudiante
    public VistaEstudiante obtenerVistaEstudiante(String identificacion) {
        Estudiante estudiante = estudiantesRegistrados.get(identificacion);
        if (estudiante != null) {
            return new VistaEstudiante(estudiante);
        }
        return null;
    }
}
