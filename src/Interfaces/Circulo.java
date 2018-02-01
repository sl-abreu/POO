package Interfaces;

/**
 *
 * @author robot
 */
public class Circulo implements FigGeometrica{
    private double radio;

    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calculaArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    @Override
    public double calculaPerim(){
        return Math.PI*radio*2;
    }

    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Cículo:\n");
        cad.append("Radio = "+radio);
        return cad.toString();
    }
    @Override
    public int hashCode() {
        int hash = 3;
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
        final Circulo other = (Circulo) obj;
        if (Double.doubleToLongBits(this.radio) != Double.doubleToLongBits(other.radio)) {
            return false;
        }
        return true;
    }
    
}
