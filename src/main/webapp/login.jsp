<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<jsp:useBean id="userObj1" class="dto.UserBean"></jsp:useBean>
<jsp:useBean id="userDao1" class="dao.UserDaoImpl"></jsp:useBean>

<jsp:setProperty property="*" name="userObj1"/>

<%
String msg=userDao1.LoginUser(userObj1);
out.println(msg);
session.setAttribute("name", userObj1.getName());

if(msg.equals("Login Successfull"))
{
	RequestDispatcher dispatcher=request.getRequestDispatcher("welcome.jsp");
	dispatcher.forward(request, response);
}
else
{
	out.println("Sorry! Email or pasword error");
	RequestDispatcher dispatcher1=request.getRequestDispatcher("index.jsp");
	dispatcher1.include(request, response);
	
}

%>
</body>
</html>