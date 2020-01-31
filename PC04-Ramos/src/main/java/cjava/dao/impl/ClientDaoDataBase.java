/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao.impl;

import cjava.beans.Cliente;
import cjava.dao.ClienteDao;
import cjava.util.DBConn;
import cjava.util.Util;
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
public class ClientDaoDataBase implements ClienteDao{

    private Connection con;
    private ResultSet  rs;
    private CallableStatement cst;
    
    @Override
    public void create(Cliente t) {
        try {
            con = DBConn.getConnection();
            con.setAutoCommit(false);
            cst = con.prepareCall("{CALL sp_insertar_cliente(?,?,?,?,?)}");
            cst.setInt(1,t.getIdcliente());
            cst.setString(2,t.getApellido());
            cst.setString(3,t.getNombre());
            cst.setString(4,t.getCorreo());
            cst.setString(5,t.getTelefono());
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
    public Cliente find(Object id) {
          Cliente cliente = null;
        try{
           con = DBConn.getConnection();
           cst = con.prepareCall("{CALL sp_find_cliente(?)}");
           cst.setString(1,id.toString());
           rs = cst.executeQuery();
           if(rs.next()){
               cliente=new Cliente();
               cliente.setIdcliente(rs.getInt(1));
               cliente.setApellido(rs.getString(2));
               cliente.setNombre(rs.getString(3));
               cliente.setCorreo(rs.getString(4));
               cliente.setTelefono(rs.getString(5));
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
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> lCliente = new ArrayList<>();
        Cliente cliente;
        try {
            con = DBConn.getConnection();
            cst = con.prepareCall("{CALL sp_listar_cliente()}");
            rs = cst.executeQuery();
             while(rs.next()){
               cliente=new Cliente();
               cliente.setIdcliente(rs.getInt(1));
               cliente.setApellido(rs.getString(2));
               cliente.setNombre(rs.getString(3));
               cliente.setCorreo(rs.getString(4));
               cliente.setTelefono(rs.getString(5));               
               lCliente.add(cliente);
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
        return lCliente;
    }

    @Override
    public void update(Cliente t) {
        try {
            con = DBConn.getConnection();
            cst = con.prepareCall("{CALL sp_actualizar_cliente(?,?,?,?,?)}");
            cst.setInt(1,t.getIdcliente());
            cst.setString(2,t.getApellido());
            cst.setString(3,t.getNombre());
            cst.setString(4,t.getCorreo());
            cst.setString(5,t.getTelefono());
            
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
            cst = con.prepareCall("{CALL sp_eliminar_cliente(?)}");
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
    public List<Cliente> orderByIdCli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
