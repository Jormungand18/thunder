/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.util;

import cjava.beans.Cliente;
import java.util.Comparator;

/**
 *
 * @author emaravi
 */
public class ClienteOrdenPorIdCli implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
        int result = Integer.compare(o1.getIdcliente(),o2.getIdcliente());
        if (result != 0) { return result; }
        else { 
            
            return 0;
        } 
    }
    
}
