package com.capg.day9;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int id;
	private float salary;
	
	Employee()
	{
		
	}
	
	public Employee(int id,String name,  float salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Id=" + id + ", salary=" + salary + "]";
	}

}

public class MyStreamEmployee {
	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee(01, "Sakshi", 30000f));
		ls.add(new Employee(02, "Suvidhee",5000f));
		ls.add(new Employee(03, "DIsha", 4000f));
		ls.add(new Employee(04, "Smita", 50000f));
		ls.add(new Employee(05, "Sanjal", 6000f));
		
		
		List<Employee> filterEmp = ls.stream().filter(e->e.getSalary()>=5000).collect(Collectors.toList());
		filterEmp.forEach(e->System.err.print(e));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		List<String> filterEmpUpperCase = ls.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		filterEmpUpperCase.forEach(e->System.out.println(e));
	
		
		//IntSummaryStatistics state = ls.stream().mapToInt(e->System.out.pritnln(e));
	
	
		//Sorting algo is not there so gives error
		//List<Employee> ls1 = ls.stream().sorted().collect(Collectors.toList());
		//ls.forEach(System.out::println);
	
	}
}
