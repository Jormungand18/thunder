/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao;

import java.util.List;

/**
 *
 * @author emaravi
 * @param <T>
 */
public interface EntidadDao <T> {
    public void create(T t);
    
    public T find(Object id);
    public List<T> findAll();
    
    public void update(T t);
    public void delete(Object id);
}
