package Herencia;

/**
 *
 * @author robot
 */
public class Empresa {
    private String nombre;
    private Persona dueño;
    private Administrativo[] admins;
    private Operario[] opers;

    public Empresa() {
        admins=new Administrativo[50];
        opers=new Operario[100];
    }
    public Empresa(String nombre, String nombreDueño, String domicilioDueño, int edadDueño) {
        this.dueño=new Persona(nombreDueño, domicilioDueño, edadDueño);
        this.nombre = nombre;
        
        admins=new Administrativo[50];
        opers=new Operario[100];
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
