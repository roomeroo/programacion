<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="import java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>DreamTeam - JSP - ORM</title>
    </head>

    <body>
        <div class="container">
            <br><br>			
            <div class="panel panel-primary">
                <div class="panel-heading text-center"><h2>Club de Baloncesto</h2></div>
                <%
                    //Configuración de la conexión a la base de datos
                    String url = "jdbc:mariadb://localhost:3306/baloncesto";
                    String user = "root";
                    String password = "";
                    //Instanciar ConnectionPool y GestorSocios
                    ConnectionPool conexiones = new ConnectionPool(url, user, password);
                    GestorSocios gestor = new GestorSocios(conexiones.getConnection());
                    //Declarar un ArrayList de Socio e inicializarlo a null
                    ArrayList<Socio> clientes = null;
                    //Realizar consulta a través del gestor (try-catch) y comprobar resultado (error si la lista está vacía)
                    try {
                        clientes = gestor.requestAll("nombre DESC");
                        if (clientes.isEmpty()) {
                            throw new Exception("Error, lista vacía");
                        } else {
                %>
                <table class="table table-striped">
                    <tr><th>Nº de socio</th><th>Nombre</th><th>Estatura</th><th>Edad</th><th>Localidad</th><th></th><th></th></tr>
                    <form method="get" action="grabaSocio.jsp">
                        <tr><td><input type="text" name="socioID" size="5"></td>
                            <td><input type="text" name="nombre" size="30"></td>
                            <td><input type="text" name="estatura" size="5"></td>
                            <td><input type="text" name="edad" size="5"></td>
                            <td><input type="text" name="localidad" size="20"></td>
                            <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
                    </form>
                    <%
                        //Si la lista no está vacía, recorrerla e imprimir sus elementos en filas de la tabla
                        for (Socio socio : clientes) {
               
                            int socioID = socio.getId();
                            String nombre = socio.getNombre();
                            double estatura = socio.getEstatura();
                            int edad = socio.getEdad();
                            String localidad = socio.getLocalidad();
                            out.println("<tr>" + "<td>" + socioID + "</td>" + "<td>" + nombre + "</td>" + "<td>" + estatura + "</td>" + "<td>" + edad + "</td>" + "<td>" + localidad + "</td>");
                    %>
                        <!-- Introducir los datos de cada socio al formulario asociado al botón modificar.-->
                    <td>
                        <form method="get" action="modificaSocio.jsp">
                            <input type="hidden" name="socioID" value="<%= socioID%>">
                            <input type="hidden" name="nombre" value="<%= nombre%>"> 
                            <input type="hidden" name="estatura" value="<%= estatura%>">
                            <input type="hidden" name="edad" value="<%= edad%>">
                            <input type="hidden" name="localidad" value="<%= localidad%>">
                            <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
                        </form>
                    </td>
                    <td>
                        <!-- Introducir el ID de cada socio al formulario asociado al botón eliminar.  -->
                        <form method="get" action="borraSocio.jsp">
                               <input type="hidden" name="socioID" value="<%= socioID%>"/>
                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
                        </form>
                    </td></tr>
                    <%//Cerrar bucle, cerrar else, bloque catch, cerrar conexiones del pool
                            }//cerrar bucle
                        }//Cerrar else
                    } catch (Exception ex) {
                    %><div style="color:red"><%
                            out.println(ex.getMessage());
                        %></div><%
                            } finally {
                                conexiones.closeAll();
                            }
                        %>

                </table>
            </div>
            <div class="text-center">&copy; DreamTeam - JSP - ORM</div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>