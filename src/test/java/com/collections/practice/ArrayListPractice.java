package com.collections.practice;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class ArrayListPractice {

	@Test
	public void createArrayList() {
		List<String> stringList = new ArrayList<>();
		System.out.println(stringList);
	}

	@Test
	public void addElementsToList() {
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		System.out.println(integerList);
	}

	@Test
	public void iterateList() {
		List<String> listOfNames = new ArrayList<>();
		listOfNames.add("naveen");
		listOfNames.add("avinash");
		listOfNames.add("renu");

		// iterate using while
		System.out.println("----------- while loop ------------------");
		int i = 0;
		while (i < listOfNames.size()) {
			System.out.println(listOfNames.get(i));
			i++;
		}

		// iterate using do while
		System.out.println("----------- do while loop ------------------");
		int j = 0;

		do {
			System.out.println(listOfNames.get(j));
			j++;
		} while (j < listOfNames.size());

		// iterate using for loop
		System.out.println("----------- for loop ------------------");

		for (int k = 0; k < listOfNames.size(); k++) {
			System.out.println(listOfNames.get(k));
		}
		// iterate using foreach
		System.out.println("----------- foreach loop ------------------");

		for (String name : listOfNames) {
			System.out.println(name);
		}

		// using iterator
		System.out.println("----------- using Iterator ------------------");
		Iterator<String> iterator = listOfNames.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// using list iterator
		System.out.println("----------- List Iterator ------------------");

		Iterator<String> listIterator = listOfNames.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// using collection streams
		System.out.println("----------- collection streams with lambda expressions ------------------");

		listOfNames.stream().forEach(name -> System.out.println(name));

		// using collection streams using method reference
		System.out.println("----------- collection streams with method reference ------------------");

		listOfNames.stream().forEach(System.out::println);

	}

	@Test
	public void removeElements() {
		List<String> listElement = new ArrayList<>();
		listElement.add("Nav");
		listElement.add("sam");
		listElement.add("john");
		listElement.add("joy");
		listElement.add("joel");

		System.out.println(listElement);
		listElement.remove(0);
		System.out.println(listElement);
		listElement.remove("sam");
		System.out.println(listElement);
		listElement.clear();
		System.out.println(listElement);
	}

	@Test
	public void convertArrayToList() {
		String[] strArray = new String[] { "joy", "john", "joel", "nav" };
		List<String> strList = Arrays.asList(strArray);
		System.out.println(strList);

		List<String> strList2 = new ArrayList<>(Arrays.asList(strArray));
		System.out.println(strList2);

		int[] intArray = new int[] { 0, 1, 2, 3 };
		List<Integer> intList = new ArrayList<>();
		for (int number : intArray) {
			intList.add(number);
		}
		System.out.println(intList);
		// using streams
		List<Integer> intList2 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		System.out.println(intList2);

		Integer[] intArray2 = new Integer[] { 5, 6, 7, 8 };
		List<Integer> intList1 = Arrays.asList(intArray2);
		System.out.println(intList1);
	}

	/**
	 * [1,2,3,4] -> 1,2,3,4
	 */
	@Test
	public void listToCommaSeparatedString() {
		List<String> listInt = new ArrayList<>();
		listInt.add("1");
		listInt.add("2");
		listInt.add("3");
		listInt.add("4");

		String string = "";
		for (String integer : listInt) {
			string = string + integer + ",";
		}
		string = string.substring(0, string.length() - 1);
		System.out.println(string);

		StringBuffer string2 = new StringBuffer();
		for (String integer : listInt) {
			string2.append(integer).append(",");
		}
		string2.deleteCharAt(string2.length() - 1);
		System.out.println(string2);

		String string4 = String.join("-", listInt);
		System.out.println(string4);
	}

	@Test
	public void removeNullsFromList() {
		List<String> removeNull = new ArrayList<>();
		removeNull.add("Nav");
		removeNull.add(null);
		removeNull.add("jay");
		removeNull.add("joy");
		removeNull.add("john");
		removeNull.add(null);
		System.out.println(removeNull);

		removeNull.removeAll(Collections.singleton(null));
		System.out.println(removeNull);
	}

	@Test
	public void removeListFromAnother() {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println(list1);
		list1.removeAll(list2);
		System.out.println(list1);

	}

	@Test
	public void intersectionOfCollections() {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println(list1);
		list1.retainAll(list2);
		System.out.println(list1);
	}

	@Test
	public void unionOfCollection() {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println(list1);
		list1.addAll(list2);
		System.out.println(list1);

	}

	@Test
	public void convertListToSet() {
		List<Integer> list1 = new ArrayList<>();
		Set<Integer> set1 = new HashSet<>();
		list1.add(0);
		list1.add(1);
		list1.add(1);
		list1.add(3);
		list1.add(4);
		set1.addAll(list1);
		System.out.println(list1);
		System.out.println(set1);

		Set<Integer> set2 = new HashSet<>(list1);
		System.out.println(set2);

		Queue<Integer> queue = new ArrayDeque<>(list1);
		System.out.println(queue);

	}

	@Test
	public void splitInToSubSet() {
		List<Integer> list1 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(splitList(list1, 2));
		System.out.println(splitList(list1, 3));
		System.out.println(splitList(list1, 4));
		System.out.println(splitList(list1, 5));
		System.out.println(splitList(list1, 10));
		System.out.println(splitList(list1, 15));
	}

	public <T> List<List<T>> splitList(List<T> srcList, final int lengthOfSubList) {
		List<List<T>> splits = new ArrayList<>();
		final int size = srcList.size();
		for (int i = 0; i < size; i = i + lengthOfSubList) {
			splits.add(new ArrayList<T>(srcList.subList(i, Math.min(size, i + lengthOfSubList))));
		}
		return splits;
	}

	@Test
	public void sortByDate() {
		List<Employee> list = Arrays.asList(new Employee(LocalDate.of(2019, 01, 01)),
				new Employee(LocalDate.of(2019, 02, 05)), new Employee(LocalDate.of(2019, 01, 01)),
				new Employee(LocalDate.of(2018, 01, 01)), new Employee(LocalDate.of(2020, 8, 06)));
		System.out.println(list);

		List<Employee> sortedList = list.stream().sorted((e1, e2) -> e1.getDate().compareTo(e2.getDate()))
				.collect(Collectors.toList());

		System.out.println(sortedList);
	}

}