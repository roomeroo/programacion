<%@page import="pool.ConnectionPool"%>
<%@page import="productos.Producto"%>
<%@page import="productos.GestorInventario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <%
            //  Configuración de la conexión a la base de datos
            String url = "jdbc:mariadb://localhost:3306/gestisimal";
            String user = "root";
            String passwd = "";
            //  Instanciar ConnectionPool y GestorSocios
            ConnectionPool conexiones = new ConnectionPool(url, user, passwd);
            GestorInventario gestor = new GestorInventario(conexiones.getConnection());
            // Establecer la codificación de caracteres de la petición a UTF-8
            request.setCharacterEncoding("UTF-8");
            //  Modificar socio a través del gestor (esta operación puede generar excepciones que hay que controlar)
            try{
                int codigo = Integer.valueOf(request.getParameter("codigo"));
                String descripcion = request.getParameter("descripcion");
                double precioCompra = Double.valueOf(request.getParameter("precioCompra"));
                double precioVenta = Double.valueOf(request.getParameter("precioVenta"));
                int stock = Integer.valueOf(request.getParameter("stock"));
                Producto producto = new Producto (codigo, descripcion, precioCompra, precioVenta, stock);
                if(gestor.update(producto)){
                    out.println("Producto actualizado");
                }else throw new Exception("Producto no actualziado");
            }catch(Exception ex){
                out.println(ex.getMessage()); 
            }finally{
                conexiones.closeAll();
            }
            // TODO: Comprobar el resultado anterior y, si verdadero, mostrar mensaje de éxito
            
            // TODO: Cerrar las conexiones del pool  
            
        %>
        <br>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;Página principal</a>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>