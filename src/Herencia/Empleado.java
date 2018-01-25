package Herencia;

/**
 *
 * @author SLGA
 */
public class Empleado extends Persona implements Comparable{
    private int claveEmpleado;
    private double sueldoBase;
    private static int serie=100;
    
    public Empleado(){
        claveEmpleado=serie;
        serie++;
    }
    public Empleado(String nombre,String domicilio,int añoNacimiento,double sueldoBase){
        super(nombre,domicilio,añoNacimiento);
        
        this.sueldoBase=sueldoBase;
        claveEmpleado=serie;
        serie++;
    }
    public Empleado(int claveEmpleado){
        this.claveEmpleado=claveEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Clave de empleado: "+claveEmpleado);
        cad.append("\n"+super.toString());
        cad.append("\n\t      Sueldo base: "+sueldoBase);
        return cad.toString();
    }
    public int compareTo(Object otro){
        Empleado em=(Empleado)otro;
        return this.claveEmpleado-em.claveEmpleado;
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
        Empleado em=new Empleado("Martino Aparicio","El olvido",1939,5000.0);
        Empleado em2=new Empleado("Juan Sancho de la Mancha","Satélite",1956,7500.0);
        
        System.out.println(em.toString());
        System.out.println("\n"+em2.toString());
        
        System.out.println(em.calculaSalario(0.5, 0.2));
        System.out.println(em2.calculaSalario(0.5, 0.2));
    }
}
