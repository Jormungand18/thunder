/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.controllers;

import cjava.util.Reporteador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rosario
 */
@WebServlet(name = "ServletPDF", urlPatterns = {"/sPDF"})
public class ServletPDF extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Reporteador reporteador = new Reporteador();
        reporteador.generaPDF("cjava",getServletContext());
        response.sendRedirect("reporte.pdf");
    }

   

}
