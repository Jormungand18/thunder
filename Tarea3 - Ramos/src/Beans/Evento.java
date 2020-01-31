/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.time.LocalDate;


/**
 *
 * @author Rosario
 */
public class Evento {
    private int Id;
    private String Nombre;
    private String Fecha;
    private String Direccion;
    private int Capacidad;

    public Evento() {
        
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
   

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Capacidad
     */
    public int getCapacidad() {
        return Capacidad;
    }

    /**
     * @param Capacidad the Capacidad to set
     */
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Evento(int Id, String Nombre, String Fecha, String Direccion, int Capacidad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Capacidad = Capacidad;
    }

    @Override
    public String toString() {
        return "Id=" + Id + ", Nombre=" + Nombre + ", Fecha=" + getFecha() + ", Direccion=" + Direccion + ", Capacidad=" + Capacidad;
    }


    
  

    

    
}
