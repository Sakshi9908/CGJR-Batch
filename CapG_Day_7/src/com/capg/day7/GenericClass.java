package com.capg.day7;

//Generic class---
//We can pass the type of variable while creating the object
//X,Y,Z will contain the datatype
//Declare the class variable with given type
class Person<X, Y, Z> { // Generic class
	private X name;
	private Y id;
	private Z salary;

	public Person(X name, Y id, Z salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public X getName() {
		return name;
	}

	public void setName(X name) {
		this.name = name;
	}

	public Y getId() {
		return id;
	}

	public void setId(Y id) {
		this.id = id;
	}

	public Z getSalary() {
		return salary;
	}

	public void setSalary(Z salary) {
		this.salary = salary;
	}
	public void printPerson() {
		System.out.println("Name is: " +name);
		System.out.println("Id is: " +id);
		System.out.println("Salary is: "+salary);
	}

}

public class GenericClass {
	public static void main(String[] args) {

		// Person p = new Person("Sakshi",01,40000);
		// It dont take Primitive datatype so use Wrapper class
		// Generic class with parameter passing
		Person<String, Integer, Double> p1 = new Person<String, Integer, Double>("Sakshi", 01, 40000.00);
		p1.printPerson();
	}
}
