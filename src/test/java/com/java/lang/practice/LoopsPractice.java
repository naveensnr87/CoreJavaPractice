package com.java.lang.practice;

import org.junit.Test;

import com.streams.practice.Employee;

public class LoopsPractice {

	@Test
	public void arrayLoop() {
		String[] s = { "nav", "john" };

		//
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		for (String s1 : s) {
			System.out.println(s1);
		}

		// while loop
		int i = 0;
		while (i < s.length) {
			System.out.println(s[i]);
			i++;
		}

		// do while loop
		int j = 0;
		do {
			System.out.println(s[j]);
			j++;
		} while (j < s.length);
	}

	@Test
	public void employeeArrayLoop() {
		// create 3 employee objects, set firstName for each employee object
		// create employee array
		// assign above 3 objects to employee array
		// loop employee array and print first names
		Employee[] emp = new Employee[10];
		emp[0] = new Employee();
		emp[1] = new Employee();
		emp[2] = new Employee();
		emp[0].setFirstName("Naveen");
		emp[1].setFirstName("Avinash");
		emp[2].setFirstName("John");
		/*System.out.println(emp[0].getFirstName() + " emp[0]," + emp[1].getFirstName() + " emp[1],"
				+ emp[2].getFirstName() + " emp[2].");*/
		for (int i = 0; i < 3; i++) {
			System.out.println(emp[i].getFirstName());
		}
	}

}
