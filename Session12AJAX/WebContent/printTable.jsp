<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String number = request.getParameter("number");	

	try{
		
		int num = Integer.parseInt(number);
		
		for(int i=1;i<=10;i++){
			out.print("<b>"+num+" "+i+"'s are "+(num*i)+"</b><br/>");
		}
		
	}catch(Exception e){
		out.print("<b>Enter a Valid Number</b>");
	}

%>