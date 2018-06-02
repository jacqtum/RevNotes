package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.herojdbc.beans.Hero;

public interface HeroDAO {
	
	// This is the HeroDAO interface which the HeroDAOImpl class will implement.
	// The HeroDAOImpl class must implement all methods.
	
	
	// CRUD Operations
	
	
	// In interface, methods are abstract and do not have implementation details.
	public abstract void createHero(String heroName) throws SQLException;
	
	public abstract List<Hero> getHeroList() throws SQLException;
	
}
