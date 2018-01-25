package Herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edi
 */
public class Alumno{
    String nombre;
    String curp;
    String fechaNac;
    String nombrePadre;
    String nombreMadre;
    String nombreTutor;
    String grado;

    public Alumno() {
    }
    public Alumno(String nombre, String curp, int mes, int dia, int año, String nombrePadre, String nombreMadre) {
        this.nombre = nombre;
        this.curp = curp;
        this.fechaNac = mes+"/"+dia+"/"+año;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }
     public Alumno(String nombre, String curp, int mes, int dia, int año, String nombreTutor) {
        this.nombre = nombre;
        this.curp = curp;
        this.fechaNac = mes+"/"+dia+"/"+año;
        this.nombreTutor = nombreTutor;
    }
}