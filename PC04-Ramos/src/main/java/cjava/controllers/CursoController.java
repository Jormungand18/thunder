/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.controllers;

import cjava.beans.Cliente;
import cjava.service.ClienteService;
import cjava.service.impl.ClienteServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emaravi
 */
@WebServlet(name = "CursoController", urlPatterns = {"/cController"})
public class CursoController extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int sCodigo = Integer.parseInt(request.getParameter("txtIdcliente"));
        String sApellido = request.getParameter("txtApellido");
        String sNombre = request.getParameter("txtNombre");
        String sCorreo = request.getParameter("txtCorreo");
        String sTelefono = request.getParameter("txtTelefono");
        
        String accion = request.getParameter("accion");
        
        ClienteService servicio = new ClienteServiceImpl();
        Cliente cliente = new Cliente(sCodigo, sApellido, sNombre, sCorreo, sTelefono);
        
        switch(accion){
            case "insertar": {
                servicio.grabar(cliente);
                break;
            }
            case "eliminar":{
                servicio.borrar(sCodigo);
                break;
            }
            case "actualizar":{
                servicio.actualizar(cliente);
                break;
            }
        }
        response.sendRedirect("msg.jsp");
        
    }

   
    
}
