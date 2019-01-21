package com.streams.practice;

public class Employee {

	private String firstName;

	public Employee() {
		System.out.println("I am inside zero arg constructor");
	}

	public Employee(String firstName) {
		System.out.println(firstName);
	}

	public Employee(int i, long l, double d, boolean b) {
		System.out.println(i);
	}

	public <T> Employee(T i) {
		System.out.println(i.getClass().getName() + " : " + i);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
