package com.capg.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparatorExample {
	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(10, "Ansar", 101.0f));
		ls.add(new Employee(1, "Priya", 50.0f));
		ls.add(new Employee(2, "Kumar", 10.0f));
		ls.add(new Employee(100, "Anil", 5.0f));
		ls.add(new Employee(5, "Zee", 60.0f));
		
		Collections.sort(ls, new EmployeeSortById());
		
		ls.forEach(System.out::println);
	}
}