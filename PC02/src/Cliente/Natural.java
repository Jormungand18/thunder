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
public class Natural extends DatosFijos{
    private int DNI;
    private String Nombre;
    private String ApePaterno;
    private String ApeMaterno;

    public Natural(int DNI, String Nombre, String ApePaterno, String ApeMaterno, int Telefono, String Direccion, String Correo) {
        super(Telefono, Direccion, Correo);
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.ApePaterno = ApePaterno;
        this.ApeMaterno = ApeMaterno;
    }

    /**
     * @return the DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
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
     * @return the ApePaterno
     */
    public String getApePaterno() {
        return ApePaterno;
    }

    /**
     * @param ApePaterno the ApePaterno to set
     */
    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    /**
     * @return the ApeMaterno
     */
    public String getApeMaterno() {
        return ApeMaterno;
    }

    /**
     * @param ApeMaterno the ApeMaterno to set
     */
    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    @Override
    public String toString() {
        return "Natural{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", ApePaterno=" + ApePaterno + ", ApeMaterno=" + ApeMaterno + '}';
    }
    
            
}
