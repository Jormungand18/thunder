

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/EstiloLogin.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
        <body>
            <div class="contenedor">
               <div class="form">
                   <form class="login-form" method="POST" action="sValidador">
                       <input type="text"  name="txtUsuario" placeholder="username"  required=""/>
                       <input type="password" name="txtPassword" placeholder="password" required=""/>
                   <button>login</button>
                   <p class="message">No Tienes Cuenta?.... <a href="RegNoHabilitado.jsp">Registrarse</a></p>
                    </form>
                </div>
                
             </div>
        </body>
</html>
