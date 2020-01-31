/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Evento;
import java.util.Comparator;

/**
 *
 * @author emaravi
 */
public class EventoOrdenPorFecha implements Comparator<Evento>{

    @Override
    public int compare(Evento e1, Evento e2) {
        return e1.getFecha().compareTo(e2.getFecha()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
