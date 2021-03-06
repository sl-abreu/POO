package Herencia;

/**
 *
 * @author robot
 */
public class Operario extends Empleado {
    private int horasExtra;

    public Operario() {
    }

    public Operario(String nombre, String domicilio, int edad, double sueldoBase, int horasExtra) {
        super(nombre, domicilio, edad, sueldoBase);
        this.horasExtra = horasExtra;
    }
    
    public int getHorasExtra() {
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double calculaSalario(double prestac,double deduc,double precioHE){
        return calculaSalario(prestac,deduc)+horasExtra*precioHE;
    }
    @Override
    public double calculaSalario(double prestac, double deduc) {
        return sueldoBase*(1+prestac-deduc);
    }
    
    @Override
    public String toString() {
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n\t\tHoras extras: "+horasExtra);
        return cad.toString();
    }
    
    
}
