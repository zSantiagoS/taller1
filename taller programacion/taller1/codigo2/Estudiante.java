import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private int edad;
    private List<Materia> materiasInscritas; 

    // Constructor
    public Estudiante(String nombre, String apellidos, String identificacion, int edad) {
        super(nombre, apellidos, identificacion);
        this.edad = edad;
        this.materiasInscritas = new ArrayList(); 

    }

    // Getter y Setter para la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para obtener información del estudiante
    @Override
    public String obtenerInformacion() {
        return "Información del Estudiante = " + "Nombre: " + getNombre() + " " + getApellidos() + ", Identificación: " + getIdentificacion() + ", Edad: " + edad;
    }

    // Método para obtener el estudiante
    public Estudiante getEstudiante() {
        return this;
    }

    // Método para obtener las materias inscritas del estudiante
    public List<Materia> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void inscribirMateria(Materia materia) {
        if (!materiasInscritas.contains(materia)) {
            materiasInscritas.add(materia);
            System.out.println("Materia " + materia.getNombre() + " inscrita exitosamente para el estudiante " + this.getNombre());
        } else {
            System.out.println("El estudiante " + this.getNombre() + " ya está inscrito en la materia " + materia.getNombre());
        }
    }

    public void registrarCalificacion(Materia materia, double nota1, double nota2, double nota3, double nota4) {
        // Verificar si el estudiante está inscrito en la materia
        if (materiasInscritas.contains(materia)) {
            // Crear una nueva calificación con las notas proporcionadas
            Calificacion calificacion = new Calificacion(this, materia, nota1, nota2, nota3, nota4);
            // Asignar la calificación a la materia
            materia.agregarCalificacion(calificacion);
            System.out.println("Calificación registrada para el estudiante " + this.getNombre() + " en la materia " + materia.getNombre());
        } else {
            System.out.println("El estudiante " + this.getNombre() + " no está inscrito en la materia " + materia.getNombre() + ". No se pudo registrar la calificación.");
        }
    }
}
