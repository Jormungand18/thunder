/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import beans.Administrador;
import dao.AdministradorDao;
import dao.impl.DaoFactory;
import service.AdministradorService;
import util.Util;

/**
 *
 * @author emaravi
 */
public class AdministradorServiceImpl implements AdministradorService{

    AdministradorDao dao;

    public AdministradorServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getAdministradorDao(Util.opc);
    }
    
    @Override
    public Administrador validar(String user, String password) {
        return dao.validarLogin(user,password);
    }

    @Override
    public void grabar(Administrador administrador) {
        dao.create(administrador);
    }
    
    
    
}
