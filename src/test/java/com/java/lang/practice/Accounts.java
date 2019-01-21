package com.java.lang.practice;

import org.junit.Test;

public class Accounts {
	String ageOfUser = "18";
	String typeUser;

	@Test
	public String users(String user) {
		System.out.println(user);
		if (user.equalsIgnoreCase("student")) {
			return "valid";
		}
		return "not valid";
	}

	public Accounts() {
		System.out.println("I am in super class");
	}
}
