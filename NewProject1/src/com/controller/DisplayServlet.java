package com.controller;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Jdbc;
import com.model.Login;
import com.model.Registration;


@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LinkedList<Registration> lst=new LinkedList<Registration>();
		Jdbc uj =new Jdbc();
		lst=(LinkedList<Registration>) uj.displayAllData();
		
		PrintWriter out=response.getWriter();
		out.print("<table border='1px'><tr><th>Uno</th><th>Name</th><th>Email</th><th>Password</th><th>Balance</th></tr>");
		Iterator<Registration> it=lst.iterator();
		Registration u=new Registration();
		
		if(it.hasNext())
		{
			while(it.hasNext())
			{   
				u=it.next();

				out.println("<tr>"
						+ "<td>"+u.getUno()+"</td>"
								+ "<td>"+u.getName()+"</td>"
										+ "<td>"+u.getEmail()+"</td>"
												+ "<td>"+u.getPass()+"</td>"
														+ "<td>"+u.getBalance()+"</td>"
																+ "</tr>");
			}
		}
				
		out.println("</table>");
		
		response.setHeader("Refresh", "5; URL=http://localhost:9090/Login.jsp");

		
		//response.sendRedirect("display.jsp");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
