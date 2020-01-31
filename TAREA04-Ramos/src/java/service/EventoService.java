/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Evento;
import java.util.List;

/**
 *
 * @author FREDY
 */
public interface EventoService {
    public void grabar(Evento curso);
    
    public Evento buscar(Object id);
    public List<Evento> listar();
    
    public void actualizar(Evento curso);
    public void borrar(Object id);
}
