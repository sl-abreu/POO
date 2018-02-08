package Herencia;

/**
 *
 * @author robot
 */
public class CamionPasajeros extends Camion {
    private int totalPasaj;

    public CamionPasajeros() {
    }
    public CamionPasajeros(int totalPasaj, String marca, String numMotor, String placas, double costo) {
        super(marca, numMotor, placas, costo);
        this.totalPasaj = totalPasaj;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }
    
    public double calculaCostoServicio(double kms){
        return 0.01*this.getCosto()*kms/totalPasaj;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n\tNúmero de pasajeros: "+totalPasaj);
        return cad.toString();
    }
}
