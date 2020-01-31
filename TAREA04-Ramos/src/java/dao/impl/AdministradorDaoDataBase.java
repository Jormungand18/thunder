/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import beans.Administrador;
import dao.AdministradorDao;
import util.DBConn;
import static util.Util.ERROR2;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import static util.Util.ERROR2;

/**
 *
 * @author emaravi
 */
public class AdministradorDaoDataBase implements AdministradorDao{

    private Connection con;
    private ResultSet  rs;
    private CallableStatement cst;
    
    @Override
    public Administrador validarLogin(String us, String ps) {
        Administrador administrador = null;
        try{
           con = DBConn.getConnection();
           cst = con.prepareCall("{CALL sp_login(?,?)}");
           cst.setString(1,us);
           cst.setString(2,ps);
           rs = cst.executeQuery();
           if(rs.next()){
               administrador=new Administrador();
               administrador.setLogin(rs.getString(1));
               administrador.setPassword(rs.getString(2));
               
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
                  System.out.println(ERROR2);
              }
        }
        return administrador;
    }

    @Override
    public void create(Administrador t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrador> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Administrador t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
