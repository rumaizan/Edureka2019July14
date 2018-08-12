<%@ page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	
	<h3>Logging in.. ${param.txtEmail} </h3>
	
	<%
		// Business Logic for Login:
			
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		user = helper.loginUser(user);
		helper.closeConnection();
		
		if(user.name!=null && !user.name.isEmpty()){
	%>
		<h3>Welcome <%= user.name %></h3>
		<a href="welcome.jsp">Enter Home</a>
		<jsp:forward page="welcome.jsp"/>
	<%		
		// Session Tracking:
		/*Cookie ck1 = new Cookie("keyName",user.name);
		Cookie ck2 = new Cookie("keyEmail",user.email);
		Cookie ck3 = new Cookie("keyID",String.valueOf(user.uid));
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);*/
		
		session.setAttribute("keyName", user.name);
		session.setAttribute("keyEmail",user.email);
		session.setAttribute("keyID",user.uid);
		
		// Like session but manages data on multiple scopes 
		pageContext.setAttribute("keyName", user.name, PageContext.SESSION_SCOPE);
		
		//pageContext.getAttribute("keyName");
		
		// HW: >>>>>> Try URL Re-Writing and HiddenFormFields <<<<<
		
	
		}else{
	%>
		<h3>Invalid Credentials!! Try Again !!</h3>
	<%
			response.sendRedirect("https://www.google.co.in");
		}
	%>

</body>
</html>