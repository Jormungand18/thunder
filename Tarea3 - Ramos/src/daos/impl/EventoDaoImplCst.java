/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;

import Beans.Evento;
import evento.daos.EventoDao;
import tarea3.util.DbConection;
import tarea3.util.Util;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class EventoDaoImplCst implements EventoDao{

    private Connection cn;
    private ResultSet  rs;
    private CallableStatement cst;
    
    @Override
    public void create(Evento t) {
        try {
            
            cn = DbConection.getConnection();
            cn.setAutoCommit(false);
            cst = cn.prepareCall("{CALL sp_insertar_evento(?,?,?,?,?)}");
            cst.setInt(1,t.getId());
            cst.setString(2,t.getNombre());
            cst.setString(3,t.getFecha());
            cst.setString(4,t.getDireccion());
            cst.setInt(5,t.getCapacidad());
            cst.executeUpdate();
            //delete(null);
            cn.commit();
            cst.close();
            cn.close();
            System.out.println("grabo con callablestatement");
        }catch(SQLException | NullPointerException ex){
              try {
                  cn.rollback();
                  cst.close();
                  cn.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
    }

    @Override
    public Evento find(Object id) {
          Evento evento = null;
        try{
           cn = DbConection.getConnection();
           cst = cn.prepareCall("{CALL sp_find_evento(?)}");
           cst.setString(1,id.toString());
           rs = cst.executeQuery();
           if(rs.next()){
               evento=new Evento();
               evento.setId(rs.getInt(1));
               evento.setNombre(rs.getString(2));
               evento.setFecha(rs.getString(3));
               evento.setDireccion(rs.getString(4));
               evento.setCapacidad(rs.getInt(5));
           }
            rs.close();
            cst.close();
            cn.close();
        }catch(SQLException ex){
              try {
                  rs.close();
                  cst.close();
                  cn.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
        return evento;
    }

    @Override
    public List<Evento> findAll() {
        List<Evento> lEvento = new ArrayList<>();
        Evento evento;
        try {
            cn = DbConection.getConnection();
            cst = cn.prepareCall("{CALL sp_listar_evento()}");
            rs = cst.executeQuery();
             while(rs.next()){
               evento=new Evento();
               evento.setId(rs.getInt(1));
               evento.setNombre(rs.getString(2));
               evento.setFecha(rs.getString(3));
               evento.setDireccion(rs.getString(4));
               evento.setCapacidad(rs.getInt(5));
               
               lEvento.add(evento);
           }rs.close();
            cst.close();
            cn.close();
        }catch(SQLException ex){
              try {
                  rs.close();
                  cst.close();
                  cn.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
        return lEvento;
    }

    @Override
    public void update(Evento t) {
        try {
            cn = DbConection.getConnection();
            cst = cn.prepareCall("{CALL sp_actualizar_evento(?,?,?,?,?)}");
            cst.setInt(1,t.getId());
            cst.setString(2,t.getNombre());
            cst.setString(3,t.getFecha());
            cst.setString(4,t.getDireccion());
            cst.setInt(5,t.getCapacidad());
            
            cst.executeUpdate();
            cst.close();
            cn.close();
        }catch(SQLException ex){
              try {
                  cst.close();
                  cn.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
    }

    @Override
    public void delete(Object id) {
        try {
            cn = DbConection.getConnection();
            cst = cn.prepareCall("{CALL sp_eliminar_evento(?)}");
            cst.setString(1,id.toString());
            cst.executeUpdate();
            cst.close();
            cn.close();
        }catch(SQLException ex){
              try {
                  cst.close();
                  cn.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
    }

    @Override
    public List<Evento> findAllOrderByFech() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> findAllOrderByFechaAsc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> findAllOrderByFechaDesc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> findAllOrderByCapacidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
