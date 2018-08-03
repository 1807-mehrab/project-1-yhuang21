package com.revature.hotel_reservation.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.hotel_reservation.dao.Reservation_dao;
import com.revature.hotel_reservation.dao.Room_type_dao;
import com.revature.hotel_reservation.model.Reservation;

/**
 * Servlet implementation class Booking
 */
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Room_type_dao rtd=new Room_type_dao();
		int room_type_id=rtd.getRoomTypeId(request.getParameter("room_type"), request.getParameter("limits"));
		/*
		Reservation reservation=new Reservation();
		
		
		Reservation_dao rd=new Reservation_dao();
		rd.storeReservation(reservation);
		*/
	}

}
