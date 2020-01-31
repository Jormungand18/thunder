/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.service.impl;

import cjava.beans.Cliente;
import cjava.dao.ClienteDao;
import cjava.dao.impl.DaoFactory;
import cjava.service.ClienteService;
import cjava.util.Util;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class ClienteServiceImpl implements ClienteService{
    ClienteDao dao;
    public ClienteServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getClienteDao(Util.opc);
    }
    
    @Override
    public void grabar(Cliente cliente) {
        dao.create(cliente);
    }

    @Override
    public Cliente buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Cliente> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Cliente cliente) {
        dao.update(cliente);
    }

    @Override
    public void borrar(Object id) {
        dao.delete(id);
    }
    
}
