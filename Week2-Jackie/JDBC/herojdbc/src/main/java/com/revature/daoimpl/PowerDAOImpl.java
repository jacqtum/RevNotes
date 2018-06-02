package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.dao.PowerDAO;
import com.revature.herojdbc.beans.Power;
import com.revature.util.ConnFactory;

public class PowerDAOImpl implements PowerDAO {

	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void createPower(String powerName) throws SQLException {

		Connection conn = cf.getConnection();
		
		String[] primaryKeys = new String[1];
		
		primaryKeys[0] = "PowerID";
		
		String sql = "INSERT INTO POWERS VALUES(POWSEQ.NEXTVAL, ?)";
		
		
		PreparedStatement ps = conn.prepareStatement(sql, primaryKeys);
		
		ps.setString(1, powerName); // 	1 refers to the first question mark. There's only 1 questions mark
			// The 1st question mark will be a String and it will have the value of whatever powerName value is.
		
		ps.executeUpdate();

	}

	public List<Power> getPowerList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
		
}

	

