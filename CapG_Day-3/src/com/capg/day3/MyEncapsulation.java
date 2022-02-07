package com.capg.day3;

class Employee {
	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
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

	private int empID;
	private String name;
	private float salary;

}

public class MyEncapsulation {
	public static void main(String args[]) {
		Employee employee = new Employee(1001, "Sakshi", 10000);// their name , id , salary
		System.out.println(employee.getEmpID()); // employee.empID; //it is visible
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}

}
