package com.capg.day1;

//Rule 1 --it should use the inheritance concept
//Rule 2 --Method name in the parent and child class should be same 
// You must create object of child 

//method --we have same method in parent and child class and we override parent class method by creating child class object

class A {
	A() {
		System.out.println("I am A constrcuttor");
	}

	public void print() {
		System.out.println("I am A class");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B constructor");

	}

	@Override
	public void print() {
		System.out.println("I am B class");
		// super.print();
	}
}

public class MethodOverLoading {

	public static void main(String args[]) {
		A obj = new B();
		obj.print();
	}

}
