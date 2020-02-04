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
public class Juridico extends DatosFijos{
    private String NomTienda;
    private int RUC;

    
    public Juridico(String NomTienda, int RUC, int Telefono, String Direccion, String Correo) {
        super(Telefono, Direccion, Correo);
        this.NomTienda = NomTienda;
        this.RUC = RUC;
    }

    /**
     * @return the NomTienda
     */
    public String getNomTienda() {
        return NomTienda;
    }

    /**
     * @param NomTienda the NomTienda to set
     */
    public void setNomTienda(String NomTienda) {
        this.NomTienda = NomTienda;
    }

    /**
     * @return the RUC
     */
    public int getRUC() {
        return RUC;
    }

    /**
     * @param RUC the RUC to set
     */
    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    @Override
    public String toString() {
        return "Juridico{" + "NomTienda=" + NomTienda + ", RUC=" + RUC + '}';
    }
    
}
