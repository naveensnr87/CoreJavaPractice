package com.streams.practice;

import org.junit.Test;

public class MethodReference {

	private static void method1() {
		System.out.println("method1");
	}

	private void method2() {
		System.out.println("method2");
	}

	@Test
	public void functionaliInterface1() {
		FunctionalInterface1 interface1 = () -> System.out.println("lambda1");
		interface1.testOne();

		FunctionalInterface1 interface12 = MethodReference::method1;
		interface12.testOne();

		MethodReference reference = new MethodReference();
		FunctionalInterface1 interface13 = reference::method2;
		interface13.testOne();
	}

	@Test
	public void functionaliInterfaceReturnMethod() {
		FunctionalInterfaceReturnType interface1 = (a) -> {
			System.out.println("iterface1 : " + a);
			return ("Nav");
		};
		System.out.println(interface1.test1("avi"));

	}
}
