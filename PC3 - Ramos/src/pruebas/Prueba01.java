/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Beans.CategoriaEnum;
import Beans.Evento;

import evento.daos.EventoDao;
import java.util.Collections;
import daos.impl.EventoDaoImplMemory;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;



public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventoDao dao = new EventoDaoImplMemory();
                     
        CategoriaEnum values[] = CategoriaEnum.values();
        ArrayList<CategoriaEnum> categ = new ArrayList<CategoriaEnum>();
        Evento evento1 = new Evento(20, "Programmer", LocalDate.of(2019, 02, 21), "Av palmeras", 20, "PLATINUM", 350);
        Evento evento2 = new Evento(10, "Developer",LocalDate.of(2019, 03, 31), "Av Jazmines", 17, "GOLD", 250);
        Evento evento3 = new Evento(16, "expert",LocalDate.of(2019,03, 18), "Av El aire", 18, "SILVER", 100);
        dao.create(evento1);
        dao.create(evento2);
        dao.create(evento3);
        
        dao.create(new Evento(5,"Springboot", LocalDate.of(2019, 04, 21), "Av El aire", 19, "PLATINUM", 350));
        //Actualizar
        dao.update(new Evento(10, "Programacion .Net", LocalDate.of(2019, 04, 28), "Av palmerasss", 12, "SILVER", 100));
        //Eliminar
        dao.delete(16);
        System.out.println("Fecha de eventos de forma ascendente");
        for(Evento a: dao.findAllOrderByFechaAsc()){
            System.out.println(a);
        }
        System.out.println("\n");
        System.out.println("Fecha de eventos de forma descendente");
         for(Evento a: dao.findAllOrderByFechaDesc()){
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
        System.out.println("El evento de menor capacidad es: "+Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getNombre()+" con capacidad: "+Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getCapacidad()+" y fecha: "+ Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha().getDayOfWeek()+" "+Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha().getDayOfMonth()+", "+Collections.min(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha().getMonth());
        System.out.println("El evento de mayor capacidad es: "+Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getNombre()+" con capacidad: "+Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getCapacidad()+" y fecha: "+ Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha().getDayOfWeek()+" "+Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha().getDayOfMonth()+", "+Collections.max(dao.findAllOrderByCapacidad(),comparatorCapacidad).getFecha().getMonth());
        
        Comparator<Evento> comparatorCosto = Comparator.comparing(Evento::getCosto);
       
        System.out.println("\nEl promedio de los costos máximos y minimos es: "+(Collections.max(dao.findAllOrderByCosto(),comparatorCapacidad).getCosto()+Collections.min(dao.findAllOrderByCosto(),comparatorCapacidad).getCosto())/2);
        
        
       /* Comparator<Evento> duplicateList;
        duplicateList = dao.findAllOrderByFechaDesc()
                .stream()
                // agrupar por cancion.
                .collect(Collectors.groupingBy(s -> s))
                .entrySet()
                .stream()
                // filtrar por los que tienen mas de una cancion por grupo
                .filter(e -> e.getValue().size() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.findAllOrderByCapacidad());

    for(LocalDate cancion : duplicateList) {
        System.out.println(cancion);
    }*/
        LocalDate target = LocalDate.of(2018, 12, 31);
        LocalDate ultimo = LocalDate.of(3000, 12, 31);
        Period p = Period.between(target, ultimo);
        
        System.out.println("\nEstos son los eventos antes de "+target+" :");
        for (Evento a : dao.findAllOrderByFech()) {
           /*if(a.contains(p)){
                System.out.println(a);
            }*/
            if(a.getFecha().isBefore(target)){
                System.out.println(a);
            }
            else{
                System.out.println("No hay evento");
            }
        }
        
        System.out.println("\nEstos son los eventos despues de " + target + " :");
        for (Evento a : dao.findAllOrderByFech()) {
            
            if (a.getFecha().isAfter(target)) {
                System.out.println(a);
            } else {
                System.out.println("No hay evento");
            }
        }
    }

}
        
        
        
        
  
	
    
    
    

