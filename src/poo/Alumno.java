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
public class Alumno extends Persona{
    private int clavUn;
    private String carrera;
    private double[] califs;
    private int totalCalifs;
    private static int serie=100;

    public Alumno() {
        super();
        this.clavUn=serie;
        serie++;
        this.totalCalifs=0;
        this.califs=new double[50];
    }

    public Alumno(String carrera, String nombre, String domicilio, int edad) {
        super(nombre, domicilio, edad);
        this.carrera = carrera;
        
        this.clavUn=serie;
        serie++;
        this.totalCalifs=0;
        this.califs=new double[50];
    }

    public int getClavUn() {
        return clavUn;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getTotalCalifs() {
        return totalCalifs;
    }
    
    public String toString(){
        StringBuilder cad=new StringBuilder();
        cad.append(super.toString());
        cad.append("\nCarrera: "+carrera);
        return cad.toString();
    }
    
    public boolean equals(Object otro){
        Alumno al=(Alumno) otro;
        return this.getNombre().equalsIgnoreCase(al.getNombre()) && this.getCarrera().equalsIgnoreCase(al.getCarrera());
    }
}
