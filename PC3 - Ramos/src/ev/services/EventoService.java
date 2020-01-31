/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev.services;

import java.util.List;
import Beans.Evento;

/**
 *
 * @author Rosario
 */
public interface EventoService {
    public void grabar(Evento evento);
    
    public Evento buscar(String id);
    public List<Evento> listar();
    
    public void actualizar(Evento evento);
    
    public void borrar(Evento evento);
}