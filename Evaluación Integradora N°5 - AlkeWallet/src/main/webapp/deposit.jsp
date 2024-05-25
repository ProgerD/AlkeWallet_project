<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Depositar Fondos</h2>
    <form action="AccountController" method="post">
        <input type="hidden" name="action" value="deposit">
        Monto: <input type="text" name="amount"><br>
        <input type="submit" value="Depositar">
    </form>
    <a href="AccountController">Volver</a>
</body>
</html>