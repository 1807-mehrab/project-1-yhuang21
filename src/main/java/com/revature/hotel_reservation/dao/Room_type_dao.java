package com.revature.hotel_reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.hotel_reservation.util.ConnectionUtil;

public class Room_type_dao {
	public int getRoomTypeId(String roomType, String limits) {
		
		PreparedStatement ps=null;
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="SELECT type_id FROM room_types where room_type=\'"+
					roomType+"\' and limits=\'"+limits+"\';";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
								
				return rs.getInt(1);
			}
			rs.close();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return 0;
	} 
}
