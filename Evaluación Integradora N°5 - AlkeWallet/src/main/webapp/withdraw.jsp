<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Retirar Fondos</h2>
    <form action="AccountController" method="post">
        <input type="hidden" name="action" value="withdraw">
        Monto: <input type="text" name="amount"><br>
        <input type="submit" value="Retirar">
    </form>
    <a href="AccountController">Volver</a>
</body>
</html>