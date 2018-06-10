package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet of LoginServlet");
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
			// Creating an object to say that we need to go to another page
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost of LoginServlet");
		response.sendRedirect("home"); // put in the url-mapping // this ALLOWS for bookmarking
		//request.getRequestDispatcher("home.html").forward(request, response); // this doesn't allow for bookmarking
		
	}

}
