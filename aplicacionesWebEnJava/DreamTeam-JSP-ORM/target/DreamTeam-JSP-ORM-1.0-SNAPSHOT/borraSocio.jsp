<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            // Configuración de la conexión a la base de datos
            String url = "jdbc:mariadb://localhost:3306/baloncesto";
            String user = "root";
            String password = "";
            // Instanciar ConnectionPool y GestorSocios
            ConnectionPool conexiones = new ConnectionPool(url, user, password);
            Connection conexion = conexiones.getConnection();
            GestorSocios gestor = new GestorSocios(conexion);
            // Establecer la codificación de caracteres de la petición a UTF-8
            request.setCharacterEncoding("UTF-8");
            // Realizar borrado a través del gestor (try-catch) y comprobar resultado (si verdadero, mostrar mensaje de éxito)
            try{
            out.println("<div>" + request.getParameter("socioID") + "</div>");
            if(gestor.delete(Integer.valueOf(request.getParameter("socioID"))))
                out.println("¡Funciona!");
            else
                throw new Exception("No ha sido creado.");
            }catch(Exception ex){
                out.println("<div>" + ex.getMessage() + "</div>");
            }
            // Cerrar las conexiones del pool                  
            conexiones.closeAll();
        %>
        <script>document.location = "index.jsp"</script>
    </body>
</html>
