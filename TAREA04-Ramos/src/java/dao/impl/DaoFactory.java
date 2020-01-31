/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AdministradorDao;
import dao.EventoDao;
import static util.Util.DB;
import static util.Util.FILE;
import static util.Util.MEMORY;

/**
 *
 * @author FREDY
 */
public class DaoFactory {
    private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {
        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public EventoDao getEventoDao(int tipo){
        switch(tipo){
           case MEMORY: return new EventoDaoMemory();
           case FILE: return new EventoDaoFile();
           case DB: return new EventoDaoDataBase();
           default: return null;    
        }
    }
    
//    public CursoDao getCursoDao(int tipo){
//        switch(tipo){
//           case MEMORY: return new CursoDaoMemory();
//           case FILE: return new CursoDaoFile();
//           case DB: return new CursoDaoDataBase();
//           default: return null;    
//        }
//    }
//    
    public AdministradorDao getAdministradorDao(int tipo){
        switch(tipo){
           case MEMORY: return new AdministradorDaoMemory();
           case FILE: return new AdministradorDaoFile();
           case DB: return new AdministradorDaoDataBase();
           default: return null;    
        }
    }
}
