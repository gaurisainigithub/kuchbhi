<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ChangePass</title>
</head>
<h1>Change Password</h1>
<body bgcolor='yellow'>

<form action="ChangePassword.jsp">

Enter oldPassword:<input type='password' name='oldpass' placeholder='Enter oldPassword' required='required'>
<br>
<br>

Enter NewPassword:<input type='password' name='newpass' placeholder='Enter NewPassword' required='required'>
<br>
<br>

ConfirmPasword:<input type='password' name='confirmpass' placeholder='Confirm Password' required="required">
<br>
<br>


<input type='submit' value='update'>


</form>
</body>
</html>