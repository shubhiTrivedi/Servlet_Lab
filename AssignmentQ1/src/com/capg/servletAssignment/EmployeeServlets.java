package com.capg.servletAssignment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employee")
public class EmployeeServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 int id=Integer.parseInt(request.getParameter("empId"));
	 String name =request.getParameter("empName");
	 int salary=Integer.parseInt(request.getParameter("empSal"));
	 String address[] = request.getParameterValues("addr");
	 
	 
	 
	 RequestDispatcher dispatcher=request.getRequestDispatcher("ShowDetailsServlet");
	 request.setAttribute("arg1", id);
	 request.setAttribute("arg2", name);
	 request.setAttribute("arg3", salary);
	 request.setAttribute("arg4", address);
	 
	 
	 dispatcher.forward(request, response);

	}

}
