package com.revature.jdbcbank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Driver 
{
	public static ConnFactory cf = ConnFactory.getInstance();
    public static void main( String[] args )
    {
        Connection conn = cf.getConnection();
        try {
			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery("SELECT * FROM USERS");
			
			while(result.next()) {
				System.out.println("USER_ID: " + result.getString("USER_ID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        
    }
}
