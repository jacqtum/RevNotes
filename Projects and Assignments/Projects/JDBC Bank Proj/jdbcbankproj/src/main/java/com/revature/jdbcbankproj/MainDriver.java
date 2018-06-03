package com.revature.jdbcbankproj;

import java.sql.Connection;
import java.util.Date;
import java.util.Scanner;
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
	static Logger log = Logger.getLogger(MainDriver.class.getName());
	
	static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
        
    }
	
	
	
	
	public static ConnFactory cf = ConnFactory.getInstance();
	public static Connection conn = cf.getConnection();
	
    public static void main( String[] args )
    {
    	// Configure log4j to print to console.
		// Comment out to not print to console.
		//BasicConfigurator.configure();
    	
		log.info("In main(): \n");
    	
    	
    	 
    	 /*
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
    	 */
    	 
    	 
    	 int topMenuScan;
    	 
    	 boolean topMenuControl;
    	 boolean topMenuControl1;
    	 boolean topMenuControl2;
    	 
    	 // TOP MENU
    	 topMenuControl  =true;
    	 
    	 while(topMenuControl == true) {
    		 log.info("Inside TOP Menu while loop");
    		 System.out.println("BANK MENU");
        	 System.out.println("\n1 Register\n2 Login\n");
        	 System.out.println("Enter number to continue or enter 0 to exit.\nNumber: ");
        	 Scanner scan = new Scanner(System.in);
        	 topMenuScan = 0;
        	 topMenuScan = scan.nextInt();
        	 log.info("topMenuScan == " + topMenuScan);
        	 
        	 // EXIT PROGRAM
        	 if(topMenuScan == 0) {
        		 log.info("Inside topMenuScan == 0");
        		 System.out.println("Thank You. Goodbye.");
        		 topMenuControl = false;
        	 }
        	 // REGISTRATION
        	 else if(topMenuScan == 1) {
        		 log.info("Inside topMenuScan == 1");
        		 topMenuControl1 = true;
        		 while(topMenuControl1 == true) {
        			 log.info("Inside topMenuControl1");
            		 System.out.println("REGISTER PAGE");
            		 System.out.println("Enter EXIT to go back.");
            		 //REGISTRATION PROCESS
            		 Users u = new Users();
            		 
            		 System.out.println("Username: ");
            		 String userNam = scan.next();
            		 
            		 // Check if exit
            		 
            		 if(userNam.equalsIgnoreCase("exit")){
            			 break;
            		 }
            		 // check if exit.
            		 // Check username
            		 boolean userNameExists;
            		 userNameExists = u.CheckUsername(userNam);
            		 
            		 // If username exists, ask for new username. Go back to topMenuControl1.
            		 if(userNameExists == true) {
            			 System.out.println("Username " + userNam + " exists. Please enter a new username.");
            			 continue;
            		 }
            		 // If username doesn't exist, Registration Process Continues.
            		 else {
            			 System.out.println("Username " + userNam + " is avaialable. ");
            			 
            			 // Continue User Registration
            			 u.CreateUsers(userNam);
            			// Exit while loop topMenuControl1
                		 topMenuControl1 = false;
            		 }
            		 
            		 
        		 }
        		 
        		 

        		 // After Registration Process, go to TOP MENU
        		 System.out.println("Registration Complete. Returning to BANK MENU.");
        		 try {
					Thread.sleep(3000);
        		 } catch (InterruptedException e) {
					e.printStackTrace();
        		 }
        		 
        	 }
        	 // LOGIN
        	 else if(topMenuScan == 2) {
        		 log.info("Inside topMenuScan == 2");
        		 System.out.println("LOGIN PAGE");
        		 topMenuControl2 = true;
        		 while(topMenuControl2 == true) {
        			 log.info("Inside topMenuControl2");
        			 
        			//LOGIN PROCESS
        			 
        			 
        			 //Exit while loop TopMenuControl2
        			 topMenuControl2 = false;
        		 }
        		 
        		 
        		 
        		 // After Login Process, go to TOP MENU
        		 System.out.println("Returning to BANK MENU.");
        		 try {
					Thread.sleep(3000);
        		 } catch (InterruptedException e) {
					e.printStackTrace();
				}
        		 
        	 }
        	 // INVALID CHOICE
        	 else {
        		 log.info("Inside topMenuScan == invalid option");
        		 System.out.println("Please enter a valid number. Returning to BANK MENU.");
        		 
        		 // Wait 5 seconds before going back to TOP MENU
        		 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		
        	 }
        	 
        	 
    	 }
    	 
    	log.info("Outside the TOP MENU");
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 /* Close Connection conn */
    	 try {
    		 log.info("Closing Connection conn");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
