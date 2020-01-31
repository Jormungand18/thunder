/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento.daos;

import Beans.Evento;
import java.util.List;


public interface EventoDao extends EntidadDao<Evento,Integer>{

    public List<Evento> findAllOrderByFech();
    public List<Evento> findAllOrderByFechaAsc();
    public List<Evento> findAllOrderByFechaDesc();
    public List<Evento> findAllOrderByCapacidad();
    public List<Evento> findAllOrderByCosto();


   
   
    
    
}
