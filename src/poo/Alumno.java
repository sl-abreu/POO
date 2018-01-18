package poo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edi
 */
public class Alumno {
    private int clavUn;
    private String nombre;
    private double[] califs;
    private int totalCalifs;
    private static int serie=100;

    public Alumno() {
        this.clavUn=serie;
        serie++;
        this.totalCalifs=0;
        this.califs=new double[50];
    }
    public Alumno(String nombre) {
        this();
        this.nombre = nombre;
    }

    public int getClavUn() {
        return clavUn;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTotalCalifs() {
        return totalCalifs;
    }

    
    
    @Override
    public String toString() {
        return "Alumno{" + "clavUn=" + clavUn + ", nombre=" + nombre + ", califs=" + califs + ", totalCalifs=" + totalCalifs + '}';
    }
}
