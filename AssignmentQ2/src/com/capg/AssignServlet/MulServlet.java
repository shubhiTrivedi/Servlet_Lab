package com.capg.AssignServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MulServlet")
public class MulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op1=(Integer) request.getAttribute("arg1");
		int op2=(Integer) request.getAttribute("arg2");
		
		String operator=(String) request.getAttribute("arg3");
		//String sub=(String) request.getAttribute("sub");
		//String mul=(String) request.getAttribute("mul");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Addition.html");
		
		
		if(operator.equals("Add")) {
		out.println("<p> Addition is:"+(op1+op2)+"</p>");}
		if(operator.equals("Sub")) {
		
		out.println("<p> Subtraction is:"+(op1-op2)+"</p>");}
		if(operator.equals("Mul")) {
		
		out.println("<p> Multiplication is:"+(op1*op2)+"</p>");}
		
		dispatcher.include(request, response);
		
		out.close();
		
	}

}
