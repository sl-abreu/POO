package Herencia;

/**
 *
 * @author SLGA
 */
public abstract class Empleado extends Persona implements Comparable{
    private int claveEmpleado;
    protected double sueldoBase;
    private static int serie=100;
    
    protected Empleado(){
        claveEmpleado=serie;
        serie++;
    }
    protected Empleado(String nombre,String domicilio,int añoNacimiento,double sueldoBase){
        super(nombre,domicilio,añoNacimiento);
        
        this.sueldoBase=sueldoBase;
        claveEmpleado=serie;
        serie++;
    }

    public int getClaveEmpleado() {
        return claveEmpleado;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
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
   
    
    public abstract double calculaSalario(double prestac,double deduc);
    
}
