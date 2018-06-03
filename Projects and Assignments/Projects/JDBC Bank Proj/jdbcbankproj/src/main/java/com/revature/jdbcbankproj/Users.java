package com.revature.jdbcbankproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Users {

	int userid;
	String username;
	String fname;
	String lname;
	String passwd;
	String DOB;
	String usertypeid;
	String createddate;
	int userstatusid;
	
	
	
	
	public boolean CheckUsername(String usern) {
		// Check if Username exists.
		this.username = usern;
		boolean usern_exists = false;
		try {
			Statement stmt = MainDriver.conn.createStatement();
			String sql_CheckUsername = "SELECT USERNAME FROM USERS WHERE USERNAME = '" + this.username + "'";
			ResultSet rs = stmt.executeQuery(sql_CheckUsername);
			
			if(rs.next()) {
				System.out.println("Username " + rs.getString(1) + " exists.");
				usern_exists = true;
			}
			else {
				System.out.println("Username " + this.username + " does not exist.");
				usern_exists = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(usern_exists == true) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		// If username exists, return true.
		
		// If username does not exist, return false.
		
		
		
	}
	
	public boolean CheckUserStatus(String usern) {
		// Check status of user
		
		// If status is "CLOSED", return false
		
		// If status is "ACTIVE", return true.
		return false;
	}
	
	public void CheckUsernameAndPass() {
		
	}
	
	
	public void CreateUsers(String usern) {
		MainDriver.log.info("In CreateUsers(): ");
		this.username = usern;
		Scanner scanCU = new Scanner(System.in);
		
		System.out.println("Password: ");
		this.passwd = scanCU.next();
		System.out.println("Password: " + this.passwd);
		
		System.out.print("First Name: ");
		this.fname = scanCU.next();
		System.out.println("First Name: " + this.fname);
		
		System.out.println("Last Name: ");
		this.lname = scanCU.next();
		System.out.println("Last Name: " + this.lname);
		
		System.out.println("Date Of Birth (YYYY-MM-DD): ");
		this.DOB = scanCU.next();
		System.out.println("DOB: " + this.DOB);

		
		PreparedStatement stmt;
		
		Connection conn = MainDriver.cf.getConnection();
		try {
			stmt = MainDriver.conn.prepareStatement("INSERT INTO USERS VALUES (SEQ_CREATE_USER_ID.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, SYSDATE)");
			
			stmt.setString(1, this.username);
			stmt.setString(2, this.fname);
			stmt.setString(3, this.lname);
			stmt.setString(4, this.passwd);
			stmt.setDate(5, java.sql.Date.valueOf(this.DOB));
			stmt.setInt(6, 2);
			stmt.setInt(7, 1);
			
			
			
			int cu = stmt.executeUpdate();
			
			if(cu > 0) {
				System.out.println("User has been created.");
			}
			else {
				System.out.println("Failed to create user.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 
		
		
		// User type 2 = customer. User status 1 = active.
		
	}
	
	
}
