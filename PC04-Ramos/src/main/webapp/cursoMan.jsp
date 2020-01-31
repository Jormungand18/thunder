<%-- 
    Document   : cursoMan
    Created on : 24/09/2017, 08:10:08 AM
    Author     : emaravi
--%>
<%@page import="cjava.beans.Cliente"%>
<%@page import="cjava.service.impl.ClienteServiceImpl"%>
<%@page import="cjava.service.ClienteService"%>

<%@page import="java.util.List"%>

<%
    // scriplet de java
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("usuario")==null){
        response.sendRedirect("errorIngreso.jsp");
    }else{
       
        ClienteService servicio = new ClienteServiceImpl();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/EstiloCRUD.css" rel="stylesheet" type="text/css"/>
        <title>Mantenimiento de Clientes! </title>
    </head>
    <body>
        <h1>Mantenimiento de Clientes!</h1>
        <a class="btn btn-crud" href="cursoInsertar.jsp">Nuevo Cliente</a>
            <table>
            <tr>
                <th>id</th>
                <th>apellido</th>
                <th>nombre</th>
                <th>correo</th>
                <th>telefono</th>
                <th colspan="2">operaciones</th>
            </tr>
            <%for(Cliente cliente: servicio.listar()){%>
            <tr>
                <td><%= cliente.getIdcliente() %></td>
                <td><%= cliente.getApellido()%></td>
                <td><%= cliente.getNombre() %></td>
                <td><%= cliente.getCorreo() %></td>
                <td><%= cliente.getTelefono() %></td>
                <td><a href="cursoEliminar.jsp?cCodigo=<%= cliente.getIdcliente() %>" class="btn btn-crud">Borrar</a></td>
                <td><a href="cursoActualizar.jsp?cCodigo=<%= cliente.getIdcliente() %>" class="btn btn-crud">Actualizar</a></td>
            </tr>
            <%}%>
        </table>
        <a class="btn btn-crud" href="sPie">Ver Grafico de PIE</a><br/>
        <a class="btn btn-crud" href="sExcel">Ver Reporte Excel</a><br/>
        <a class="btn btn-crud" href="sPDF">Ver ReportePDF</a><br/>
    </body>
</html>
<%} %>
