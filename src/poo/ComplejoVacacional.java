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
public class ComplejoVacacional {
    private String nom;
    private int numAlb;
    private Rectangulo[] albs;

    //constructores
    
    public ComplejoVacacional() {
        this.numAlb=0;
        this.albs= new Rectangulo[10];
    }
    public ComplejoVacacional(String nom) {
        this();
        this.nom = nom;
    }

    //getters y setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNumALb() {
        return numAlb;
    }
  
    //funcionalidad de la clase
    public boolean newAlb(double largo,double ancho) {
        boolean res=false;
        
        if (numAlb<10){
            albs[this.numAlb]=new Rectangulo(largo,ancho);
            this.numAlb++;
            res=true;
        }
        return res;
    }
    public double calculaAreaLonas(){
        double ars=0;
        
        for(int i=0;i<numAlb;i++)
            ars+=albs[i].calculaArea();
        return ars;
    }
    public double calculaCercas() {
        double perims=0;
        
        for(int i=0;i<numAlb;i++)
            perims+=albs[i].calculaPerimetro();
        return perims;
    }
    
    //funcionalidad mínima

    @Override
    public String toString() {
        return "ComplejoVacacional{" + "nom=" + nom + ", numAlb=" + numAlb + ", albs=" + albs + '}';
    }
    
}
