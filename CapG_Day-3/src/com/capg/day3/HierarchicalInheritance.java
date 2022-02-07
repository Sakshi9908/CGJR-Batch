package com.capg.day3;

class Parent {
	public void printParent() {
		System.out.println("Parent class");
	}
}

class Child1 extends Parent {
	public void printChild() {
		System.out.println("Child1 class");
	}
}

class Child2 extends Parent {
	public void printChild() {
		System.out.println("Child2 class");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// first child
		Child1 ch1 = new Child1();
		ch1.printChild();
		ch1.printParent();

		// second child
		Child2 ch2 = new Child2();
		ch2.printChild();
		ch2.printParent();
	}

}