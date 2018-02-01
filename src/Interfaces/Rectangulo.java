package Interfaces;

/**
 *
 * @author robot
 */
public class Rectangulo extends Cuadrilatero{

    public Rectangulo() {
    }
    public Rectangulo(double ancho,double largo){
        super(ancho,largo,ancho,largo);
    }

    public double getAncho() {
        return getLado1();
    }
    public void setAncho(double ancho) {
        setLado1(ancho);
        setLado3(ancho);
    }
    public double getLargo() {
        return getLado2();
    }
    public void setLargo(double largo) {
        setLado2(largo);
        setLado4(largo);
    }
    
    @Override
    public double calculaArea(){
        return getLado1()*getLado2();
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Rectángulo:");
        cad.append("\nAncho = "+getLado1());
        cad.append("\nLargo = "+getLado2());
        return cad.toString();
    }
}
