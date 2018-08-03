package com.revature.hotel_reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.hotel_reservation.model.Admin_account;
import com.revature.hotel_reservation.util.ConnectionUtil;

public class Admin_account_dao {
	public List<Admin_account> getAllAccounts(){
		PreparedStatement ps=null;
		Admin_account a=null;
		List<Admin_account> accounts=new ArrayList<Admin_account>();
		
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="SELECT * FROM Admin_accounts";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
								
				String email=rs.getString("email");
				String password=rs.getString("password");
				String firstname=rs.getString("firstname");
				String lastname=rs.getString("lastname");
				a=new Admin_account(email,password,firstname,lastname);
				accounts.add(a);
			}
			rs.close();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return accounts;
	}
	
	public Admin_account getAccount(String email) {
		List<Admin_account> accounts=getAllAccounts();
		for(Admin_account account:accounts) {
			if(account.getEmail().equals(email)) {
				return account;
			}
		}
		return null;
	}
}
