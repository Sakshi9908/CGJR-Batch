package com.capg.day3;

class Aa {

//Constructor --it will have the same name as class
//it is called automatically when object is created	 
	Aa() {
		System.out.println("A Constrcutor");
	}
//git testing 

	// git new code
	public int a = 10;

	public void printA() {
		System.out.println("I am class A");
	}

}

//class keyword  extends keyword  class name

//child class
//sub class
class bb extends Aa {
	public int b = 20;

	public void printB() {
		System.out.println("i m class B");
	}

	bb() {
		// calling the A class Constructor
		// super will be first statement
		super();
		System.out.println("B class Constructor");
		super.printA();

	}

}

public class SingleInheritance {

	public static void main(String args[]) {
		// using the class B
		bb b = new bb();
		b.printB();
		b.printA();
		System.out.println("B Blongs to A class " + b.a);
		System.out.println("B blongs to B class " + b.b);

	}

}
