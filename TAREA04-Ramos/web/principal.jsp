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
        <title>Mantenimiento de Eventos</title>
    </head>
    <body>
        <h1>Felicitaciones ya ingresaste: 
            <%= adm.getLogin()%>!</h1>
        
        <a href="cursoMan.jsp">Mantenimiento de Eventos</a>
        <br/>
        <a href="cursoMan.jsp">Mantenimiento de administradores</a>
        <br/>
        <br/>

    </body>
</html>
<%} %>
