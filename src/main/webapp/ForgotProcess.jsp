<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<jsp:useBean id="objects1" class="dto.UserBean"></jsp:useBean>
<jsp:useBean id="dao" class="dao.UserDaoImpl"></jsp:useBean>
<jsp:setProperty property="*" name="objects1"/>

<%
String msg=dao.ForgotPass(objects1);
out.println(msg);

%>
</html>