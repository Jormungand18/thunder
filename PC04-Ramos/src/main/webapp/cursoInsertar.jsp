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
        
        
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de Clientes! ::</title>
    </head>
    <body>
        <h1>Ingrese datos de un nuevo Cliente!</h1>
        <form action="cController">
            Codigo:<input name="txtCodigo"/><br/>
            Apellido:<input name="txtApellido"/><br/>
            Nombre<input name="txtNombre"/><br/>
            Correo<input name="txtCorreo"/><br/>
            Telefono<input name="txtTelefono"/><br/>
            <input name="accion" type="hidden" value="insertar"/><br/>
            <input type="submit" value="Insertar"/>
        </form>
    </body>
</html>
<%} %>