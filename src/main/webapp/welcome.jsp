<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body bgcolor='cyan'>
<h1>Welcome Page</h1>
<form>

<%

String name=(String)session.getAttribute("name");
out.println("Welcome to home, "+name);

%>



</form>
</body>
</html>