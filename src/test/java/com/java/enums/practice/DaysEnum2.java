package com.java.enums.practice;

public enum DaysEnum2 {
	MONDAY(10), TUESDAY(20), WEDNESDAY(30);

	private final int value;

	private DaysEnum2(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
