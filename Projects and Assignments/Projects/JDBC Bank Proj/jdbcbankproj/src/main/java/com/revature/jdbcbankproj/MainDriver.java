package com.revature.jdbcbankproj;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class MainDriver 
{
	// Add log4j
	
	static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }
	
	static Logger log = Logger.getLogger(MainDriver.class.getName());
	
	
	public static ConnFactory cf = ConnFactory.getInstance();
	
    public static void main( String[] args )
    {
    	// Configure log4j to print to console.
		// Comment out to not print to console.
		BasicConfigurator.configure();
    	
		log.info("Hello log");
    	
    	 Connection conn = cf.getConnection();
    	 
    	 try {
			Statement stm = conn.createStatement();
			ResultSet result = stm.executeQuery("SELECT * FROM USERS");
			
			while(result.next()) {
				System.out.println("USER_ID: " + result.getString("USER_ID"));
			}
			result.close();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 
    	 
    	 // Close Connection conn
    	 try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
