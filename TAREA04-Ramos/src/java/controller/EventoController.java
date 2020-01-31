/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Evento;
import service.EventoService;
import service.impl.EventoServiceImpl;
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
public class EventoController extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int sId_evento = Integer.parseInt(request.getParameter("txtId"));
        String sNombre = request.getParameter("txtNombre");
        String sFecha = request.getParameter("txtFecha");
        String sDireccion = request.getParameter("txtDireccion");
        int sCapacidad = Integer.parseInt(request.getParameter("txtCapacidad"));
//        int sCreditos = Integer.parseInt(request.getParameter("txtCreditos"));
        String accion = request.getParameter("accion");
        
        EventoService servicio = new EventoServiceImpl();
        Evento evento = new Evento(sId_evento, sNombre, sFecha,sDireccion,sCapacidad);
        
        switch(accion){
            case "insertar": {
                servicio.grabar(evento);
                break;
            }
            case "eliminar":{
                servicio.borrar(sId_evento);
                break;
            }
            case "actualizar":{
                servicio.actualizar(evento);
                break;
            }
        }
        response.sendRedirect("msg.jsp");
        
    }

   
    
}
