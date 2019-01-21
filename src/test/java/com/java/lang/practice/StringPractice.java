package com.java.lang.practice;

import org.junit.Test;

public class StringPractice {

	@Test
	public void createString() {
		String s = "naveen";// this will be created in String Pool which is in JVM memory. when ever we
							// create same string "naveen" both variables will be pointed to the same
							// object.
		String s2 = new String("Anil");// This will be created in heap memory. Always creates a new object even in case
										// of same string.
		System.out.println("s: " + s + ", s2: " + s2);
	}

	@Test
	public void subString() {
		String s = "Hello World";
		String s1 = s.substring(0, 6);// this will create a substring index[0-5];
		String s2 = s.substring(6);
		System.out.println("full string : " + s + ", sustring : " + s1);
		System.out.println("s.substring(6) : " + s2);
	}

	@Test
	public void convertCase() {
		String s = "john";
		String s1 = s.toUpperCase();
		String s2 = s1.toLowerCase();
		System.out.println("uppercase : " + s1 + ", lower case : " + s2);
	}

	@Test
	public void divideString() {
		String s = "hello-welcome-thankyou";
		String[] s1 = s.split("-");
		int i;
		String s3 = "";
		for (i = 0; i < s1.length; i++) {
			String s2 = s1[i] + " ";
			s3 = s3 + s2;
		}
		System.out.println(s3);
	}

	@Test
	public void capitalize() {
		String s = "hello";
		String s1 = s.substring(0, 1);
		String s2 = s.substring(1);
		String s3 = s1.toUpperCase();
		String s4 = s3 + s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

	@Test
	public void capitalized() {
		String s = "hello world welcome to java"; // Hello World Welcome To Java
		String[] s1 = s.split(" ");
		int i;
		StringBuilder s3 = new StringBuilder();
		for (i = 0; i < s1.length; i++) {
			s3.append(s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1)).append(" ");

		}
		System.out.println(s3);
	}

	/**
	 * input string : abcde 
	 * left, 2 -> cdeab
	 * right, 2 -> deabc 
	 * right, 3 -> cdeab
	 * left, 5 -> bcdea, cdeab, deabc, eabcd, abcde
	 */
	@Test
	public void stringShift() {
		String direction = "right";
		int noOfRotations = 9;
		String input = "abcde";
		StringPractice practice = new StringPractice();
		practice.shiftOperator(input, direction, noOfRotations);
	}

	@Test
	public void printAllSubStrings() {
		String s = "welcometojava";

		int subStringLen = 50; // wel, com, eto, jav, a
		//int subStringLen2 = 4; // welc, omet, ojav, a 
		StringPractice practice = new StringPractice();
		practice.subStringConverter(s, subStringLen);

	}

	//@Test
	public void shiftOperator(String input, String direction, int noOfRotations) {
		noOfRotations = noOfRotations % input.length();
		if (noOfRotations == 0) {
			System.out.println(input);
		} else {
			if (direction.equalsIgnoreCase("left")) {
				String s1 = input.substring(0, noOfRotations);
				String s2 = input.substring(noOfRotations);
				String s3 = s2 + s1;
				System.out.println(s3);
			}
			if (direction.equalsIgnoreCase("right")) {
				String s1 = input.substring(input.length() - noOfRotations);
				String s2 = input.substring(0, input.length() - noOfRotations);
				String s3 = s1 + s2;
				System.out.println(s3);

			}
		}

	}

	public void subStringConverter(String s, int size) {
		String s2 = "";
		for (int i = 0; i < s.length() + 1; i = i + size) {
			String s1 = s.substring(i, Math.min(s.length(), i + size)) + ", ";
			s2 = s2 + s1;
		}
		System.out.println(s2);
	}

}
