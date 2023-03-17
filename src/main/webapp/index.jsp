<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<h1>My Login page</h1>
<body bgcolor='lightgreen'>
<form action='login.jsp'>

Email:<input type='email' name='email' placeholder='Enter Email' required="required">
<br>
<br>

Password:<input type='password' name='pass' placeholder='Enter password' required='required'>
<br>
<br>

<input type='submit' value='Login'>
<br>
<br>


<a href='index1.jsp'>Sign up</a>
&nbsp;
&nbsp;
<a href='index2.jsp'>ChangePass?</a>
<br>
<br>

<a href='forgot.jsp'>Forgot?</a>

</form>
</body>
</html>