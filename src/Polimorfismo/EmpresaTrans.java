package Polimorfismo;

import Herencia.*;

/**
 *
 * @author robot
 */
public class EmpresaTrans {
    private String nom;
    private CamionPasajeros[] cams;
    private int totCams;

    public EmpresaTrans() {
        cams=new CamionPasajeros[100];
        totCams=0;
    }
    public EmpresaTrans(String nom) {
        this();
        this.nom = nom;
    }
    
    public String consultaTurismo(int nP,double kms){
        StringBuilder cad=new StringBuilder();
        
        for(int i=0;i<totCams;i++)
            if(cams[i] instanceof CamionTurismo && cams[i].getTotalPasaj()>=nP){
                cad.append(cams[i].toString());
                cad.append("\nCosto del servicio: "+cams[i].calculaCostoServicio(kms));
                cad.append("\n\n");
            }
        return cad.toString();
    }
    private int buscaCamion(String placa){
        int i=0;
        
        while(i<totCams && !cams[i].getPlacas().equalsIgnoreCase(placa))
            i++;
        if(i==totCams)
            i=-1;
        return i;
    }
    public String tipoUnidad(String placa){
        int i=buscaCamion(placa);
        String res="No disponible.";
        
        if(i>=0)
            res=cams[i].getClass().getSimpleName();
        return res;
    }
    public boolean satisfaceDemanda(int nP,int nC){
        int cont=0;
        
        for(int i=0;i<totCams;i++)
            if(cams[i] instanceof CamionEscolar && cams[i].getTotalPasaj()>=nP)
                cont++;
        return cont>=nC;
    }
}
