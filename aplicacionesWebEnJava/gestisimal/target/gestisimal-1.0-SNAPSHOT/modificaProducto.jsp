<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>Gestisimal - JSP - ORM</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        <div class="container">
            <br><br>
            <div class="panel panel-info">
                <div class="panel-heading text-center">Modificacion de productos</div>
                <form method="get" action="grabarModificacion.jsp">
                    <br>
                    <div class="form-group"> 
                        <label>&nbsp;&nbsp;Código:&nbsp;</label><input type="text" size="5" name="codigo" value="<%= Integer.valueOf(request.getParameter("codigo")) %>" readonly>
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Descripción:&nbsp;</label><input type="text" size="35" name="descripcion" value="<%= request.getParameter("descripcion") %>">
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Precio de compra:&nbsp;</label><input type="text" size="5" name="precioCompra" value="<%= Double.valueOf(request.getParameter("precioCompra")) %>">
                        <label>&nbsp;&nbsp;Precio de venta:&nbsp;</label><input type="text" size="5" name="precioVenta" value="<%= Double.valueOf(request.getParameter("precioVenta")) %>">
                    </div>
                    <div class="form-group">
                        <label>&nbsp;&nbsp;Stock:&nbsp;</label><input type="text" name="stock" size="20" value="<%= Integer.valueOf(request.getParameter("stock")) %>">
                    </div>
                    <hr>
                    &nbsp;&nbsp;<a href="index.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>&nbsp;Cancelar</a>
                    <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span>&nbsp;Aceptar</button><br><br>
                </form>

            </div>
            <div class="text-center">&copy; DreamTeam - JSP - ORM</div>
            <br>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
