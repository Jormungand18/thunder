/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.time.LocalDate;
import java.time.Period;

import java.util.Date;
import java.util.stream.Stream;

/**
 *
 * @author Rosario
 */
public class Evento {
    private int Id;
    private String Nombre;
    private LocalDate Fecha;
    private String Direccion;
    private int Capacidad;
    private String Categoria;
    private int Costo;
  

    public Evento(int Id, String Nombre, LocalDate Fecha, String Direccion, int Capacidad, String Categoria, int Costo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Direccion = Direccion;
        this.Capacidad = Capacidad;
        this.Categoria = Categoria;
        this.Costo = Costo;
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
    public LocalDate getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(LocalDate Fecha) {
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

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the Costo
     */
    public int getCosto() {
        return Costo;
    }

    /**
     * @param Costo the Costo to set
     */
    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "Evento{" + "Id=" + Id + ", Nombre=" + Nombre + ", Fecha=" + Fecha + ", Direccion=" + Direccion + ", Capacidad=" + Capacidad + ", Categoria=" + Categoria + ", Costo=" + Costo + '}';
    }

    

    

    
}
