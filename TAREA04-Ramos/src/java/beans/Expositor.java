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
public class Expositor extends Persona {
    private String especialidad;

   

    public Expositor(String especialidad, int dni, String nombre, String apellidos, String correo) {
        super(dni, nombre, apellidos, correo);
        this.especialidad = especialidad;
    }

    
    @Override
    public String toString() {
        return "Expositor{" + "especialidad=" + especialidad + '}';
    }

    
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
