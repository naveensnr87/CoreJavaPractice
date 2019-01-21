package com.java.lang.practice;

import org.junit.Test;

import com.collections.practice.Employee;

public class ArraysPractice {

	@Test
	public void primitiveArrays() {
		int[] intArray = new int[10];
		intArray[0] = 10;
		intArray[1] = 11;
		intArray[2] = 11;
		intArray[3] = 11;

		int[] intArrat2 = { 1, 2, 3 };

		double[] doubleArray = new double[5];
		doubleArray[0] = 11.12;

		double[] doubleArray1 = { 11.12, 12.23 };
	}

	@Test
	public void objectArray() {
		Integer[] intArray = new Integer[10];
		intArray[1] = 12;

		Integer[] intArray1 = { 10, 12 };

		String[] str = new String[10];
		str[0] = "nav";

		String[] str1 = { "nav", "john" };

		Employee[] emp = new Employee[10];
		emp[0] = new Employee();

		Employee[] emp1 = { new Employee(), new Employee() };

	}
}
