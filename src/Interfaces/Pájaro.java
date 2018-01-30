package Interfaces;

/**
 *
 * @author robot
 */
public class Pájaro implements ObjVolador {

    private int clave;
    private static int serie=50;
    private String habitat;
    
    public Pájaro(){
        clave=serie;
        serie++;
    }
    public Pájaro(String habitat){
        this();
        this.habitat=habitat;
    }
    
    @Override
    public void despega() {
        System.out.println("El pájaro extiende sus alas y emprende el vuelo.");
    }
    @Override
    public void aterriza() {
        System.out.println("El pájaro se aproxima al suelo y aterriza cuidadosamente.");
    }
    @Override
    public void seDesplaza() {
        System.out.println("El pájaro se desplaza al árbol contiguo.");
    }

    @Override
    public String toString() {
        return "P\u00e1jaro{" + "clave=" + clave + ", habitat=" + habitat + '}';
    }
    
    
}
