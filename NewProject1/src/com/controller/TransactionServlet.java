package com.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.Jdbc;

/**
 * Servlet implementation class TransactionServlet
 */
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*String s1=request.getParameter("balance");
	
		
		int amount=Integer.parseInt(s1);
		Jdbc db=new Jdbc();
		
        boolean flag=db.deposit(amount,uno);
		
		if(flag==true) {
			response.sendRedirect("Login.jsp");
		}
		else
		{
			response.sendRedirect("Transaction.jsp");

		}
		
	}*/
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("balance");
		String s2 = request.getParameter("uno");
		int rno = Integer.parseInt(s2);
		int amount=Integer.parseInt(s1);
		Jdbc db=new Jdbc();
		
        int flag=db.deposit(amount,rno);
		
		if(flag>0) {
			response.sendRedirect("Login.jsp");
		}
		else
		{
			response.sendRedirect("CompleteTransaction.jsp");

		}}

}
