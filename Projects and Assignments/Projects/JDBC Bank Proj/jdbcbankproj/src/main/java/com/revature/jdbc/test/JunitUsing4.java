package com.revature.jdbc.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.gen5.api.Assertions;

import com.revature.jdbcbankproj.Users;

public class JunitUsing4 {

	@Test
	public void testGetUserID() {
		Users u = new Users();
		Assertions.assertEquals(2, u.GetUserID("BEAMIA", "BEAMIA123"));
	}
	

//	@Test
//	void testSetUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCheckUsername() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCheckUsernameAndPass() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCreateUsers() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFindUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDeleteUser() {
//		fail("Not yet implemented");
//	}

}
