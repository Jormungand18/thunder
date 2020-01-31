/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Administrador;

/**
 *
 * @author emaravi
 */
public interface AdministradorService {
    public Administrador validar(String user, String password);
    
    public void grabar(Administrador administrador);
    
}
