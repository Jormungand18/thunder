package cjava.service;

import cjava.beans.Cliente;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface ClienteService {
        public void grabar(Cliente cliente);
    
    public Cliente buscar(Object id);
    public List<Cliente> listar();
    
    public void actualizar(Cliente cliente);
    public void borrar(Object id);
}
