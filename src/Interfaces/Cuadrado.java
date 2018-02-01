package Interfaces;

/**
 *
 * @author robot
 */
public class Cuadrado extends Cuadrilatero{

    public Cuadrado() {
    }
    public Cuadrado(double lado) {
        super(lado,lado,lado,lado);
    }

    public double getLado() {
        return getLado1();
    }
    public void setLado(double lado1) {
        setLado1(lado1);
        setLado2(lado1);
        setLado3(lado1);
        setLado4(lado1);
    }
    
    @Override
    public double calculaArea(){
        return getLado1()*getLado1();
    }
    
    @Override
    public String toString(){
        return "Cuadrado:\n"+"Lado = "+getLado1();
    }
    
}
