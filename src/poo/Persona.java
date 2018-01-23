package poo;

import java.util.Objects;

/**
 *
 * @author robot
 */
public class Persona {
    private String nombre;
    private String domicilio;
    private int edad;

    public Persona() {
    }
    public Persona(String nombre, String domicilio, int edad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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
        return "Persona{" + "nombre=" + nombre + ", domicilio=" + domicilio + ", edad=" + edad + '}';
    }
    
}
