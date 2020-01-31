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
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class EjecMemory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventoDao dao = new EventoDaoImplMemory();
                     
        
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
        Evento evento1 = new Evento(21, "Programmer","2019/07/11", "Av Brasil", 24);
        Evento evento2 = new Evento(11, "Developer","2019/03/31", "Av Jazmines", 17);
        Evento evento3 = new Evento(16, "expert","2019/03/18", "Av El aire", 18);
        Evento evento4 = new Evento(19, "expert","2018/02/21", "Av El aire", 18);
        
            dao.create(evento1);
            dao.create(evento2);
            dao.create(evento3);
            dao.create(evento4);
            dao.create(new Evento(5, "Springboot","2019/04/21", "Av El aire", 19));
            //Actualizar
            dao.update(new Evento(10, "Programacion .Net", "2019/04/28", "Av palmerasss", 12));
            //Eliminar
            dao.delete(16);
            dao.delete(20);
                    
                   
        System.out.println("Fecha de eventos de forma ascendente");
        for(Evento a: dao.findAllOrderByFechaAsc()){
            LocalDate localDate = LocalDate.parse(a.getFecha(), formatter);
            System.out.println(a);
            
        }
        System.out.println("\n");
        System.out.println("Fecha de eventos de forma descendente");
         for(Evento a: dao.findAllOrderByFechaDesc()){
            LocalDate localDate = LocalDate.parse(a.getFecha(), formatter);
            System.out.println(a);
            
        }
        System.out.println("\n");
        System.out.println("Eventos Fecha final e inicial");        
        Comparator<Evento> comparatorFechas = Comparator.comparing(Evento::getFecha);
        System.out.println("Primera fecha de Evento: "+Collections.min(dao.findAllOrderByFechaAsc(),comparatorFechas).getFecha());
        System.out.println("Ultima fecha de Evento: "+Collections.max(dao.findAllOrderByFechaAsc(),comparatorFechas).getFecha());
        
        System.out.println("\n");
        System.out.println("Eventos capacidad máxima y mínima");
        
        Comparator<Evento> comparatorCapacidad = Comparator.comparing(Evento::getCapacidad);
        
        System.out.println("El evento de menor capacidad es: "+Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getNombre()+" con capacidad: "+Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getCapacidad()+" y fecha: "+ Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha());
        System.out.println("El evento de mayor capacidad es: "+Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getNombre()+" con capacidad: "+Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getCapacidad()+" y fecha: "+ Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha());
       
        
        System.out.println("\nEl promedio de los eventos con capacidad máxima y minima es: "+(Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getCapacidad()+(Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getCapacidad()))/2);
        
        int Captotal=0;
        for(Evento a: dao.findAllOrderByFechaDesc()){
            Captotal += a.getCapacidad();
            
        }
        System.out.println("\nEl total de capacidades de los diferentes eventos es: "+Captotal+" vacantes");
    }
}

        
        
        
        
  
	
    
    
    

