package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("==init executed==");
	}

	
	public void destroy() {
		System.out.println("==destroy executed==");
	}

	// service is executed in the Servlet if for any request method ( get, post delete or any other )
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==service executed==");
		
		// Extract the data from Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
				
		// Save the User Object in DB
		// We have to create a table in DB and use JDBC
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		// Sending Back the Response to the Client by Servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><center><br/><br/>");
		
		if(i>0){
			out.print("<h3>Welcome, "+user.name+" !! You are Registered with us !!</h3>");
		}else{
			out.print("<h3>Sorry, "+user.name+" !! Your registration failed. Try Again !!</h3>");
		}
		
		out.print("</center></body></html>");
	}

}
