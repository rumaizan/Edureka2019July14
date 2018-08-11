package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/FC" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String reqType = request.getParameter("reqType");
		
		if(reqType.equals("login")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Awesome");
			dispatcher.forward(request, response);
		}
		
		if(reqType.equals("register")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterServlet");
			dispatcher.forward(request, response);
		}
		
		out.print("This is hello from FrontController");
	}

}
