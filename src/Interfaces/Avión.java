package Interfaces;

/**
 *
 * @author robot
 */
public class Avión implements ObjVolador{
    private int matricula;
    private static int serie=1250;
    private char tipoCarga;
    private int capacidad;

    public Avión(){
        matricula=serie;
        serie++;
    }
    public Avión(char tipoCarga, int capacidad) {
        this();
        this.tipoCarga = tipoCarga;
        this.capacidad = capacidad;
    }
    
    @Override
    public void despega() {
        System.out.println("El avión enciende sus turbinas, solicita pista y acelera alejándose del suelo.");
    }
    @Override
    public void aterriza() {
        System.out.println("El avión se apoxima a la pista de aterrizaje, solicita autorización a la torre de control y aterriza suavemente.");
    }
    @Override
    public void seDesplaza() {
        System.out.println("El avión avanza hacia su destino a velocidad y altura constantes.");
    }

    @Override
    public String toString() {
        return "Avi\u00f3n{" + "matricula=" + matricula + ", tipoCarga=" + tipoCarga + ", capacidad=" + capacidad + '}';
    }
    
    
}
