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
public class Evento {
    private int id_evento;
    private String nombre;
    private String fecha;
    private String direccion;
    private int capacidad;

    public Evento(int id_evento, String nombre, String fecha, String direccion, int capacidad) {
        this.id_evento = id_evento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    public Evento() {
    }

    @Override
    public String toString() {
        return "Evento{" + "id_evento=" + id_evento + ", nombre=" + nombre + ", fecha=" + fecha + ", direccion=" + direccion + ", capacidad=" + capacidad + '}';
    }

    
    
    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
