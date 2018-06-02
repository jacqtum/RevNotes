package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.HeroDAOImpl;

public class Driver {

	public static void main(String[] args) {
		
		HeroDAOImpl hdi = new HeroDAOImpl();
		
		try {
			hdi.createHero("One Punch Man");
			System.out.println(hdi.getHeroList());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
