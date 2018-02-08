package Herencia;

/**
 *
 * @author robot
 */
public class CamionEscolar extends CamionPasajeros{
    private boolean lugarProyecto;

    public CamionEscolar() {
    }
    public CamionEscolar(boolean lugarProyecto, int totalPasaj, String marca, String numMotor, String placas, double costo) {
        super(totalPasaj, marca, numMotor, placas, costo);
        this.lugarProyecto = lugarProyecto;
    }

    public boolean isLugarProyecto() {
        return lugarProyecto;
    }
    
    public double calculaCostoServicio(){
        return calculaCostoServicio(250);
    }
}
