package com.java.lang.practice;

import org.junit.Test;

public class MainTest {
	@Test
	public void test1Method() {
		SuperPractice sp = new SuperPractice();
		System.out.println(sp.ageOfUser);
		String s = sp.users("student");
		System.out.println(s);
	}
}
