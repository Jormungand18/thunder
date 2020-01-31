/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;

import Beans.Evento;
import evento.daos.EventoDao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Rosario
 */
public class EventoDaoImplMemory implements EventoDao {

    public List<Evento> lista;

    public EventoDaoImplMemory() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Evento t) {
        if(find(t.getId())==null)
            lista.add(t);
    }

    @Override
    public Evento find(Object id) {
        for(Evento a:lista){
            if(a.getId()==(int)id) 
                return a;
        }
        return null;
    }

    @Override
    public List<Evento> findAll() {
        return lista;
    }

    @Override
    public void update(Evento t) {
        for(int ind=0; ind<lista.size(); ind++){
            if(lista.get(ind).getId()==t.getId()){
                lista.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lista.remove(find(id));
    }
    
    
 

   @Override
    public List<Evento> findAllOrderByFech() {
        Comparator<Evento> sortFech = new Comparetor();
         Collections.sort(lista, sortFech);  
        return lista;
    }

    @Override
    public List<Evento> findAllOrderByFechaAsc() {
        
        Comparator<Evento> sortFecha = new ComparetorAscendente();
        Collections.sort(lista, sortFecha);      
        
        return lista;
    }

    @Override
    public List<Evento> findAllOrderByFechaDesc() {
        Comparator<Evento> sortFecha = new ComparetorDescendente();
        Collections.sort(lista, sortFecha);
        return lista;
    }

    @Override
    public List<Evento> findAllOrderByCapacidad() {
        Comparator<Evento> sortCapacidad = new ComparetorCapacidad();
        Collections.sort(lista, sortCapacidad);
        return lista;
    }

  
}
    
  
    


