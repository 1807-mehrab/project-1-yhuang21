package com.revature.hotel_reservation.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.hotel_reservation.model.Reservation;
import com.revature.hotel_reservation.util.ConnectionUtil;

public class Reservation_dao {
	public List<Reservation> getAllReservations(){
		PreparedStatement ps=null;
		Reservation c=null;
		List<Reservation> Reservations=new ArrayList<Reservation>();
		
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="SELECT * FROM Reservations";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
								
				long reservation_id=rs.getLong(1);
				String customer_firstname=rs.getString(2);
				String customer_lastname=rs.getString(3);
				int room_type_id=rs.getInt(4);
				Date check_in_date=rs.getDate(5);
				int number_of_nights=rs.getInt(6);
				int status_id=rs.getInt(7);
				int room_number=rs.getInt(8);
				c=new Reservation(
						reservation_id,
						customer_firstname,
						customer_lastname,
						room_type_id,
						check_in_date,
						number_of_nights,
						status_id,
						room_number
					);
				Reservations.add(c);
			}
			rs.close();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return Reservations;
	}
	
	public Reservation getReservation(String firstName, String lastName) {
		List<Reservation> Reservations=getAllReservations();
		for(Reservation Reservation:Reservations) {
			if(Reservation.getCustomer_firstName().equals(firstName)&&Reservation.getCustomer_lastName().equals(lastName)) {
				return Reservation;
			}
		}
		return null;
	}
	
	public void storeReservation(Reservation reservation) {
		PreparedStatement ps=null;
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="insert into user_reservations values(\'"+
						reservation.getReservation_id()+"\',\'"+
						reservation.getCustomer_firstName()+"\',\'"+
						reservation.getCustomer_lastName()+"\',\'"+
						reservation.getRoom_type_id()+"\',\'"+
						reservation.getCheck_in_date()+"\',\'"+
						reservation.getNumber_of_nights()+"\',\'"+
						reservation.getStatus_id()+"\',\'"+
						reservation.getRoom_number()+
						"\')";
			//System.out.println(sql);
			ps=conn.prepareStatement(sql);
			
			ps.executeQuery();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
