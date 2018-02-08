package Herencia;

/**
 *
 * @author robot
 */
public class CamionVolteo extends Camion {
    private double capacidadTon;

    public CamionVolteo() {
    }
    public CamionVolteo(double capacidadTon, String marca, String numMotor, String placas, double costo) {
        super(marca, numMotor, placas, costo);
        this.capacidadTon = capacidadTon;
    }

    public double getCapacidadTon() {
        return capacidadTon;
    }
    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }
    
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n\t Capacidad de carga: "+capacidadTon);
        return cad.toString();
    }
}
