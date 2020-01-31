/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;



/**
 *
 * @author Rosario
 */
public enum CategoriaEnum {

    /**
     *
     */
    PLATINUM(350), 
    GOLD(150), 
    SILVER(100);
    
    private final int Costo;
    
    private CategoriaEnum(int a){
    Costo=a;
}

    /**
     * @return the costo
     */
    public int getCosto() {
        return Costo;
    }
    
}
