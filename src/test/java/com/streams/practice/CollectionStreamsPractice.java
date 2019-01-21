package com.streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectionStreamsPractice {

	@Test
	public void creatStream() {

		Stream<String> stream = Stream.of("nav", "avi", "john");
		stream.forEach(System.out::println);
	}

	@Test
	public void prepareEmployeeStream() {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setFirstName("naveen");
		emp2.setFirstName("soma");
		Stream<Employee> stream = Stream.of(emp1, emp2);
		stream.forEach(emp -> System.out.println(emp.getFirstName()));
	}

	@Test
	public void preparePrimitiveIntStream() {
		IntStream intStream = IntStream.of(1, 2, 3, 4);
		intStream.forEach(System.out::println);

		IntStream intStream2 = Arrays.stream(new int[] { 1, 2, 3, 4 });
		intStream2.forEach(System.out::println);

		IntStream intstream3 = IntStream.range(1, 9);
		intstream3.forEach(System.out::print);
	}

	@Test
	public void prepareLongStream() {
		LongStream longStream = LongStream.of(123, 134, 145);
		longStream.forEach(System.out::println);

		LongStream longStream2 = Arrays.stream(new long[] { 198, 187, 176 });
		longStream2.forEach(System.out::println);
	}

	@Test
	public void prepareDoubleStream() {

	}

	@Test
	public void prepareNewList() {
		List<String> list = Arrays.asList("nav", "avi", "John");
		List<String> list1 = list.stream().collect(Collectors.toList());
		Set<String> set = list.stream().collect(Collectors.toSet());

		list1.stream().forEach(System.out::println);
		set.stream().forEach(System.out::print);

	}

	@Test
	public void filterStream() {
		List<String> list = Arrays.asList("nav", "sam", "jay", "joy");
		// list.stream().fil
	}
}
