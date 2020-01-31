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
public class Asistente extends Persona {
    private String telefono;
    private String direccion;

    public Asistente(String telefono, String direccion, int dni, String nombre, String apellidos, String correo) {
        super(dni, nombre, apellidos, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
