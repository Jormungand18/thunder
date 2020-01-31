/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Evento;
import java.util.List;

/**
 *
 * @author FREDY
 */
public interface EventoDao extends EntidadDao<Evento> {
    public List<Evento> orderByNombre();
    
    public List<Evento> orderByFecha();
    
    
}
