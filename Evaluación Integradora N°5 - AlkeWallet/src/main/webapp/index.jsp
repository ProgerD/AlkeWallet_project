<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Saldo disponible: ${balance}</h2>
    <a href="AccountController?action=deposit">Depositar fondos</a><br>
    <a href="AccountController?action=withdraw">Retirar fondos</a>
</body>

</html>