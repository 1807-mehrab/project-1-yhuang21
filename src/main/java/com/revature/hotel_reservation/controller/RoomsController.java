package com.revature.hotel_reservation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.revature.hotel_reservation.dao.*;
import com.revature.hotel_reservation.model.*;

/**
 * Servlet implementation class RoomController
 */
public class RoomsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Room_dao roomDao=new Room_dao();
		List<Room> rooms= roomDao.getAllRooms();
		
		PrintWriter pw=response.getWriter();
		for(Room r:rooms) {
			pw.println(r.toString());
		}
		pw.close();
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		/*
		System.out.println("Got a post request");
		System.out.println(request.getParameter("Email"));
		System.out.println(request.getParameter("Password"));
		HttpServletResponse.sendRedirect("/your/new/location.jsp")
		*/
		//System.out.println(request.getQueryString());
	

	}	
}
