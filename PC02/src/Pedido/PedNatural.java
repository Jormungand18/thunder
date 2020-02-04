/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedido;

import Cliente.Natural;

/**
 *
 * @author Rosario
 */
public class PedNatural extends Natural {
    private int NroPedido;
    private String FechaPedido;
    private int CantPedido;
    

    public PedNatural(int NroPedido, String FechaPedido, int CantPedido, int DNI, String Nombre, String ApePaterno, String ApeMaterno, int Telefono, String Direccion, String Correo) {
        super(DNI, Nombre, ApePaterno, ApeMaterno, Telefono, Direccion, Correo);
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
