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
public class EventoOrdenPorNombre implements Comparator<Evento>{

    @Override
    public int compare(Evento o1, Evento o2) {
        int result = o1.getNombre().compareTo(o2.getNombre());
        if (result != 0) { return result; }
        else { 
            return 0;
        } 
    }
    
}
