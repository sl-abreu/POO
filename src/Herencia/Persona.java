package Herencia;

import java.util.Objects;

/**
 *
 * @author robot
 */
public class Persona implements java.io.Serializable{
    protected String nombre;
    private String domicilio;
    private int añoNacimiento;

    public Persona() {
    }
    public Persona(String nombre, String domicilio, int añoNacimiento) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.añoNacimiento = añoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public int getAñoNacimiento() {
        return añoNacimiento;
    }
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder cad=new StringBuilder();
        
        cad.append("           Nombre: "+nombre);
        cad.append("\n        Domicilio: "+domicilio);
        cad.append("\nAño de nacimiento: "+añoNacimiento);
        return cad.toString();
    }
    
}
