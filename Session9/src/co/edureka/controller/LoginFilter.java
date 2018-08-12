package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

  
	public void destroy() {
		System.out.println("==LoginFilter destroy==");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// Sending Back the Response to the Client by Servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h4>==LoginFilter Pre-Processing==</h4>");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		
		// Validating the data
		if( email.isEmpty() || password.isEmpty()){
			out.print("<h3>Please Enter Details First</h3>");
		}else{
			// pass the request along the filter chain
			chain.doFilter(request, response); // >>>> Forward Request and Response to Servlet
		}
		
	
		out.print("<h4>==LoginFilter Post-Processing==</h4>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("==LoginFilter init==");
	}

}
