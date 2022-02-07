package com.capg.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Create Set with Integer element
//Create A Student class with(5 attribute)
//Create A set with Student
//Add the option

//add method
//Press 1 for insert

//remove index
//remove value
//Press 2 for delete

//replace
//
//Press 3 for Update
//Collections.Sort
//user defined data type
//Comparators

//Comparable
//Press 4 for sort ASC

//Colelctions.sort
//Collections.revseredOrder()
//Press 5 for sort DESC
//size()

//Press 6 for print the size
//Press 7 for Exit
//Press 8 for Sum of salary
//Press 9 for max salary
//Press 10 for min salary

//while(true)
//print
//scanner

//Employee data sort
//sort by id with Comparable
//implement the Comparable class
//Pass the Class which you are going to Sort as Generic parameters
//implement compareTo method
//integer
//if first value is > second //return 1
//if first value is < second //return -1
//if first value is == second //return 0;

//String 
//string.compareTO method to do it

class Employee implements Comparable<Employee> {
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private int id;
	private String name;
	private float salary;

	@Override

//
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		/*
		 * //if first value is > second //return 1
		 * 
		 * 
		 * if(this.salary>e1.getSalary()) { return 1; } //if first value is > second //
		 * -1 else if(this.salary<e1.getSalary()) { return -1; } //if first value is ==
		 * second // -1 else { return 0; }
		 */
		return this.name.compareTo(e1.getName());

	}

}

//Collections 

//Set
//set does not maintain the order
//duplicate element is not allowed

//HashSet--part of set
//it does not maintain order and does not contain duplicate 

//LinkedHashSet
//--duplicate not allowed 
//Maintain the order

//TreeSet
//it is sorting the data 
//duplicate is not allowed

//List
//List Maintain the order
//have any number of null and duplicate element

public class MySet {

	public static void main(String args[]) {
		// Without generic Class
		// EnumSet<Integer> es = new EnumSet<Integer>();

		// HashSet
		Set<Integer> s = new HashSet<Integer>();
		s.add(4);
		s.add(10);
		s.add(1);
		s.add(4);

		s.add(100);
		// clear the set
		s.clear();

		// find the data in set
		s.contains(10);

		// set is empty or not
		s.isEmpty();

		// remove using element
		s.remove(10);

		// return the size of set
		s.size();

		// convert set to object array
		Object array = (Object) s.toArray();

		Set st = new LinkedHashSet();
		st.add(4);
		st.add(10);
		st.add(1);
		st.add(4);
		st.add(100);

		Set sortedSet = new TreeSet();
		sortedSet.add(4);
		sortedSet.add(10);
		sortedSet.add(1);
		sortedSet.add(4);
		sortedSet.add(100);

		System.out.println("HashSet " + s);
		System.out.println("LinkedHashSet " + st);

		System.out.println("TreeSet " + sortedSet);

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(10, "Ansar", 101.0f));
		employeeList.add(new Employee(1, "Priya", 50.0f));
		employeeList.add(new Employee(2, "Kumar", 10.0f));
		employeeList.add(new Employee(100, "Anil", 5.0f));
		employeeList.add(new Employee(5, "Zee", 60.0f));
		System.out.println("Before sort");
		employeeList.forEach(System.out::println);
		System.out.println("After sort");
		Collections.sort(employeeList);

		/*
		 * if(choice==1) {
		 * 
		 * //Scanner sc=new //int //name //salary employeeList.add(new Employee(id,
		 * name, salary)); }
		 */
		employeeList.remove(0);
		int i = 0;
		for (Employee emp : employeeList) {
			if (emp.getName() == "Ansar") {
				employeeList.remove(i);
			}
			i++;
		}

		employeeList.forEach(System.err::println);

		/*
		 * Set<Employee> employeeSet=new LinkedHashSet<Employee>(); employeeList.add(new
		 * Employee(10, "Ansar", 100.0f)); employeeList.add(new Employee(1, "Priya",
		 * 100.0f)); employeeList.add(new Employee(2, "Kumar", 100.0f));
		 * employeeList.add(new Employee(100, "Anil", 100.0f)); employeeList.add(new
		 * Employee(5, "Zee", 100.0f)); employeeList.add(new Employee(100, "Anil",
		 * 100.0f)); employeeList.add(new Employee(5, "Zee", 100.0f));
		 * 
		 * employeeList.forEach(System.err::println);
		 */
	}

}