/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao.impl;

import cjava.beans.Cliente;
import cjava.dao.ClienteDao;
import cjava.util.ClienteOrdenPorIdCli;

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
public class ClienteDaoFile implements ClienteDao{

 
    private List<Cliente> lCliente;

    public ClienteDaoFile() {
        lCliente = new ArrayList<>();
    }

    @Override
    public void create(Cliente t) {
        if(find(t.getIdcliente())==null)
            lCliente.add(t);
        grabarArchivo();
    }

    @Override
    public Cliente find(Object id) {
        cargarArchivo();
        for(Cliente alumno:lCliente){
            if(alumno.getIdcliente()==(int)id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Cliente> findAll() {
        cargarArchivo();
        return lCliente;
    }

    @Override
    public void update(Cliente t) {
        for(int ind=0; ind<lCliente.size(); ind++){
            if(lCliente.get(ind).getIdcliente()==t.getIdcliente()){
                lCliente.set(ind,t);
                break;
            }
        }
        grabarArchivo();
    }

    @Override
    public void delete(Object id) {
        lCliente.remove(find(id));
        grabarArchivo();
    }
    
    
  @Override
    public List<Cliente> orderByIdCli() {
        Comparator<Cliente> sortIDcli = new ClienteOrdenPorIdCli();
         Collections.sort(lCliente, sortIDcli);  
        return lCliente;
    }

    
     public void grabarArchivo(){
        try (BufferedWriter bufOutput = new BufferedWriter(new FileWriter("alumnos.txt"))) {
            String line;
            for(Cliente cli:lCliente){
                line = cli.getIdcliente()+","+cli.getApellido()+","+cli.getNombre()+
                        ","+cli.getCorreo()+","+cli.getTelefono();
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
        try (BufferedReader bufInput = new BufferedReader(new FileReader("alumnos.txt"))) {
            String line;
            Cliente cliente;
            lCliente = new ArrayList<>();
            while ((line = bufInput.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(line,",");
                cliente = new Cliente();
                cliente.setIdcliente(Integer.parseInt(tokens.nextToken().trim()));
                cliente.setApellido(tokens.nextToken().trim());
                cliente.setNombre(tokens.nextToken().trim());
                cliente.setCorreo(tokens.nextToken().trim());
                cliente.setTelefono(tokens.nextToken().trim());
                lCliente.add(cliente);
            }
        }  catch (FileNotFoundException f) {
            System.out.println("Archivo no encontrado: " + f);
        } catch (IOException e) {
            System.out.println("Excepcion de entrada salida: " + e);
        }
    }

    
    public int count() {
        return lCliente.size();
    }

    
    public List<Cliente> findAllFilterByName(String name) {
        cargarArchivo();
        List<Cliente> nList=null;
//        nList = lAlumno.stream()
//                .filter(a-> a.getNombre().equals(name))
//                .collect(Collectors.toList());    
        return nList;
    }

  
    

}
