package Herencia;

/**
 *
 * @author SLGA
 */
public class Empleado extends Persona{
    private int claveEmpleado;
    private double sueldoBase;
    private static int serie=100;
    
    public Empleado(){
        claveEmpleado=serie;
        serie++;
    }
    public Empleado(String nombre,String domicilio,int edad,double sueldoBase){
        super(nombre,domicilio,edad);
        
        this.sueldoBase=sueldoBase;
        claveEmpleado=serie;
        serie++;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n\tSueldo base: "+sueldoBase);
        return cad.toString();
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.claveEmpleado;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.claveEmpleado != other.claveEmpleado) {
            return false;
        }
        return true;
    }
    
    public double calculaSalario(double prestac,double deduc){
        return sueldoBase*(1+prestac-deduc);
    }
    
    public static void main(String[] args) {
        Empleado em=new Empleado("Martino Aparicio","El olvido",39,5000.0);
        Empleado em2=new Empleado("Juan Sancho de la Mancha","Satélite",56,7500.0);
        
        System.out.println(em.toString());
        System.out.println(em2.toString());
        
        System.out.println(em.calculaSalario(0.5, 0.2));
        System.out.println(em2.calculaSalario(0.5, 0.2));
    }
}
