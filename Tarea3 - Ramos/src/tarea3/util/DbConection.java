/*
Esta clase permitira definir las conexiones a base de datos.
*/
package tarea3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase utilitaria para generar conexiones a bases de datos
 * @author Edwin Maravi
 * @since 22/08/2018
 * @version 0.0001
 */
public class DbConection {
    /**
     * Este metodo tiene las credenciales para acceder a la base de datos
     * MySQL.  Su retorno es estatico.
     * @return conexionMySQL
     */
    private static DbConection instance;
    
    private DbConection(){
    
    }

    public static DbConection getInstance(){
        if (instance == null){
            instance = new DbConection();
        }
        return instance;
    }    
    
    public static Connection getConnection(){
        Connection cn = null;
        try {
            //Cargar el driver
            //Class.forName("com.mysql.jdbc.Driver");            
            //Conexion a la BD
            //String url = "jdbc:mysql://localhost:3306/ventas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";            
            String url = "jdbc:mysql://localhost:3306/evento";
            cn = DriverManager.getConnection(url, "root","");            
                        
//        }catch(ClassNotFoundException ex1){
//            System.err.println("ERROR: " + ex1.getMessage());
        }catch(SQLException ex2){
            System.err.println("CODIGO: " + ex2.getErrorCode());
            System.err.println("ERROR: " + ex2.getMessage());
        }        
        return cn;
    }   
    public void close(Connection cn){
        try{
            if(cn != null)
                cn.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }    
    public void close(Statement stm){
        try{
            if(stm != null)
                stm.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    public void close(ResultSet rs){
        try{
            if(rs != null)
                rs.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
}
