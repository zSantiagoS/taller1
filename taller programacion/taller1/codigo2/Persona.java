public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String identificacion;

    // Constructor
    public Persona(String nombre, String apellidos, String identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    // Método abstract para obtener la Información del Estudiante / Docente
    public abstract String obtenerInformacion();
}
