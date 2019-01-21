package com.collections.practice;

import java.time.LocalDate;

public class Employee {

	private LocalDate date;

	public Employee() {

	}

	public Employee(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "" + date;
	}

}
