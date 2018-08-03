package com.revature.hotel_reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.revature.hotel_reservation.model.User_account;
import com.revature.hotel_reservation.util.ConnectionUtil;

public class User_account_dao {
	public List<User_account> getAllAccounts(){
		PreparedStatement ps=null;
		User_account a=null;
		List<User_account> accounts=new ArrayList<User_account>();
		
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="SELECT * FROM user_accounts";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
								
				String email=rs.getString("email");
				String password=rs.getString("password");
				String firstname=rs.getString("firstname");
				String lastname=rs.getString("lastname");
				a=new User_account(email,password,firstname,lastname);
				accounts.add(a);
			}
			rs.close();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return accounts;
	}
	
	public User_account getAccount(String email) {
		List<User_account> accounts=getAllAccounts();
		for(User_account account:accounts) {
			if(account.getEmail().equals(email)) {
				return account;
			}
		}
		return null;
	}
	
	public void storeAccount(User_account account) {
		PreparedStatement ps=null;
		try(Connection conn=ConnectionUtil.getConnection()){
			String sql="insert into user_accounts values(\'"+
		account.getEmail()+"\',\'"+account.getPassword()+"\',\'"+account.getFirstName()+"\',\'"+account.getLastName()+"\')";
			//System.out.println(sql);
			ps=conn.prepareStatement(sql);
			
			ps.executeQuery();
			ps.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
