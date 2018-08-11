package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Awesome" })
public class LoginServlet extends HttpServlet {
	
	// doPost is executed in the Servlet if client send request using post method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				// Extract the data from Request
				User user = new User();
				user.email = request.getParameter("txtEmail");
				user.password = request.getParameter("txtPassword");
						
				// Save the User Object in DB
				// We have to create a table in DB and use JDBC
				JDBCHelper helper = new JDBCHelper();
				helper.createConnection();
				user = helper.loginUser(user);
				helper.closeConnection();
				
				// Sending Back the Response to the Client by Servlet
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.print("<html><body><center><br/><br/>");
				
				if(user.name!=null && !user.name.isEmpty()){
					out.print("<h3>Welcome, "+user.name+" !!<br/> Details:<br/>UID: "+user.uid+"<br/>Email: "+user.email+"</h3>");
					/*out.print("<br/><a href='Welcome'>Enter Home</a>");
					
					//1. Session Tracking : Cookies - Key Value Pair, stored in the browser of client's machine
					// data is saved and can be read by any Servlet any time
					// cookies can have a lifetime
					Cookie ck1 = new Cookie("keyName", user.name);
					Cookie ck2 = new Cookie("keyEmail", user.email);
					Cookie ck3 = new Cookie("keyID", String.valueOf(user.uid));
					//ck1.setMaxAge();
					
					response.addCookie(ck1);
					response.addCookie(ck2);
					response.addCookie(ck3);*/
					
					//2. Session Tracking : URL ReWriting (Query String)
					// data is not saved anywhere, its is forwarded from S1 to S2 in the URL itself
					//out.print("<br/><a href='Welcome?keyName="+user.name+"&keyEmail="+user.email+"&keyID="+user.uid+"'>Enter Home</a>");
					
					//3. Session Tracking : Hidden Form Fields (HTML Form with data in hidden fields)	
					/*String form = "<form action='Welcome' method='post'>"
							+ "<input type='hidden' name='keyName' value='"+user.name+"'/>"
							+ "<input type='hidden' name='keyEmail' value='"+user.email+"'/>"
							+ "<input type='hidden' name='keyID' value='"+user.uid+"'/>"
							+ "<input type='submit'value='Enter Home'/>"
							+ "</form>";
					
					out.print(form);*/
					
					//4. HttpSession API
					//A new Session object is created by Server when client is in interaction with Server
					
					HttpSession session = request.getSession();
					session.setAttribute("keyName", user.name);
					session.setAttribute("keyEmail", user.email);
					session.setAttribute("keyID", user.uid);
					
					//session.getId()
					//session.invalidate(); Remove all the data stored in session object
					
					out.print("<br/><a href='Welcome'>Enter Home</a>");
					
				}else{
					out.print("<h3>Sorry, Your Login Failed !!</h3>");
					response.sendRedirect("https://google.co.in");
				}
				
				out.print("</center></body></html>");
		
	}

}
