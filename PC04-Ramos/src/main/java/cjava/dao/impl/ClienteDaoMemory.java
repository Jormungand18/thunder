/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao.impl;

import cjava.beans.Cliente;
import cjava.dao.ClienteDao;
import cjava.util.ClienteOrdenPorIdCli;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class ClienteDaoMemory implements ClienteDao{

    private List<Cliente> lCliente;

    public ClienteDaoMemory() {
        lCliente = new ArrayList<>();
    }

    @Override
    public void create(Cliente t) {
        if(find(t.getIdcliente())==null)
            lCliente.add(t);
    }

    @Override
    public Cliente find(Object id) {
        for(Cliente cliente:lCliente){
            if(cliente.getIdcliente()==(int)id)
                return cliente;
        }
        return null;
    }

    @Override
    public List<Cliente> findAll() {
        return lCliente;
    }

    @Override
    public void update(Cliente t) {
        for(int ind=0; ind<lCliente.size(); ind++){
            if(lCliente.get(ind).getIdcliente()==t.getIdcliente()){
                lCliente.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(Object id) {
        lCliente.remove(find(id));
    }
    
    @Override
    public List<Cliente> orderByIdCli() {
        Comparator<Cliente> sortIDcli = new ClienteOrdenPorIdCli();
         Collections.sort(lCliente, sortIDcli);  
        return lCliente;
    }
   


}
