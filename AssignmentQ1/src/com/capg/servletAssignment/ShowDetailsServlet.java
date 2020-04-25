package com.capg.servletAssignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowDetailsServlet")
public class ShowDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=(Integer) request.getAttribute("arg1");
		String name=(String) request.getAttribute("arg2");
		int sal=(Integer) request.getAttribute("arg3");
		String[] a= (String[]) request.getAttribute("arg4");
		
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher dispatcher=request.getRequestDispatcher("EDetails.html");
		
		dispatcher.include(request, response);
		
		
		out.println("<p> EmpId is:"+id+"</p>");
		out.println("<p> EmpName is:"+name+"</p>");
		out.println("<p> EmpSal is:"+sal+"</p>");
		StringBuffer temp = new StringBuffer();
		
	    for(String str : a)
	    {
	      temp.append(str + " ");
	    }    
		out.println("<p> Address:"+"</p>");
		out.println("<p>" +temp+"</p>");
		
		
		
		
		out.close();
	}

}
