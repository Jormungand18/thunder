/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.impl;


import Beans.Evento;
import evento.daos.EventoDao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 *
 * @author emaravi
 */
public class EventoDaoImplFile implements EventoDao{

 
    private List<Evento> lista;

    public EventoDaoImplFile() {
        lista = new ArrayList<>();
    }

    @Override
    public void create(Evento t) {
        if(find(t.getId())==null)
            lista.add(t);
        grabarArchivo();
    }

    @Override
    public Evento find(Object Id) {
        cargarArchivo();
        for(Evento a:lista){ 
            if(a.getId()==(int)Id) 
                return a;
        }
        return null;
    }

    @Override
    public List<Evento> findAll() {
        cargarArchivo();
        return lista;
    }

    @Override
    public void update(Evento t) {
        for(int ind=0; ind<lista.size(); ind++){
            if(lista.get(ind).getId()==t.getId()){
                lista.set(ind,t);
                break;
            }
        }
        grabarArchivo();
    }

    @Override
    public void delete(Object Id) {
        lista.remove(find(Id));
        grabarArchivo();
    }
    
     @Override
    public List<Evento> findAllOrderByFech() {
        cargarArchivo();
        Comparator<Evento> sortFech = new Comparetor();
         Collections.sort(lista, sortFech);  
        return lista;
    }

    @Override
     public List<Evento> findAllOrderByFechaAsc() {
        cargarArchivo();
        Comparator<Evento> sortFecha = new ComparetorAscendente();
        Collections.sort(lista, sortFecha);      
        
        return lista;
    }

    @Override
    public List<Evento> findAllOrderByFechaDesc() {
        cargarArchivo();
        Comparator<Evento> sortFecha = new ComparetorDescendente();
        Collections.sort(lista, sortFecha);
        return lista;
    }
     @Override
    public List<Evento> findAllOrderByCapacidad() {
        cargarArchivo();
        Comparator<Evento> sortCapacidad = new ComparetorCapacidad();
        Collections.sort(lista, sortCapacidad);
        return lista;
    }
   
   
    
     public void grabarArchivo(){
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("C:\\Users\\Rosario\\Desktop\\evento.txt"))) {
            String line;
            for(Evento ev:lista){
                line = ev.getId()+","+ev.getNombre()+","+ev.getFecha()+
                        ","+ev.getDireccion()+","+ev.getCapacidad();
                bufOutput.write(line);
                bufOutput.newLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Excepcion de entrada salida: " + e);
        }
    }
    public void cargarArchivo(){
        try (BufferedReader bufInput = new BufferedReader(new FileReader("C:\\Users\\Rosario\\Desktop\\evento.txt"))) {
            String line;
            Evento evento;
            lista = new ArrayList<>();
            while ((line = bufInput.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(line,",");
                evento = new Evento();
                evento.setId(Integer.parseInt(tokens.nextToken().trim()));
                evento.setNombre(tokens.nextToken().trim());
                evento.setFecha(tokens.nextToken().trim());
                evento.setDireccion(tokens.nextToken().trim());
                evento.setCapacidad(Integer.parseInt(tokens.nextToken().trim()));
                
                lista.add(evento);
            }
        }  catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Excepcion de entrada salida: " + e);
        }
    }

    
   

    
   
}
