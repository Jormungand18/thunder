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
        
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Eventos! ::::: <%= adm.getLogin() %></title>
    </head>
    <body>
        <h1>Ingrese datos de un nuevo Evento!</h1>
        <form action="cController">
            Id:<input name="txtId"/><br/>
            Nombre:<input name="txtNombre"/><br/>
            Fehca:<input name="txtFecha"/><br/>
            Direccion:<input name="txtDireccion"/><br/>
            Capacidad:<input name="txtCapacidad"/><br/>
            <input name="accion" type="hidden" value="insertar"/><br/>
            <input type="submit" value="Insertar"/>
        </form>
    </body>
</html>
<%} %>