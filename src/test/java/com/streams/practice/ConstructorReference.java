package com.streams.practice;

import org.junit.Test;

public class ConstructorReference {

	@Test
	public void constructorRef1() {
		FunctionalInterface1 interface1 = Employee::new;
		interface1.testOne();
	}

	@Test
	public void constructorArgRef2() {
		FunctionalInterface2 interface2 = Employee::new;
		interface2.test1("naveen");
	}

	@Test
	public void constructorArgMul() {
		FunctionalInterface3 interface3 = Employee::new;
		interface3.test1(1, 123, 123.22, true);
	}

	@Test
	public void constructorGen() {
		FunctionalInterfaceGeneric<String> generic = Employee::new;
		generic.testGen("naveen");

		FunctionalInterfaceGeneric<Integer> generic2 = Employee::new;
		generic2.testGen(1);
	}

}
