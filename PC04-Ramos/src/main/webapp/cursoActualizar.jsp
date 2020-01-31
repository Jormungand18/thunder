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
        Cliente cliente = servicio.buscar(request.getParameter("cCodigo"));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Clientes! </title>
    </head>
    <body>
        <h1>Ingrese datos de cliente a actualizar!</h1>
        <form action="cController">
            Id cliente:<input name="txtCodigo" value="<%= cliente.getIdcliente() %>" readonly="true"/><br/>
            Apellido:<input name="txtApellido"  value="<%= cliente.getApellido()%>" /><br/>
            Nombre:<input name="txtNombre"  value="<%= cliente.getNombre()%>" /><br/>
            Correo:<input name="txtCorreo"  value="<%= cliente.getCorreo()%>" /><br/>
            Telefono:<input name="txtTelefono"  value="<%= cliente.getTelefono()%>" /><br/>
            <input name="accion" type="hidden" value="actualizar"/><br/>
            <input type="submit" value="Actualizar"/>
        </form>
    </body>
</html>
<%} %>