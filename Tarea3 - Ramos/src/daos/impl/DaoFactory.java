package daos.impl;


import evento.daos.EventoDao;
import static tarea3.util.Util.CST;
import static tarea3.util.Util.FILE;

/**
 *
 * @author emaravi
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
           case FILE: return new EventoDaoImplFile();
           case CST: return new EventoDaoImplCst();
           default: return null;    
        }
    }
    
    
    
    
}
