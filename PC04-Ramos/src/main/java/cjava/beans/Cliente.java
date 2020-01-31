/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.beans;

/**
 *
 * @author Rosario
 */
public class Cliente {
    private int Idcliente;
    private String Apellido;
    private String Nombre;
    private String Correo;
    private String Telefono;
    
    public Cliente(){
        
    }
    public Cliente(int Idcliente, String Apellido, String Nombre, String Correo, String Telefono) {
        this.Idcliente = Idcliente;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    /**
     * @return the Idcliente
     */
    public int getIdcliente() {
        return Idcliente;
    }

    /**
     * @param Idcliente the Idcliente to set
     */
    public void setIdcliente(int Idcliente) {
        this.Idcliente = Idcliente;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
