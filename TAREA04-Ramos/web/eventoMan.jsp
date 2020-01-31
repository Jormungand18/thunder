<%-- 
    Document   : cursoMan
    Created on : 24/09/2017, 08:10:08 AM
    Author     : emaravi
--%>
<%@page import="beans.Evento"%>
<%@page import="service.impl.EventoServiceImpl"%>
<%@page import="service.EventoService"%>
<%@page import="beans.Administrador"%>
<%@page import="java.util.List"%>

<%
    // scriplet de java
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("usuario")==null){
        response.sendRedirect("errorIngreso.jsp");
    }else{
        Administrador adm = (Administrador)sesion.getAttribute("usuario");
        EventoService servicio = new EventoServiceImpl();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Eventos! ::::: <%= adm.getLogin()%></title>
    </head>
    <body>
        <h1>Mantenimiento de Eventos!</h1>
        <a href="eventoInsertar.jsp">Nuevo Evento</a>
            <table border>
            <tr>
                <th>id</th>
                <th>nombre</th>
                <th>fecha</th>
                <th>direccion</th>
                <th>capacidad</th>
                <th colspan="2">operaciones</th>
            </tr>
            <%for(Evento evento: servicio.listar()){%>
            <tr>
                <td><%= evento.getId_evento()%></td>
                <td><%= evento.getNombre()%></td>
                <td><%= evento.getFecha()%></td>
                <td><%= evento.getDireccion()%></td>
                <td><%= evento.getCapacidad()%></td>
                <td><a href="eventoEliminar.jsp?cCodigo=<%= evento.getId_evento()%>">Borrar</a></td>
                <td><a href="eventoActualizar.jsp?cCodigo=<%= evento.getId_evento()%>">Actualizar</a></td>
            </tr>
            <%}%>
        </table>
        <a href="sExcel">Ver Reporte Excel</a><br/>
        <a href="sPdf">Ver ReportePDF</a><br/>
    </body>
</html>
<%} %>
