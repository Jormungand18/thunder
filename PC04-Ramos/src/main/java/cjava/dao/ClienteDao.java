/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao;

import cjava.beans.Cliente;
import java.util.List;

/**
 *
 * @author Rosario
 */
public interface ClienteDao extends EntidadDao<Cliente>{
    public List<Cliente> orderByIdCli();
}
