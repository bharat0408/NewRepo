package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Jdbc;

import com.model.Registration;


/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("saveserv1");
		String s1=request.getParameter("uno");
		String s2=request.getParameter("name");
		
		String s3=request.getParameter("email");
		String s4=request.getParameter("pass");
		double s5=Double.parseDouble(request.getParameter("balance"));
		
		System.out.println("saveserv2");
		

		Registration r=new Registration();
		System.out.println("saveserv3");
		r.setUno(s1);
		r.setName(s2);
		r.setEmail(s3);
		r.setPass(s4);
		r.setBalance(s5);
		System.out.println("saveserv4");
		
		Jdbc db=new Jdbc();
		List<Registration> lst=new LinkedList<Registration>();
		lst.add(r);
		System.out.println("test1");
		int i=db.saveData(lst);
		System.out.println("test2 iw value"+i);
		if(i>0)
		{
			System.out.println("test3");
			response.sendRedirect("Login.jsp");
		}
		System.out.println("test4");
		}
	
	}


