package com.capg.day9;
import java.util.*;
interface Square{
	public void square(int a);
}
public class LambdaSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square sq =(a) -> {
			int result = a*a;
			System.out.println("Square is: " +result);
		};
		System.out.println("Enter a number: ");
		sq.square(sc.nextInt());
		sc.close();
	}
}
