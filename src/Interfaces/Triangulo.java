package Interfaces;

/**
 *
 * @author robot
 */
public class Triangulo implements FigGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado) {
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    }
    public Triangulo(double lado1,double lado2,double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    
    public boolean esEquilatero(){
        return lado1==lado2 && lado2==lado3;
    }
    public boolean esRectangulo(){
        double hipo,cat1,cat2;
        boolean res=false;
        
        if(!esEquilatero()){
            if(lado1>lado2 && lado1>lado3){
            hipo=lado1;
            cat1=lado2;
            cat2=lado3;
            }
            else{
                cat1=lado1;
                if(lado2>lado3){
                    hipo=lado2;
                    cat2=lado3;
                }
                else{
                    hipo=lado3;
                    cat2=lado2;
                }
            }
            res=Math.pow(hipo, 2)==Math.pow(cat1+cat2, 2);
        }
        
        return res;
    }

    @Override
    public double calculaArea() {
        double s=calculaPerim()/2;
        
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    @Override
    public double calculaPerim() {
        double perim;
        
        if(esEquilatero())
            perim=lado1*3;
        else
            perim=lado1+lado2+lado3;
        return perim;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Triangulo other = (Triangulo) obj;
        if (Double.doubleToLongBits(this.lado1) != Double.doubleToLongBits(other.lado1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado2) != Double.doubleToLongBits(other.lado2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado3) != Double.doubleToLongBits(other.lado3)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Triángulo");
        if(esEquilatero()){
            cad.append(" equilátero:\n");
            cad.append("Lado = "+lado1);
        }
        else{
            cad.append(":\nLado 1 = "+lado1);
            cad.append("\nLado 2 = "+lado2);
            cad.append("\nLado 3 = "+lado3);
        }
        return cad.toString();
    }
    
}
