package com.capg.day3;

class Shape {

	public void drawShape() {
		System.out.println("Draw Shape");
	}

}

class Line extends Shape {
	public void drawShape() {
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void drawShape() {
		System.out.println("Circle");
	}
}

public class Polymorphism {

	public static void main(String args[]) {
		// Parent class // child class
		// parent class hold the object of child class
		Shape s = new Circle();
		s.drawShape();
		Shape c = new Shape();
		c.drawShape();

		// Circle c = new Shape(); //This is not valid you can't give
		// Base class object to child class reference.
	}
}
