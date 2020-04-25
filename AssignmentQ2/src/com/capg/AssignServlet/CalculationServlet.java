package com.capg.AssignServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculationServlet")
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op1=Integer.parseInt(request.getParameter("op1"));
		int op2=Integer.parseInt(request.getParameter("op2"));
		
		
		String opr=request.getParameter("opr");
		//String sub=request.getParameter("sub");
		//String mul=request.getParameter("mul");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("MulServlet");
		
		request.setAttribute("arg1", op1);
		request.setAttribute("arg2", op2);
		
		request.setAttribute("arg3", opr);
		//request.setAttribute("sub", sub);
		//request.setAttribute("mul", mul);
		
		
		
		dispatcher.forward(request, response);
		
		
	}

}
