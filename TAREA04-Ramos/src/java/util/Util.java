/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ResourceBundle;

/**
 *
 * @author emaravi
 */
public class Util {
   public static final int MEMORY=0;
   public static final int FILE=1;
   public static final int DB=2;
   
   public static int opc;
   
   public static final String ERROR1;
   public static final String ERROR2;
   
   static {
    ResourceBundle properties = ResourceBundle.getBundle("cjava.util.config");
    opc = Integer.parseInt(properties.getString("opc"));
    ERROR1 = properties.getString("error1");
    ERROR2 = properties.getString("error2");
   }
   
   public static final String RUTA= "e:/Datos.ini";

}
