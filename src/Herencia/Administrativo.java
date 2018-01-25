package Herencia;

/**
 *
 * @author SLGA
 */
public class Administrativo extends Empleado{
    private String departamento;
    private String telefono;
    
    public Administrativo(){
    }
    public Administrativo(String nombre, String domicilio, int edad, double sueldoBase, String departamento, String telefono) {
        super(nombre, domicilio, edad, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }
   
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append(super.toString());
        cad.append("\n\t\tDepartamento: "+departamento);
        cad.append("\n\t\t    Teléfono: "+telefono);
        return cad.toString();
    }
    
    public static void main(String[] args) {
        Administrativo ad=new Administrativo("Alberto","Calle sin nombre",1943,5000.0,"Finanzas","5530353780");
        
        System.out.println(ad.toString());
    }
}
