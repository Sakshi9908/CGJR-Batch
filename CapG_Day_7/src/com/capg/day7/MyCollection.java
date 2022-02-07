package com.capg.day7;

import java.util.*;

//Collection is set of different implementations
//like stack, arrays, linkedlist, queue
//we store data in collection
//becomes easy to insert, update, delete, sort and other operations
//Collection is an interface
//Divided as SET and LIST
public class MyCollection {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>(); // creating the object of arraylist
		list.add("Sakshi");
		list.add(123);
		list.add(1.0f);
		list.add(1);

		// System.out.println(list); //directly prints with toString
		for (Object obj : list) {
			System.out.println(" " + obj.toString());
		}
		System.out.println(list.contains("Java"));
//		list.forEach(System.out::println);
		list.forEach(e -> System.out.println(e));
		System.out.println("Index is: " + list.indexOf("Sakshi"));
		System.out.println("Found: " + list.get(0));
		System.out.println("Is list Empty: " + list.isEmpty());
		// print of modifies all the values is iterator
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) { // returns true if there is next value
			// returns the current value
			System.out.println("Iterator: " + it.next()); // returns iterator for list
		}
		
		System.out.println("Size is: "+list.size());
		//Collections.sort(list);
	}
}