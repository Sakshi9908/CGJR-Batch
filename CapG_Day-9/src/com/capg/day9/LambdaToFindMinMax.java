package com.capg.day9;

import java.util.*;

interface FindMin {
	public int findMin(int a, int b, int c);
}
interface FindMax{
	public int findMax(int x, int y, int z);
}
public class LambdaToFindMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int c = sc.nextInt();

		FindMin min = (num1, num2, num3) -> {
			if (num1 < num2 && num1 < num3) {
				return num1;
			} else if (num2 < num1 && num2 < num3) {
				return num2;
			} else {
				return num3;
			}
			
		};
		
		
		FindMax max = (n1, n2, n3) -> {
			if (n1 > n2 && n1 > n3) {
				return n1;
			} else if (n2 > n1 && n2 > n3) {
				return n2;
			} else {
				return n3;
			}
			
		};
		System.out.println("Minimum value is: " +min.findMin(a,b,c));
		System.out.println("Maximum value is: " +max.findMax(a,b,c));
		sc.close();
	}
}
