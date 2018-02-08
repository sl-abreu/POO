package Herencia;

/**
 *
 * @author robot
 */
public abstract class Camion {
    private String marca;
    private String numMotor;
    private String placas;
    private double costo;

    public Camion() {
    }
    public Camion(String marca, String numMotor, String placas, double costo) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }
    public String getNumMotor() {
        return numMotor;
    }
    public String getPlacas() {
        return placas;
    }
    public double getCosto() {
        return costo;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Camión:");
        cad.append("\n\t              Marca: "+marca);
        cad.append("\n\t    Número de motor: "+numMotor);
        cad.append("\n\t             Placas: "+placas);
        cad.append("\n\t              Costo: $"+costo);
        return cad.toString();
    }
    @Override
    public boolean equals(Object obj){
        boolean res=false;
        
        if(obj!=null && obj instanceof Camion)
            res=((Camion)obj).getNumMotor().equals(this.numMotor);
        return res;
    }
}
