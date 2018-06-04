package com.revature.jdbcbankproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Accounts {

	ArrayList<Integer> accountid;
	ArrayList<Double> accountbalance;
	ArrayList<String> accountcreateddate;
	ArrayList<Integer> accountstatusid;
	
	public void CreateAccount(int userid) {
		
		MainDriver.log.info("In CreateAccount()");
		
		Scanner scanCA = new Scanner(System.in);
		
		PreparedStatement stmt;
		
		Connection conn = MainDriver.cf.getConnection();
		
		try {
			String sqlString = "INSERT INTO BANKACCOUNT VALUES (SEQ_CREATE_BANK_ACCOUNT_ID.NEXTVAL, ?, ?, SYSDATE, ?)";
			//System.out.println(sqlString);		
			stmt = conn.prepareStatement(sqlString);
			
			
			stmt.setInt(1, userid);
			stmt.setDouble(2, 0.00);
			stmt.setInt(3, 1);
			
			int cu = stmt.executeUpdate();
			
			if(cu > 0) {
				System.out.println("Account has been created.");
			}
			else {
				System.out.println("Failed to create account.");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void SetAccount() {
		
	}
	
	public void CheckAccountStatus(int accountNum) {
		
	}
	
	public void CheckAccountBalance(int accountNum) {
		
	}
}
