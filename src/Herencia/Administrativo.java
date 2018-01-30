package Herencia;

/**
 *
 * @author SLGA
 */
public class Administrativo extends Empleado{
    private String departamento;
    private String telefono;
    
    public Administrativo(){
    }
    public Administrativo(String nombre, String domicilio, int edad, double sueldoBase, String departamento, String telefono) {
        super(nombre, domicilio, edad, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n\t\tDepartamento: "+departamento);
        cad.append("\n\t\t    Teléfono: "+telefono);
        return cad.toString();
    }
    
    @Override
    public double calculaSalario(double prestac, double deduc) {
        return sueldoBase*(1+prestac-deduc);
    }
}
