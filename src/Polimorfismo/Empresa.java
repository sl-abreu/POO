package Polimorfismo;

import Herencia.*;

/**
 *
 * @author robot
 */
public class Empresa {
    private String nombre;
    private Persona dueño;
    private Empleado[] empleados;
    private int numEmps;

    public Empresa() {
        empleados=new Empleado[150];
        numEmps=0;
    }
    public Empresa(String nombre, String nombreDueño, String domicilioDueño, int añoNac) {
        this.dueño=new Persona(nombreDueño, domicilioDueño, añoNac);
        this.nombre = nombre;
        
        empleados=new Empleado[150];
        numEmps=0;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getInfoDueño() {
        return "Dueño:\n"+dueño.toString();
    }
    public String getInfoEmpleado(int clave){
        String res=null;
        int pos=getPosEmpleado(clave);
        
        if(pos>=0)
            res=empleados[pos].toString();
        return res;
    }
    private int getPosEmpleado(int claveEmpleado){
        int res;
        int ini=0,fin=numEmps-1,mitad;
        mitad=(ini+fin)/2;
        
        while(ini<=fin && empleados[mitad].getClaveEmpleado()!=claveEmpleado){
            if(claveEmpleado>empleados[mitad].getClaveEmpleado())
                ini=mitad+1;
            else
                fin=mitad-1;
            mitad=(ini+fin)/2;
        }
        if(ini<=fin)
            res=mitad;
        else
            res=-ini-1;
        return res;
    }
    public boolean altaEmpleado(String nombre, String domicilio, int añoNac, double sueldoBase, String departamento, String telefono){
        boolean res=false;
        
        if(numEmps<empleados.length){
            empleados[numEmps]=new Administrativo(nombre, domicilio, añoNac, sueldoBase, departamento, telefono);
            numEmps++;
            res=true;
        }
        return res;
    }
    public boolean altaEmpleado(String nombre, String domicilio, int añoNac, double sueldoBase, int horasExtra){
        boolean res=false;
        
        if(numEmps<empleados.length){
            empleados[numEmps]=new Operario(nombre, domicilio, añoNac, sueldoBase, horasExtra);
            numEmps++;
            res=true;
        }
        return res;
    }
    public String reporteAdmins(){
        StringBuilder cad=new StringBuilder();
       
        for(int i=0;i<numEmps;i++)
            if(empleados[i] instanceof Administrativo){
                cad.append("\n"+empleados[i].getNombre());
                cad.append("\t$"+empleados[i].getSueldoBase());
            }
        return cad.toString();
    }
    public boolean actualizaSueldoAdmin(int clave,double por100){
        int pos=getPosEmpleado(clave);
        boolean res=false;
        
        if(pos>=0 && empleados[pos].getClass().getSimpleName().equals("Administrativo")){
            double sueldo=empleados[pos].getSueldoBase();
            sueldo*=1+por100;
            empleados[pos].setSueldoBase(sueldo);
            res=true;
        }
        return res;
    }
    public boolean actualizaDepartamentoAdmin(int clave,String departamento){
        int pos=getPosEmpleado(clave);
        boolean res=false;
        
        if(pos>=0){
            try{
                ((Administrativo) empleados[pos]).setDepartamento(departamento);
                res=true;
            }catch(Exception e){
                System.err.println("LA CLAVE NO CORRESPONDE A UN ADMINISTRATIVO");
            }
        }
        return res;
    }
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Empresa: "+nombre);
        cad.append("\n"+getInfoDueño());
        cad.append("\nNúmero de empleados: "+numEmps);
        for(int i=0;i<numEmps;i++)
            cad.append("\n\n"+empleados[i].toString());
        return cad.toString();
    }
    
    public static void main(String[] args) {
        Empresa emp1=new Empresa("El Arroyo","Raúl Rodolfo","Sin calle",1945);
        emp1.altaEmpleado("Juan", "Calle 2 345", 1976, 5740, "Finanzas", "5546382993");
        emp1.altaEmpleado("Alberto", "Calle 3 456", 1984, 3500, 3);
        emp1.altaEmpleado("Sancho", "Calle 8 sin num", 1954, 10890, "Ingeniería", "5534362397");
        emp1.altaEmpleado("Ana", "Calle 15 6", 1987, 13740, "Dirección", "5546382973");
        
        System.out.println(emp1.toString());
        System.out.println(emp1.reporteAdmins());
        System.out.println(emp1.getPosEmpleado(102));
        System.out.println(emp1.actualizaSueldoAdmin(102, 0.2));
        System.out.println(emp1.reporteAdmins());
        System.out.println(emp1.actualizaDepartamentoAdmin(101, "Sistemas"));
        System.out.println(emp1.toString());
    }
}
