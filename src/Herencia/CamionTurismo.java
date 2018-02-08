package Herencia;

/**
 *
 * @author robot
 */
public class CamionTurismo extends CamionPasajeros {
    private boolean asientoCama;
    private boolean serviBar;

    public CamionTurismo() {
    }
    public CamionTurismo(boolean asientoCama, boolean serviBar, int totalPasaj, String marca, String numMotor, String placas, double costo) {
        super(totalPasaj, marca, numMotor, placas, costo);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    public boolean isAsientoCama() {
        return asientoCama;
    }
    public boolean isServiBar() {
        return serviBar;
    }
    
    @Override
    public double calculaCostoServicio(double kms){
        double por100=1;
        
        if(asientoCama)
            por100+=0.05;
        if(serviBar)
            por100+=0.05;
        return super.calculaCostoServicio(kms)*por100;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        if(asientoCama)
            cad.append("\n\tCon asientos cama.");
        if(serviBar)
            cad.append("\n\tCon serviBar.");
        return cad.toString();
    }
}
