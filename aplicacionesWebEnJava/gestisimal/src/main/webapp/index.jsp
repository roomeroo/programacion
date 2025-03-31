<%@page import="pool.ConnectionPool"%>
<%@page import="productos.GestorInventario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="productos.Producto"%>
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
                <div class="panel-heading text-center"><h2>Gestisimal</h2></div>
                <%
                    //Configuración de la conexión a la base de datos
                    String url = "jdbc:mariadb://localhost:3306/gestisimal";
                    String user = "root";
                    String password = "";
                    //Instanciar ConnectionPool y GestorInventario
                    ConnectionPool conexiones = new ConnectionPool(url, user, password);
                    GestorInventario gestor = new GestorInventario(conexiones.getConnection());
                    //Declarar un ArrayList de productos e inicializarlo a null
                    ArrayList<Producto> productos = null;
                    //Realizar consulta a través del gestor (try-catch) y comprobar resultado (error si la lista está vacía)
                    try {
                        productos = gestor.requestAll("codigo ASC");
                        if (productos.isEmpty()) {
                            throw new Exception("Error, lista vacía");
                        } else {
                %>
                <table class="table table-striped">
                    <tr><th>código</th><th>descripción</th><th>precio de compra</th><th>precio de venta</th><th>stock</th><th></th><th></th></tr>
                    <form method="get" action="grabarProducto.jsp">
                        <tr><td><input type="text" name="codigo" size="5"></td>
                            <td><input type="text" name="descripcion" size="30"></td>
                            <td><input type="text" name="precioCompra" size="5"></td>
                            <td><input type="text" name="precioVenta" size="5"></td>
                            <td><input type="text" name="stock" size="20"></td>
                            <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
                    </form>
                    <%
                        //Si la lista no está vacía, recorrerla e imprimir sus elementos en filas de la tabla
                        for (Producto producto : productos) {
               
                            Long codigo = producto.getCodigo();
                            String descripcion = producto.getDescripcion();
                            double precioCompra = producto.getPrecioCompra();
                            double precioVenta = producto.getPrecioVenta();
                            int stock = producto.getStock();
                            out.println("<tr>" + "<td>" + codigo + "</td>" + "<td>" + descripcion + "</td>" + "<td>" + precioCompra + "</td>" + "<td>" + precioVenta + "</td>" + "<td>" + stock + "</td>");
                    %>
                        <!-- Introducir los datos de cada socio al formulario asociado al botón modificar.-->
                    <td>
                        <form method="get" action="modificaProducto.jsp">
                            <input type="hidden" name="codigo" value="<%= codigo%>">
                            <input type="hidden" name="descripcion" value="<%= descripcion%>"> 
                            <input type="hidden" name="precioCompra" value="<%= precioCompra%>">
                            <input type="hidden" name="precioVenta" value="<%= precioVenta%>">
                            <input type="hidden" name="stock" value="<%= stock%>">
                            <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Modificar</button>
                        </form>
                    </td>
                    <td>
                        <!-- Introducir el ID de cada socio al formulario asociado al botón eliminar.  -->
                        <form method="get" action="borrar.jsp">
                            <input type="hidden" name="codigo" value="<%= codigo%>"/>
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
        <!--jQuery (necessary for Bootstrap's JavaScript plugins)-->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>