/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author Rosario
 */
public class DatosFijos {
  private int Telefono;
  private String Direccion;
  private String Correo;

    public DatosFijos(int Telefono, String Direccion, String Correo) {
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
    }

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
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

    @Override
    public String toString() {
        return "DatosFijos{" + "Telefono=" + Telefono + ", Direccion=" + Direccion + ", Correo=" + Correo + '}';
    }
  
}
