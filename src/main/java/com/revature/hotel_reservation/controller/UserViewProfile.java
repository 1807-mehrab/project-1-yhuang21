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
 * Servlet implementation class UserViewProfile
 */
public class UserViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserViewProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out=response.getWriter();  
		HttpSession session=request.getSession(false);  
        if(session!=null){  
        	String email=(String)session.getAttribute("email"); 
        	User_account_dao uad=new User_account_dao();
        	User_account account=uad.getAccount(email);
        	out.print("|First Name: "+account.getFirstName());
        	out.print("|Last Name: "+account.getLastName());
        	out.print("|Email: "+account.getEmail());
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
