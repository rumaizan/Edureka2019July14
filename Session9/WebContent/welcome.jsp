<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<center>
	<h3>Welcome, <%= session.getAttribute("keyName") %></h3>
	<h3>Its: <%= new Date() %></h3>
	
	<h3>Details:</h3>
	
	<%
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck: ckArr){
			out.print(ck.getName()+"   "+ck.getValue()+"<br/>");
		}*/
	
		out.print(session.getAttribute("keyEmail")+"<br/>");
		out.print(session.getAttribute("keyID")+"<br/>");
	%>
	
	</center>
</body>
</html>