package com.streams.practice;

import org.junit.Test;

public class AnonymousInnerClass {

	@Test
	public void functionalInterfaceOneInnerClass() {
		FunctionalInterface1 interface1 = new FunctionalInterface1() {
			@Override
			public void testOne() {
				System.out.println("test1");
			}
		};
		interface1.testOne();
	}
}
