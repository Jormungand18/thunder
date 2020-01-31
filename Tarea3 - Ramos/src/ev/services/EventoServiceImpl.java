/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev.services;

import Beans.Evento;
import evento.daos.EventoDao;
import daos.impl.DaoFactory;
import static tarea3.util.Util.opc;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class EventoServiceImpl implements EventoService{
    private EventoDao dao;

    public EventoServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getEventoDao(opc);
    }
    
    @Override
    public void grabar(Evento event) {
        dao.create(event);
    }

    @Override
    public Evento buscar(Object Id) {
        return dao.find(Id);
    }

    @Override
    public List<Evento> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Evento event) {
        dao.update(event);
    }

    @Override
    public void borrar(Object Id) {
        dao.delete(Id);
    }

    

    @Override
    public List<Evento> findAllOrderByFech() {
        return dao.findAllOrderByFech();
    }

    @Override
    public List<Evento> findAllOrderByFechaAsc() {
        return dao.findAllOrderByFechaAsc();
    }
    @Override
    public List<Evento> findAllOrderByFechaDesc() {
        return dao.findAllOrderByFechaDesc();
    }
    @Override
    public List<Evento> findAllOrderByCapacidad() {
        return dao.findAllOrderByCapacidad();
    }

    
}
