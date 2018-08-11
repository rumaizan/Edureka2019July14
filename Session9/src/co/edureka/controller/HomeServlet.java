package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Sending Back the Response to the Client by Servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		
		out.print("<html><body><center><br/><br/>");
		out.print("<h3>Welcome !!</h3>");
		out.print("<h3>Today is: "+date+"</h3>");
		
		// Read all the cookies associated with our app
		// Read as key value pair
		/*Cookie[] ckArr = request.getCookies();
		
		out.print("<h3>Details:</h3>");
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		//Read data from URL
		/*String name = request.getParameter("keyName");
		String email = request.getParameter("keyEmail");
		String id = request.getParameter("keyID");
		
		out.print("<h3>Details:</h3>");
		out.print(name+"<br/>"+email+"<br/>"+id);*/
		
		//Read from Hidden Form Fields
		/*String name = request.getParameter("keyName");
		String email = request.getParameter("keyEmail");
		String id = request.getParameter("keyID");
		
		out.print("<h3>Details:</h3>");
		out.print(name+"<br/>"+email+"<br/>"+id);*/
		
		//Read from HttpSession API
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		String email = (String)session.getAttribute("keyEmail");
		int id = (int)session.getAttribute("keyID");
		
		out.print("<h3>Details:</h3>");
		out.print(name+"<br/>"+email+"<br/>"+id);
		
		
		out.print("</center></body></html>");
	}

}
