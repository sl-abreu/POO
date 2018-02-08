package Polimorfismo;

import Interfaces.*;
/**
 *
 * @author robot
 */
public class EjecutaFiguras {
    private FigGeometrica[] figs;
    private int total;
    
    public EjecutaFiguras(){
        figs=new FigGeometrica[100];
        total=0;
    }
    public boolean altaFig(double lado1,double lado2,double lado3){
        boolean res=false;
        
        if(total<figs.length){
            figs[total]=new Triangulo(lado1,lado2,lado3);
            total++;
            res=true;
        }
        return res;
    }
    public boolean altaFig(double ancho,double largo){
        boolean res=false;
        
        if(total<figs.length){
            if(ancho==largo)
                figs[total]=new Cuadrado(ancho);
            else
                figs[total]=new Rectangulo(ancho,largo);
            total++;
            res=true;
        }
        return res;
    }
    public boolean altaFig(double radio){
        boolean res=false;
        
        if(total<figs.length){
            figs[total]=new Circulo(radio);
            total++;
            res=true;
        }
        return res;
    }
    public double calculaAreaTotal(){
        double sum=0;
        
        for(int i=0;i<total;i++)
            sum+=figs[i].calculaArea();
        return sum;
    }
    public String infoCirculoMasGrande(){
        int pos=-1;
        double radMax=0;
        String res="No hay circulos.";
        
        for(int i=0;i<total;i++){
            if(figs[i] instanceof Circulo && ((Circulo)figs[i]).getRadio()>radMax){
                radMax=((Circulo)figs[i]).getRadio();
                pos=i;
            }
        }
        if(pos>=0)
            res=figs[pos].toString();
        return res;
    }
    public int eliminaEquilateros(){
        int i=0,num=0;
        
        while(i<total){
            if(figs[i] instanceof Triangulo && ((Triangulo)figs[i]).esEquilatero()){
                total--;
                figs[i]=figs[total];
                figs[total]=null;
                num++;
            }
            else
                i++;
        }
        return num;
    }
    public static void main(String[] args) {
        EjecutaFiguras ej=new EjecutaFiguras();
        ej.altaFig(7);
        ej.altaFig(3);
        ej.altaFig(4.2, 7.3);
        ej.altaFig(3, 3);
        ej.altaFig(4.2);
        ej.altaFig(3, 3, 3);
        ej.altaFig(3, 4, 5);
        ej.altaFig(4, 4, 4);
        ej.altaFig(6, 3);
        ej.altaFig(5, 5, 5);
        System.out.println(ej.infoCirculoMasGrande());
        System.out.println(ej.eliminaEquilateros());
    }
}
