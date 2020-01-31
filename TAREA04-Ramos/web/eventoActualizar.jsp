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
        Evento evento = servicio.buscar(request.getParameter("cCodigo"));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Cursos! ::::: <%= adm.getLogin()%></title>
    </head>
    <body>
        <h1>Ingrese datos de curso a actualizar!</h1>
        <form action="cController">
            ID:<input name="txtId" value="<%= evento.getId_evento()%>" readonly="true" /><br/>
            Nombre:<input name="txtNombre"  value="<%= evento.getNombre()%>" readonly="true"/><br/>
            Fecha:<input name="txtFecha"  value="<%= evento.getFecha()%>" readonly="true"/><br/>
            Direccion:<input name="txtDireccion"  value="<%= evento.getDireccion()%>" readonly="true"/><br/>
            Capacidad:<input name="txtCapacidad"  value="<%= evento.getCapacidad()%>" readonly="true"/><br/>
            <input name="accion" type="hidden" value="actualizar"/><br/>
            <input type="submit" value="actualizar"/>
        </form>
    </body>
</html>
<%} %>