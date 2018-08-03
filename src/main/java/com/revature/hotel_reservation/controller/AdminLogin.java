package com.revature.hotel_reservation.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.hotel_reservation.dao.Admin_account_dao;
import com.revature.hotel_reservation.model.Admin_account;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
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
		Admin_account_dao uad=new Admin_account_dao();
		Admin_account account= uad.getAccount(request.getParameter("Email"));
		PrintWriter pw=response.getWriter();
		if(account!=null&&account.getPassword().equals(request.getParameter("Password"))) {
			response.sendRedirect("/hotel_reservation/admin_lobby.html");
		}else {
			pw.println("Email and password don't match");
		}

		pw.close();
	}

}
