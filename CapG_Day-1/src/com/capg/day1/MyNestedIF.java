package com.capg.day1;

//import is used to bring the already writtern code into our application
import java.util.Scanner;

public class MyNestedIF {

	public static void main(String arg[]) {

		// hardcode value
		// fix value

		// Scanner class

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int a = sc.nextInt();
		// reading the Int value
		System.out.println("Enter second value");
		System.out.println("enter int value");
		int b = sc.nextInt();
		System.out.println(b);

		// reading the float value
		System.out.println("enter int float");
		float f = sc.nextFloat();
		System.out.println(f);

		// reading the string value
		System.out.println("enter int string");
		String str = sc.next();
		System.out.println(str);

		// reading the full line
		System.out.println("enter int string");
		String str1 = sc.nextLine();
		System.out.println(str1);

		// sc.next
		// boolean
		// long
		// double

		// number should be positive
		if (a > 0) {
			// try to find even or odd number
			// try
			if (a % 2 == 0) {
				System.out.println("Number is Even");

			} else {
				System.out.println("Number is Odd");
			}

		} else {
			System.out.println("Number should be positive");
		}

	}

}
