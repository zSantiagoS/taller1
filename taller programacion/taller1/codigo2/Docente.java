public class Docente extends Persona {
    private String titulo;

    // Constructor
    public Docente(String nombre, String apellidos, String identificacion, String titulo) {
        super(nombre, apellidos, identificacion);
        this.titulo = titulo;
    }

    // Getter y Setter para el título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para obtener información del docente
    @Override
    public String obtenerInformacion() {
        return "Información del Docente = " + "Nombre: " + getNombre() + " " + getApellidos() + ", Identificación: " + getIdentificacion() + ", Título: " + titulo;
    }
}
