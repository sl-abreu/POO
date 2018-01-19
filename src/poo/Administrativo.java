package poo;

/**
 *
 * @author SLGA
 */
public class Administrativo {
    private String departamento;
    private String telefono;
    
    public Administrativo(){
    }
    public Administrativo(String departamento,String telefono){
        this.departamento=departamento;
        this.telefono=telefono;
    }
    
    @Override
    public String toString(){
        StringBuilder cad=new StringBuilder();
        
        cad.append("Administrativo: ");
        cad.append("\n\tDepartamento: "+departamento);
        cad.append("\n\t    Teléfono: "+telefono);
        return cad.toString();
    }
    
    public static void main(String[] args) {
        Administrativo ad=new Administrativo("Finanzas","5530353780");
        
        System.out.println(ad.toString());
    }
}
