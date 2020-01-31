package cjava.beans;

import java.util.Objects;

/**
 *
 * @author emaravi
 */
public class Persona {
    private int id;
    private String nombre;
    private boolean genero;

    public Persona(){
   }

    public Persona(int id, String nombre, boolean genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + (this.genero ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
//        if (this.id != other.id) {
//            return false;
//        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        return true;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
