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
public class Escuela {
    private String nombre;
    private String direccion;
    private Alumno[] alums;
    private int numAlums;

    public Escuela() {
        alums=new Alumno[50];
        numAlums=0;
    }
    public Escuela(String nombre, String direccion) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String consultaMasAprob(){
        String res=null;
        
        if(numAlums>0){
            int pos=0;
            
            for(int i=1;i<numAlums;i++)
                if(alums[i].getTotalCalifs()>alums[pos].getTotalCalifs())
                    pos=i;
            res=alums[pos].getNombre();
        }
        return res;
    }
    
}
