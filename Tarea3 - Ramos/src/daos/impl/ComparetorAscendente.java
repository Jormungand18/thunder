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
 * @author Rosario
 */
class ComparetorAscendente implements Comparator<Evento> {

   
    @Override
    public int compare(Evento o1, Evento o2) {
        
     
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
        LocalDate localDate = LocalDate.parse(o1.getFecha(), formatter);
        LocalDate localDate2 = LocalDate.parse(o2.getFecha(), formatter);
        return o1.getFecha().compareTo(o2.getFecha());
    }

}


