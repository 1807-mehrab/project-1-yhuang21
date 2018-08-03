package com.revature.hotel_reservation.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.hotel_reservation.dao.User_account_dao;
import com.revature.hotel_reservation.model.User_account;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//System.out.println(request.getParameter("Email"));
		//System.out.println(request.getParameter("Password"));
		//response.sendRedirect("/hotel_reservation/user_lobby.html");
		User_account_dao uad=new User_account_dao();
		User_account account= uad.getAccount(request.getParameter("Email"));
		PrintWriter pw=response.getWriter();
		if(account!=null&&account.getPassword().equals(request.getParameter("Password"))) {
	        HttpSession session=request.getSession();  
	        session.setAttribute("email", request.getParameter("Email"));
			response.sendRedirect("/hotel_reservation/user_lobby.html");
		}else {
			pw.println("Email and password don't match");
		}

		pw.close();
		
		/*
		for(User_account u:uad.getAllAccounts()) {
			pw.println(u.toString());
		}
		pw.close();
		*/
	
	}

}
