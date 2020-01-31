package cjava.dao.impl;



import cjava.dao.ClienteDao;
import static cjava.util.Util.MEMORY;
import static cjava.util.Util.FILE;
import static cjava.util.Util.DB;
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
    
  
    
   
    
    public ClienteDao getClienteDao(int tipo){
        switch(tipo){
           case MEMORY: return new ClienteDaoMemory();
           case FILE: return new ClienteDaoFile();
           case DB: return new ClientDaoDataBase();
           default: return null;    
        }
    }
    
   
    
    
}
