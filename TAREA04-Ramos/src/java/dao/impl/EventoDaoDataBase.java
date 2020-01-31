/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import beans.Evento;
import dao.EventoDao;
import util.DBConn;
import util.Util;
import dao.EventoDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class EventoDaoDataBase implements EventoDao{

    private Connection con;
    private ResultSet  rs;
    private CallableStatement cst;
    
    @Override
    public void create(Evento t) {
        try {
            con = DBConn.getConnection();
            con.setAutoCommit(false);
            cst = con.prepareCall("{CALL sp_ins_evento(?,?,?,?,?)}");
            cst.setInt(1,t.getId_evento());
            cst.setString(2,t.getNombre());
            cst.setString(3,t.getFecha());
            cst.setString(4,t.getDireccion());
            cst.setInt(5,t.getCapacidad());
            cst.executeUpdate();
            //delete(null);
            con.commit();
            cst.close();
            con.close();
            System.out.println("grabo con callablestatement");
        }catch(SQLException | NullPointerException ex){
              try {
                  con.rollback();
                  cst.close();
                  con.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
    }

    @Override
    public Evento find(Object id) {
          Evento evento = null;
        try{
           con = DBConn.getConnection();
           cst = con.prepareCall("{CALL sp_find_evento(?)}");
           cst.setString(1,id.toString());
           rs = cst.executeQuery();
           if(rs.next()){
               evento=new Evento();
               evento.setId_evento(rs.getInt(1));
               evento.setNombre(rs.getString(2));
               evento.setFecha(rs.getString(3));
               evento.setDireccion(rs.getString(4));
               evento.setCapacidad(rs.getInt(5));
           }
            rs.close();
            cst.close();
            con.close();
        }catch(SQLException ex){
              try {
                  rs.close();
                  cst.close();
                  con.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
        return evento;
    }

    @Override
    public List<Evento> findAll() {
        List<Evento> levento = new ArrayList<>();
        Evento evento;
        try {
            con = DBConn.getConnection();
            cst = con.prepareCall("{CALL sp_findAll_curso()}");
            rs = cst.executeQuery();
             while(rs.next()){
               evento=new Evento();
               evento.setId_evento(rs.getInt(1));
               evento.setNombre(rs.getString(2));
               evento.setFecha(rs.getString(3));
               evento.setDireccion(rs.getString(4));
               evento.setCapacidad(rs.getInt(5));
               levento.add(evento);
           }rs.close();
            cst.close();
            con.close();
        }catch(SQLException ex){
              try {
                  rs.close();
                  cst.close();
                  con.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
        return levento;
    }

    @Override
    public void update(Evento t) {
        try {
            con = DBConn.getConnection();
            cst = con.prepareCall("{CALL sp_upd_curso(?,?,?,?,?)}");
            cst.setInt(1,t.getId_evento());
            cst.setString(2,t.getNombre());
            cst.setString(3,t.getFecha());
            cst.setString(4,t.getDireccion());
            cst.setInt(5,t.getCapacidad());
            
            cst.executeUpdate();
            cst.close();
            con.close();
        }catch(SQLException ex){
              try {
                  cst.close();
                  con.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
    }

    @Override
    public void delete(Object id) {
        try {
            con = DBConn.getConnection();
            cst = con.prepareCall("{CALL sp_del_curso(?)}");
            cst.setString(1,id.toString());
            cst.executeUpdate();
            cst.close();
            con.close();
        }catch(SQLException ex){
              try {
                  cst.close();
                  con.close();
              } catch (SQLException ex1) {
                  System.out.println(Util.ERROR1);
              }
        }
    }

    @Override
    public List<Evento> orderByNombre() {
        return (List<Evento>) cst;
        //return dao.orderByNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Evento> orderByFecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

   
}
