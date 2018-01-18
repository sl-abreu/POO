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
public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado: " + "lado= " + lado;
    }
    
    public double calculaArea(){
        return lado*lado;
    }
    public double calculaPerim(){
        return 4*lado;
    }
    
}
