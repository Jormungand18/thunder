/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;

import Beans.Evento;
import java.util.Comparator;

/**
 *
 * @author Rosario
 */
class ComparetorAscendente implements Comparator<Evento> {

   
    @Override
    public int compare(Evento o1, Evento o2) {
        int op;
     

        return op=o1.getFecha().compareTo(o2.getFecha());
    }

}


