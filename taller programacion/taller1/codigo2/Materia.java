import java.util.List;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private String codigo;
    private int capacidadMaximaEstudiantes;
    private boolean estadoApertura;
    private boolean indicadorHabilitacion;
    private Docente docenteAsignado;
    private List<Estudiante> listaEstudiantes;
    private List<Calificacion> calificaciones;

    // Constructor
    public Materia(String nombre, String codigo, int capacidadMaximaEstudiantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidadMaximaEstudiantes = capacidadMaximaEstudiantes;
        this.estadoApertura = false;
        this.indicadorHabilitacion = false;
        this.listaEstudiantes = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMaximaEstudiantes() {
        return capacidadMaximaEstudiantes;
    }

    public void setCapacidadMaximaEstudiantes(int capacidadMaximaEstudiantes) {
        this.capacidadMaximaEstudiantes = capacidadMaximaEstudiantes;
    }

    public boolean isEstadoApertura() {
        return estadoApertura;
    }

    public void setEstadoApertura(boolean estadoApertura) {
        this.estadoApertura = estadoApertura;
    }

    public boolean isIndicadorHabilitacion() {
        return indicadorHabilitacion;
    }

    public void setIndicadorHabilitacion(boolean indicadorHabilitacion) {
        this.indicadorHabilitacion = indicadorHabilitacion;
    }

    public Docente getDocenteAsignado() {
        return docenteAsignado;
    }

    public void setDocenteAsignado(Docente docenteAsignado) {
        this.docenteAsignado = docenteAsignado;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    // Método para asignar un docente a la materia
    public void asignarDocente(Docente docente) {
        this.docenteAsignado = docente;
    }

    // Método para agregar un estudiante a la lista de estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    // Método para cerrar la materia y calcular las calificaciones
    public void cerrarMateria() {
        this.estadoApertura = true;
        // Calcular promedio de calificaciones
        double sum = 0;
        for (Calificacion calificacion : calificaciones) {
            sum += calificacion.calcularPromedio();
        }
        double promedio = sum / calificaciones.size();
        // Lógica para indicador de habilitación
        if (promedio >= 2.0 && promedio < 3.0) {
            this.indicadorHabilitacion = true;
        }
    }

    // Método para ingresar las calificaciones de un estudiante
    public void ingresarCalificaciones(Estudiante estudiante, double nota1, double nota2, double nota3, double nota4) {
        Calificacion calificacion = new Calificacion(estudiante, this, nota1, nota2, nota3, nota4);
        calificaciones.add(calificacion);
    }

    // Método para calcular el promedio de notas de un estudiante en esta materia
    public double calcularPromedioEstudiante(Estudiante estudiante) {
        double sum = 0;
        int contador = 0;
        for (Calificacion calificacion : calificaciones) {
            if (calificacion.getEstudiante().equals(estudiante)) {
                sum += calificacion.calcularPromedio();
                contador++;
            }
        }
        return sum / contador;
    }

    // Método para calcular el promedio de notas de todos los estudiantes en esta materia
    public double calcularPromedioMateria() {
        double sum = 0;
        for (Calificacion calificacion : calificaciones) {
            sum += calificacion.calcularPromedio();
        }
        return sum / calificaciones.size();
    }

    // Método para agregar una calificación a la materia
    public void agregarCalificacion(Calificacion calificacion) {
        calificaciones.add(calificacion);
    }
}


