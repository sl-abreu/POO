package Interfaces;

/**
 *
 * @author robot
 */
public abstract class Cuadrilatero implements FigGeometrica{
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    
    protected Cuadrilatero(){
    }
    protected Cuadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    @Override
    public double calculaPerim(){
        return lado1+lado2+lado3+lado4;
    }
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Cuadrilatero other = (Cuadrilatero) obj;
        if (Double.doubleToLongBits(this.lado1) != Double.doubleToLongBits(other.lado1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado2) != Double.doubleToLongBits(other.lado2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado3) != Double.doubleToLongBits(other.lado3)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lado4) != Double.doubleToLongBits(other.lado4)) {
            return false;
        }
        return true;
    }
    
}
