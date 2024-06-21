<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Productos</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<h1>Listado de Productos</h1>

<h2>
<a href="RegistrarProductos.jsp">Registrar Productos</a>
</h2>

<table>
    <tr>
        <th>Codigo</th>
        <th>Nombre</th>
        <th>Precio Venta</th>
        <th>Precio Compra</th>
        <th>Estado</th>
        <th>Descripción</th>

    </tr>

    <%
        List<TblProductocl2> listadoproducto = (List<TblProductocl2>) request.getAttribute("listadoproducto");
        if (listadoproducto != null) {
            for (TblProductocl2 lis : listadoproducto) {
    %>
    <tr>
        <td><%= lis.getNombrecl2() %></td>
        <td><%= lis.getDescripcl2() %></td>
        <td><%= lis.getEstadocl2() %></td>
        <td><%= lis.getPreciocompcl2() %></td>
        <td><%= lis.getPreciocompcl2() %></td>
        <td><%= lis.getPrecioventacl2() %></td>

    </tr>
    <%
            }
        }
    %>

</table>

</body>
</html>
