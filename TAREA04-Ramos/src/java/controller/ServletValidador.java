/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Administrador;
import service.AdministradorService;
import service.impl.AdministradorServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author emaravi
 */
@WebServlet(name = "ServletValidador", urlPatterns = {"/sValidador"})
public class ServletValidador extends HttpServlet {
 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String us = request.getParameter("txtUsuario");
        String ps = request.getParameter("txtPassword");
        
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador administrador = servicio.validar(us, ps);
        
        HttpSession sesion =  request.getSession();
        
        if(administrador != null){
            sesion.setAttribute("usuario",administrador);
            
            response.sendRedirect("principal.jsp");
        }else{
            response.sendRedirect("errorIngreso.jsp");
        }
        
        
    }

 

}
