package paquete02;

public class Institucion {
    
    private String nombre;
    private String tipo;
    private int nroAlumnos;
    private int nroDocentes;
    private int nroSedes;
    private double gastoEstudiante;
    private double presupuesto;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public int obtenerNroAlumnos() {
        return nroAlumnos;
    }

    public void establecerNroAlumnos(int n) {
        nroAlumnos = n;
    }

    public int obtenerNroDocentes() {
        return nroDocentes;
    }

    public void establecerNroDocentes(int n) {
        nroDocentes = n;
    }

    public int obtenerNroSedes() {
        return nroSedes;
    }

    public void establecerNroSedes(int n) {
        nroSedes = n;
    }

    public double obtenerGastoEstudiante() {
        return gastoEstudiante;
    }

    public void establecerGastoEstudiante(double n) {
        gastoEstudiante = n;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public void establecerPresupuesto() {
        presupuesto = gastoEstudiante * nroAlumnos;
    }
    
    
    
}
