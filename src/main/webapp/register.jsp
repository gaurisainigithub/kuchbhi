<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<jsp:useBean id="userObj" class="dto.UserBean"></jsp:useBean>
<jsp:useBean id="userDao" class="dao.UserDaoImpl"></jsp:useBean>
<jsp:setProperty property="*" name="userObj"/>

<%
String msg=userDao.registerUser(userObj);
out.println(msg);

if(msg.equalsIgnoreCase("Registration Successfull"))
{
	response.sendRedirect("index.jsp");
}
%>
</html>