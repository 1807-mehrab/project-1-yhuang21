package com.revature.hotel_reservation.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.*;

public class ConnectionUtil {
	public static Connection getConnection() throws SQLException, IOException{	
		DriverManager.registerDriver(new OracleDriver());
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"hotel_reservation",
				"abcde12345");
	}
}
