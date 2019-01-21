package com.java.enums.practice;

import java.util.HashMap;
import java.util.Map;

public enum EnumLookUp {
	MONDAY(10), TUESDAY(20), WEDNESDAY(30);

	private final int value;
	private static final Map<Integer, EnumLookUp> map = new HashMap<>();

	static {
		for (EnumLookUp lookUp : EnumLookUp.values()) {
			map.put(lookUp.getValue(), lookUp);
		}
	}

	private EnumLookUp(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static EnumLookUp lookUpByValue(int value) {
		return map.get(value);
	}

}
