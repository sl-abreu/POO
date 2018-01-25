package Herencia;

/**
 *
 * @author robot
 */
public class AlumnoSuperior extends Alumno{
    private String escuelaAnterior;
    private double promAnterior;
    private double[] califs;

    public AlumnoSuperior() {
        califs=new double[5];
    }
    public AlumnoSuperior(String escuelaAnterior, double promAnterior, String nombre, String curp, int mes, int dia, int año, String nombrePadre, String nombreMadre) {
        super(nombre, curp, mes, dia, año, nombrePadre, nombreMadre);
        this.escuelaAnterior = escuelaAnterior;
        this.promAnterior = promAnterior;
        califs=new double[5];
    }
    public AlumnoSuperior(String escuelaAnterior, double promAnterior, String nombre, String curp, int mes, int dia, int año, String nombreTutor) {
        super(nombre, curp, mes, dia, año, nombreTutor);
        this.escuelaAnterior = escuelaAnterior;
        this.promAnterior = promAnterior;
        califs=new double[5];
    }
    
}
