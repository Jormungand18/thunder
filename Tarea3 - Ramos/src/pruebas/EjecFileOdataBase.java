/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import Beans.Evento;
import daos.impl.EventoDaoImplFile;
import evento.daos.EventoDao;
import java.util.Collections;
import daos.impl.EventoDaoImplMemory;
import ev.services.EventoService;
import ev.services.EventoServiceImpl;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class EjecFileOdataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        EventoService dao = new EventoServiceImpl();
                     
      try{
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
        Evento evento1 = new Evento(21, "Programmer","2019/07/11", "Av Brasil", 24);
        Evento evento2 = new Evento(11, "Developer","2019/03/31", "Av Jazmines", 17);
        Evento evento3 = new Evento(16, "expert","2019/03/18", "Av El aire", 18);
        Evento evento4 = new Evento(19, "expert","2018/02/21", "Av El aire", 18);
            dao.grabar(evento1);
            dao.grabar(evento2);
            dao.grabar(evento3);
            dao.grabar(evento4);
            dao.grabar(new Evento(5, "Springboot","2019/04/21", "Av El aire", 19));
            //Actualizar
            dao.actualizar(new Evento(10, "Programacion .Net", "2019/04/28", "Av palmerasss", 12));
            //Eliminar
            dao.borrar(16);
            dao.borrar(20);
      }
      
      //  catch(FileNotFoundException e)  <-Este debió ser ...
      catch(Exception e){
          System.out.println("GRABÓ!, si antes no había file ahora hay, revisa la ruta");
      }
        
        
            
        
    }
}
