<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>   
<%@ page isThreadSafe="true" %>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	
	<h3>JSP Demo</h3>
	
	<h3>Scriptlet Tag</h3>
	
	<%-- <h3>b is: <% out.print(b); %></h3> --%>
	
	<h3>pi is: <% out.print(pi); %></h3>
	
	<% 
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		// out points to PrintWriter Object(Implicit Object) available in JSP Page. we need not to create it !!
		out.print("<h4>c is: "+c+"</h4");
	%>
	
	<h3>a is: <% out.print(a); %></h3>
	
	<h3>Declarative Tag</h3>
	<%!
		double pi = 3.14;
		double area(double radius){
			return pi*radius*radius;
		}
	%>
	
	<h3>Area of Circle with radius 3.35 is <% out.print(area(3.35)); %></h3>
	
	<h3>Expression Tag</h3>
	
	<h3>Area of Circle with radius 5.17 is <%= area(5.17) %></h3>
	
	<%
		int[] arr = {10,20,30,40,50};
		out.print("arr[0] is:"+arr[0]); // Traditionally write instruction in a try catch
	%>
	
	<jsp:include page="header.jsp"/>
	
	<%
		User uRef1 = new User();
		uRef1.uid = 101;
		uRef1.name = "Sia";
		uRef1.setEmail("sia@example.com");				
	%>
	
	<h3>uRef1 Details</h3>
	Name: <%= uRef1.getName() %>
	Email:<%= uRef1.email %>
	
	<jsp:useBean id="uRef2" class="co.edureka.model.User"/>
	<jsp:setProperty property="name" name="uRef2" value="Kim"/>
	<jsp:setProperty property="email" name="uRef2" value="kim@example.com"/>
	
	<h3>uRef2 Details</h3>
	Name: <jsp:getProperty property="name" name="uRef2"/>
	Email:<jsp:getProperty property="email" name="uRef2"/>
	
	<%
		for(int i=1;i<=10;i++){
			out.print("<h3>"+i+"</h3>");
		}
	%>
	
	<c:forEach var="i" begin="1" end="10">
		<h4><c:out value="${i}"/></h4>
	</c:forEach>
	
	<c:set var="age" value="20"/>
	<h3>Age is <c:out value="${age}"/> </h3>
	
</body>
</html>