package com.java.lang.practice;

import org.junit.Test;

public class SuperPractice extends Accounts {

	String ageOfUser = "16";

	@Test
	public String users(String user) {
		System.out.println(user);
		if (user.equalsIgnoreCase("PNCCustomer")) {
			return "valid";
		} else {
			super.users(user);
		}
		return "not valid";
	}

	public SuperPractice() {
		super();
		System.out.println("I am in child class");
	}

}
