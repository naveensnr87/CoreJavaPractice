package com.java.enums.practice;

import org.junit.Test;

public class EnumPractice {

	@Test
	public void accessEnum() {
		DaysEnum monday = DaysEnum.MONDAY;
		System.out.println(monday);
	}

	@Test
	public void enumInIfConditions() {
		DaysEnum daysEnum = DaysEnum.MONDAY;
		if (DaysEnum.MONDAY == daysEnum)
			System.out.println(daysEnum + ": In If condition");
		else {
			System.out.println("in else block");
		}
	}

	@Test
	public void enumInSwitchCondition() {
		DaysEnum obj = DaysEnum.MONDAY;
		switch (obj) {
		case MONDAY:
			System.out.println("MONDAY");
			break;
		case TUESDAY:
			System.out.println("TUESDAY");
			break;
		default:
			break;
		}
	}

	@Test
	public void iteratorEnum() {
		DaysEnum[] days = DaysEnum.values();
		for (int i = 0; i < days.length; i++) {
			DaysEnum day;
			day = days[i];
			System.out.println(day);
		}
	}

	@Test
	public void iterateWhile() {
		DaysEnum2[] days = DaysEnum2.values();
		int i = 0;
		while (i < days.length) {
			//DaysEnum2 day;
			System.out.println(days[i].getValue());
			i++;
		}
	}

	@Test
	public void enumLookUp() {
		EnumLookUp lookUp = EnumLookUp.lookUpByValue(30);
		System.out.println(lookUp);
	}

	//@Test

}
