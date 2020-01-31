/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;

import Beans.Evento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;


/**
 *
 * @author emaravi
 */
public class ComparetorCapacidad implements Comparator<Evento>{

    @Override
    public int compare(Evento o1, Evento o2) {
    
    return Integer.compare(o2.getCapacidad(),o1.getCapacidad());
    
      
    }
    
    
    
}
