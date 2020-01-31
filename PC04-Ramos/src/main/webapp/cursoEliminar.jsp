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
        Cliente cliente= servicio.buscar(request.getParameter("cCodigo"));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Clientes! ::::: </title>
    </head>
    <body>
        <h1>Ingrese datos del cliente a eliminar!</h1>
        <form action="cController">
            Id cliente:<input name="txtCodigo" value="<%= cliente.getIdcliente() %>" readonly="true"/><br/>
            Apellido:<input name="txtApellido"  value="<%= cliente.getApellido()%>" readonly="true"/><br/>
            Nombre:<input name="txtNombre"  value="<%= cliente.getNombre()%>" readonly="true"/><br/>
            Correo:<input name="txtCorreo"  value="<%= cliente.getCorreo()%>" readonly="true"/><br/>
            Telefono:<input name="txtTelefono"  value="<%= cliente.getTelefono()%>" readonly="true"/><br/>
            <input name="accion" type="hidden" value="eliminar"/><br/>
            <input type="submit" value="Eliminar"/>
        </form>
    </body>
</html>
<%} %>