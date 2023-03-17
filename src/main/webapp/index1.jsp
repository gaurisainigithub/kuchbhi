<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<h1>My Register Page</h1>
<body bgcolor='pink'>

<form action='register.jsp'>
Name:<input type='text' name='name' placeholder='Enter Name' required="required">
<br>
<br>

Email:<input type='email' name='email' placeholder='Enter Email' required='required'>
<br>
<br>

Mobile:<input type='tel' name='mobile' placeholder='Enter Mobile' required='required'>
<br>
<br>

Password:<input type='password' name='pass' placeholder='Enter pass' required="required">
<br>
<br>

<input type='submit' value='Register'>


</form>

</body>
</html>