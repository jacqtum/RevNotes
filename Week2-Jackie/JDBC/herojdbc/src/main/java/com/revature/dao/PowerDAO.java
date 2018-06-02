package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.herojdbc.beans.Power;

public interface PowerDAO {
	
	// This is the PowerDAO interface, which will be implemented by the PowerDAOImpl class.
	// The PowerDAOImpl class must implement the methods from this interface.
	

	public abstract void createPower(String powerName) throws SQLException; 
		// throws SQLException so when implemented by a class, the class will also have throws SQLException.
		// won't need to add try/catch block if throws Exception is already included.
	
	public abstract List<Power> getPowerList() throws SQLException;
	
	
	
	
}
