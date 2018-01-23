package poo;

/**
 *
 * @author SLGA
 */
public class Administrativo extends Empleado{
    private String departamento;
    private String telefono;
    
    public Administrativo(){
    }
    public Administrativo(String nombreEmpleado,double sueldoBase,String departamento,String telefono){
        super(nombreEmpleado,sueldoBase);
        this.departamento=departamento;
        this.telefono=telefono;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\nAdministrativo: ");
        cad.append("\n\tDepartamento: "+departamento);
        cad.append("\n\t    Teléfono: "+telefono);
        return cad.toString();
    }
    
    public static void main(String[] args) {
        Administrativo ad=new Administrativo("Alberto",5000.0,"Finanzas","5530353780");
        
        System.out.println(ad.toString());
    }
}
