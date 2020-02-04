/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedido;

import Cliente.Juridico;

/**
 *
 * @author Rosario
 */
public class PedJuridico extends Juridico{
    private int NroPedido;
    private String FechaPedido;
    private int CantPedido;
     
    
    
    public PedJuridico(int NroPedido, String FechaPedido, int CantPedido, String NomTienda, int RUC, int Telefono, String Direccion, String Correo) {
        super(NomTienda, RUC, Telefono, Direccion, Correo);
        this.NroPedido = NroPedido;
        this.FechaPedido = FechaPedido;
        this.CantPedido = CantPedido;
    }

    /**
     * @return the NroPedido
     */
    public int getNroPedido() {
        return NroPedido;
    }

    /**
     * @param NroPedido the NroPedido to set
     */
    public void setNroPedido(int NroPedido) {
        this.NroPedido = NroPedido;
    }

    /**
     * @return the FechaPedido
     */
    public String getFechaPedido() {
        return FechaPedido;
    }

    /**
     * @param FechaPedido the FechaPedido to set
     */
    public void setFechaPedido(String FechaPedido) {
        this.FechaPedido = FechaPedido;
    }

    /**
     * @return the CantPedido
     */
    public int getCantPedido() {
        return CantPedido;
    }

    /**
     * @param CantPedido the CantPedido to set
     */
    public void setCantPedido(int CantPedido) {
        this.CantPedido = CantPedido;
    }
    
}
