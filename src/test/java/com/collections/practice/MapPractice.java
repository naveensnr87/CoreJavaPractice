package com.collections.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class MapPractice {

	@Test
	public void hashMap() {
		Map<String, String> hashMap = new HashMap<>();//not synch, no insertion order, inserts using hashcode.
		Map<String, String> linkedHashMap = new LinkedHashMap<>();//maintain insertion order.
		Map<String, String> hashTable = new Hashtable<>();//synchronized
		Map<String, String> treeMap = new TreeMap<>();//sorts the collection

		System.out.println(hashMap);
		System.out.println(linkedHashMap);
		System.out.println(hashTable);
		System.out.println(treeMap);

	}

	@Test
	public void putValues() {
		Map<String, String> mapValues = new HashMap<>();
		mapValues.put("0", "zero");
		mapValues.put("1", "one");
		mapValues.put("2", "two");
		mapValues.put("3", "three");
		mapValues.put("3", "four");
		mapValues.put("4", "four");
		mapValues.put(null, "nullvalue");

		System.out.println(mapValues);
	}

	@Test
	public void putValuesLinkedHashMap() {
		Map<String, String> mapValues = new LinkedHashMap<>();
		mapValues.put("0", "zero");
		mapValues.put("1", "one");
		mapValues.put("5", "five");
		mapValues.put("4", "four");
		mapValues.put("3", "four");
		mapValues.put("2", "two");
		mapValues.put(null, "nullvalue");

		System.out.println(mapValues);
	}

	@Test
	public void putValuesHashTable() {
		Map<String, String> mapValues = new Hashtable<>();
		mapValues.put("0", "zero");
		mapValues.put("1", "one");
		mapValues.put("2", "two");
		mapValues.put("3", "three");
		mapValues.put("4", "four");
		mapValues.put("120", "four");
		// HashTable doesn't allow null keys because it is an old version HashMap is a new version
		// mapValues.put(null, "nullvalue");

		System.out.println(mapValues);
	}

	@Test
	public void putValuesTreeMap() {
		Map<String, String> mapValues = new TreeMap<>();
		mapValues.put("two", "2");
		mapValues.put("zero", "0");
		mapValues.put("one", "1");
		mapValues.put("three", "3");
		mapValues.put("four", "4");
		mapValues.put("four", "5");
		// TreeMap doesn't allow null keys
		// mapValues.put(null, "nullvalue");

		System.out.println(mapValues);
	}

	@Test
	public void sortHashMapByKeys() {
		Map<String, String> mapValues = new HashMap<>();

		mapValues.put("two", "2");
		mapValues.put("zero", "0");
		mapValues.put("one", "1");
		mapValues.put("three", "3");
		mapValues.put("four", "4");
		mapValues.put("four", "5");
		Map<String, String> sortedMap = new TreeMap<>(mapValues);
		System.out.println(mapValues);
		System.out.println(sortedMap);
	}

	@Test
	public void iteratorMap() {
		Map<String, String> mapValues = new HashMap<>();

		mapValues.put("two", "2");
		mapValues.put("zero", "0");
		mapValues.put("one", "1");
		mapValues.put("three", "3");
		mapValues.put("four", "4");
		mapValues.put("four", "5");

		Set<Map.Entry<String, String>> entries = mapValues.entrySet();

		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("---------------------------------------");
		// method 2
		mapValues.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
	}

	@Test
	public void sortMapByKeyWithComparator() {
		Map<Integer, String> mapValues = new HashMap<>();

		mapValues.put(100, "2");
		mapValues.put(101, "0");
		mapValues.put(123, "1");
		mapValues.put(134, "3");
		mapValues.put(897, "4");
		mapValues.put(135, "5");

		Map<Integer, String> sortedMapValues = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		sortedMapValues.putAll(mapValues);
		System.out.println(sortedMapValues);

		//using Java 8
		Map<Integer, String> sortedMapValues8 = new TreeMap<>((o1, o2) -> {
			return o1.compareTo(o2);
		});
		sortedMapValues8.putAll(mapValues);
		System.out.println(sortedMapValues8);
		//Descending
		Map<Integer, String> sortedMapValuesDesc = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		sortedMapValuesDesc.putAll(mapValues);
		System.out.println(sortedMapValuesDesc);

		//using Java 8
		Map<Integer, String> sortedMapValuesDesc8 = new TreeMap<>((o1, o2) -> {
			return o2.compareTo(o1);
		});
		sortedMapValuesDesc8.putAll(mapValues);
		System.out.println(sortedMapValuesDesc8);
	}

	@Test
	public void keyExistsInAMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("soma", "Naveen");
		map.put("sama", "Vinay");

		boolean b = map.containsKey("mama");
		System.out.println(map.get("soma"));

		System.out.println(b);
	}

	@Test
	public void getDefaultIfNoKey() {
		HashMap<String, String> map = new HashMap<>();
		map.put("soma", "Naveen");
		map.put("sama", "Vinay");

		System.out.println(map.getOrDefault("mama", "Sorry Key Not Found"));
	}

	@Test
	public void getAllKeys() {
		HashMap<String, String> map = new HashMap<>();
		map.put("soma", "Naveen");
		map.put("sama", "Vinay");
		//approach 1
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> value : set)
			System.out.println(value.getKey());

		//second approach 
		Set<String> set2 = map.keySet();
		System.out.println("Keys: " + set2);
	}

	@Test
	public void getAllValues() {
		HashMap<String, String> map = new HashMap<>();
		map.put("soma", "Naveen");
		map.put("sama", "Vinay");
		//approach 1
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> value : set)
			System.out.println(value.getValue());

		//second approach 
		Collection<String> set2 = map.values();
		System.out.println("Values: " + set2);
	}

	@Test
	public void computeIfAbscent() {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		Map<Integer, List<String>> map = new HashMap<>();
		list1.add("nav");
		list1.add("sam");
		list1.add("mam");
		list1.add("fam");

		list2.add("nav");
		list2.add("sam");
		list2.add("mam");
		list2.add("fam");

		map.put(1, list1);
		map.put(2, list2);
		newElement(map, 2, "soma");
		newElement(map, 2, "success");
		newElement(map, 3, "drama");

		System.out.println(map.get(2));
		System.out.println(map.get(3));

	}

	public void newElement(Map<Integer, List<String>> map, Integer K, String V) {
		List<String> list = map.getOrDefault(K, new ArrayList<>());
		list.add(V);
		map.put(K, list);
	}

	@Test
	public void removeEntryIfNoValue() {
		Map<String, List<String>> map = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list2.add("e");
		map.put("0", list1);
		map.put("2", list2);
		System.out.println("Before :" + map.get("2"));
		//We will get concurrent Exception If we try to modify a collection while iterating It.
		//To avoid this we will use method "computeIfPresent"
		map.computeIfPresent("2",
				(key, valueList) -> valueList.removeIf(value -> value.equalsIgnoreCase("e")) && valueList.isEmpty()
						? null
						: valueList);
		System.out.println("After :" + map.get("2"));
	}

	@Test
	public void enumMap() {
		EnumMap<DaysEnum, Integer> enumMap = new EnumMap<>(DaysEnum.class);
		enumMap.put(DaysEnum.Monday, DaysEnum.Monday.getValue());
		enumMap.put(DaysEnum.Tuesday, DaysEnum.Tuesday.getValue());
		enumMap.put(DaysEnum.Thrusday, DaysEnum.Thrusday.getValue());

		System.out.println(enumMap);
	}

}
