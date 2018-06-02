package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.dao.HeroDAO;
import com.revature.herojdbc.beans.Hero;
import com.revature.util.ConnFactory;

public class HeroDAOImpl implements HeroDAO {

	public static ConnFactory cf = ConnFactory.getInstance();
	
	public void createHero(String heroName) throws SQLException {

		Connection conn = cf.getConnection();
		String sql = "{call INSERTSUPERHERO(?)";
		
		CallableStatement call = conn.prepareCall(sql); // CallableStatement is used to call a stored procedure.
		
		call.setString(1, heroName);
		
		call.execute();
	}
	

	public List<Hero> getHeroList() throws SQLException {
		
		List<Hero> heroList = new ArrayList<Hero>();
		
		Connection conn = cf.getConnection();
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM SUPERHERO");
		
		Hero s = null;
		
		// while result set has something...
		while(rs.next()) {
			s = new Hero(rs.getInt(1), rs.getString(2)); // Result Set starts with 1.
			heroList.add(s); 
		}
		
		return heroList;
		
		
	}
	
	
	
	

}
