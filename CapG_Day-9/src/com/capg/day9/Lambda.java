package com.capg.day9;


/*
 Lambda
 - top to bottom approach
 - java 1.8 feature
 - stream API
 - 
 
 */
interface MyCode1 {
	public void print();
}

interface MySum1 {
	public void sum(int a, int b);
}

interface EvenOrOddnum1 {
	public String findValue(int num);
}

public class Lambda {
	public static void main(String args[]) {
		// storing the value into a variable
		int a = 10;
		int b = 10;
		System.out.println(a);

		// java 8 allows to store code(Function) into a variable
		// pass the function to java code
		// type is not allowed bcoz it is storing in variable(Access modifier)
		// remove return type, it will automatically understand
		// method name- add lambda with method name i.e. ->
		// remove method name bcoz we will not call it
		// if u have lambda on rightside u must have an interface
		MyCode1 code = () -> System.out.println("My method");
		// execute code late
		code.print();

		MySum1 sum = (x, z) -> {
			int c = x + z;
			System.out.println(c);
		};
		sum.sum(10, 20);

		//
		EvenOrOddnum1 evenOrOddnum = (num) -> {
			if (num % 2 == 0) {
				return "Even " + num;
			} else {
				return "Odd " + num;
			}

		};
		System.out.println(evenOrOddValue1(10));
		System.out.println(evenOrOddnum.findValue(b));

	}

	public static String evenOrOddValue1(int a) {
		if (a % 2 == 0) {
			return "Even " + a;
		} else {
			return "Odd " + a;
		}

	}

	public void sum1(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void print() {
		System.out.println("My method");

	}

}
