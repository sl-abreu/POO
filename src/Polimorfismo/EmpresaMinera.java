package Polimorfismo;

import Herencia.*;

/**
 *
 * @author robot
 */
public class EmpresaMinera {
    private String nomEmpresa;
    private Camion[] cams;
    private int totCams;

    public EmpresaMinera() {
        cams=new Camion[150];
        totCams=0;
    }
    
    public boolean altaCamion(int totalPasaj, String marca, String numMotor, String placas, double costo){
        boolean res=false;
        
        if(totCams<cams.length){
            cams[totCams]=new CamionPasajeros(totalPasaj,marca,numMotor,placas,costo);
            totCams++;
            res=true;
        }
        return res;
    }
    public boolean altaCamion(double capacidadTon, String marca, String numMotor, String placas, double costo){
        boolean res=false;
        
        if(totCams<cams.length){
            cams[totCams]=new CamionVolteo(capacidadTon,marca,numMotor,placas,costo);
            totCams++;
            res=true;
        }
        return res;
    }
    public boolean actualizaCarga(String placa, double cap){
        boolean res=false;
        int i=0;
        
        while(i<totCams && !cams[i].getPlacas().equals(placa))
            i++;
        if(i!=totCams && cams[i] instanceof CamionVolteo){
            ((CamionVolteo)cams[i]).setCapacidadTon(cap);
            res=true;
        }
        return res;
    }
    public int camsPasajerosPorMarca(String marca){
        int coins=0;
        
        for(int i=0;i<totCams;i++)
            if(cams[i] instanceof CamionPasajeros && cams[i].getMarca().equals(marca))
                coins++;
        return coins;
    }
    public double totalCarga(){
        double sum=0;
        
        for(int i=0;i<totCams;i++)
            if(cams[i] instanceof CamionVolteo)
                sum+=((CamionVolteo)cams[i]).getCapacidadTon();
        return sum;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(nomEmpresa+"\n");
        cad.append(totCams+"camiones:");
        for(int i=0;i<totCams;i++)
            cad.append("\n"+cams[i].toString());
        return cad.toString();
    }
}
