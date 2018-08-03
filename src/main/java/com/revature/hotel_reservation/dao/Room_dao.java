package com.revature.hotel_reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.hotel_reservation.model.*;
import com.revature.hotel_reservation.util.ConnectionUtil;

public class Room_dao {

	public List<Room> getAllRooms(){
		PreparedStatement ps=null;
		Room c=null;
		List<Room> Rooms=new ArrayList<Room>();
		
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="SELECT * FROM Rooms";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
								
				int room_number=rs.getInt("room_number");
				int room_type_id=rs.getInt("room_type_id");
				int occupied=rs.getInt("occupied");
				c=new Room(room_number,room_type_id,occupied);
				Rooms.add(c);
			}
			rs.close();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return Rooms;
	}
	
}
