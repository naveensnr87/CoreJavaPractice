package com.collections.practice;

public enum DaysEnum {
	Monday(1), Tuesday(2), Wednesday(3), Thrusday(4), Friday(5), Saturday(6), Sunday(7);
	private final int value;

	private DaysEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
