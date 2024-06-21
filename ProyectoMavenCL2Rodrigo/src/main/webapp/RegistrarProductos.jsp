<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Productos</title>
<link rel="stylesheet" type="text/css" href="registrar.css">
</head>
<body>

<h1>Registrar Productos</h1>

<form action="ControladorProducto" method="post">
    <table>
        <tr>
            <td>Nombre</td>
            <td><input type="text" name="nombre"></td>
        </tr>
        <tr>
            <td>Precio Venta</td>
            <td><input type="text" name="precioventa"></td>
        </tr>
        <tr>
            <td>Precio Compra</td>
            <td><input type="text" name="preciocompra"></td>
        </tr>
        <tr>
            <td>Estado</td>
            <td><input type="text" name="estado"></td>
        </tr>
        <tr>
            <td>Descripcion</td>
            <td><input type="text" name="descripcion"></td>
        </tr>
       
        <tr>
            <td colspan="2" style="text-align:center">
                <input type="submit" value="Registrar">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
