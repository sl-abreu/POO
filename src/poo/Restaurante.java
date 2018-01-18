/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author edi
 */
public class Restaurante {
    private String nom;
    private int numMesas;
    private Cuadrado[] mesas;

    public Restaurante() {
        numMesas=0;
        mesas=new Cuadrado[25];
    }
    public Restaurante(String nom) {
        this();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public int getNumMesas() {
        return numMesas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "nom=" + nom + ", numMesas=" + numMesas + ", mesas=" + mesas + '}';
    }
    
    public boolean newMesa(double lado){
        boolean res=false;
        
        if (numMesas<25){
            mesas[this.numMesas]=new Cuadrado(lado);
            this.numMesas++;
            res=true;
        }
        return res;
    }
    public double calculaAreaManteles(){
        double ars=0;
        
        for(int i=0;i<numMesas;i++)
            ars+=mesas[i].calculaArea();
        return ars;
    }
    public double calculaBordes() {
        double perims=0;
        
        for(int i=0;i<numMesas;i++)
            perims+=mesas[i].calculaPerim();
        return perims;
    }
    
    
}
