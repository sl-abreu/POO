package Herencia;

import ClasesUtiles.ManejadorArreglosGenerico;

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
    public String getUnEmpleado(int claveEmpleado){
        Empleado em=new Empleado(claveEmpleado);
        String res=null;
        int ini=0,fin=numEmps-1,mitad;
        mitad=(ini+fin)/2;
        
        while(ini<=fin && !empleados[mitad].equals(em)){
            if(em.compareTo(empleados[mitad])>0)
                ini=mitad+1;
            else
                fin=mitad-1;
            mitad=(ini+fin)/2;
        }
        if(ini<=fin)
            res=empleados[mitad].toString();
        return res;
    }
    public boolean altaAdministrativo(String nombre, String domicilio, int añoNac, double sueldoBase, String departamento, String telefono){
        boolean res=false;
        
        if(numEmps<empleados.length){
            empleados[numEmps]=new Administrativo(nombre, domicilio, añoNac, sueldoBase, departamento, telefono);
            numEmps++;
            res=true;
        }
        return res;
    }
    public boolean altaOperario(String nombre, String domicilio, int añoNac, double sueldoBase, int horasExtra){
        boolean res=false;
        
        if(numEmps<empleados.length){
            empleados[numEmps]=new Operario(nombre, domicilio, añoNac, sueldoBase, horasExtra);
            numEmps++;
            res=true;
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
        emp1.altaAdministrativo("Juan", "Calle 2 345", 1976, 5740, "Finanzas", "55463829");
        emp1.altaOperario("Alberto", "Calle 3 456", 1984, 3500, 3);
        
        System.out.println(emp1.toString());
    }
}
