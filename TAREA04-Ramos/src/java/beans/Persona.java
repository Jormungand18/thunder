/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author FREDY
 */
public class Persona {
    private  int dni;
    private String nombre;
    private String apellidos;
    private String correo;

    public Persona(int dni, String nombre, String apellidos, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo + '}';
    }

    
    
    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
