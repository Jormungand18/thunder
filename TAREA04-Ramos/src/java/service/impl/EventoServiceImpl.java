/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import beans.Evento;
import dao.impl.DaoFactory;
import java.util.List;
import service.EventoService;
import util.Util;
import dao.EventoDao;

/**
 *
 * @author FREDY
 */
public class EventoServiceImpl implements EventoService {

    EventoDao dao;
    public EventoServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getEventoDao(Util.opc);
    }
    
    @Override
    public void grabar(Evento curso) {
        dao.create(curso); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Evento buscar(Object id) {
        return dao.find(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> listar() {
        return dao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Evento curso) {
        dao.update(curso); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrar(Object id) {
        dao.delete(id); //To change body of generated methods, choose Tools | Templates.
    }
    
}
