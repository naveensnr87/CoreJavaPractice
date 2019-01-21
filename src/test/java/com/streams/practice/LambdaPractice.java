package com.streams.practice;

import org.junit.Test;

public class LambdaPractice {

	@Test
	public void functionalInterfaceOneInnerClass() {
		FunctionalInterface1 interface1 = () -> {
			System.out.println("lambda");
		};
		interface1.testOne();

		// syntax 2
		FunctionalInterface1 interface2 = () -> System.out.println("lambda2");
		interface2.testOne();

		test1(() -> {
			System.out.println("closure1");
		});
		test1(() -> System.out.println("closure12"));

	}

	private void test1(FunctionalInterface1 interface1) {
		interface1.testOne();
	}

	@Test
	public void functionalInterface2() {

		FunctionalInterface2 functionalInterface2 = (arg0) -> System.out.println("argumented methods: " + arg0);
		functionalInterface2.test1("naveen");
		functionalInterface2.test1("Avinash");

		FunctionalInterface2 functionalInterface3 = (String arg0) -> System.out.println("argumented methods: " + arg0);

	}

	@Test
	public void fuctionalInterface3() {
		FunctionalInterface3 interface3 = (i, l, d, b) -> System.out
				.println("i: " + i + ", l: " + l + ", d: " + d + ", b: " + b);

		interface3.test1(1, 100, 100.1, true);
	}

}
