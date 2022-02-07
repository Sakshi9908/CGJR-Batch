package com.capg.arrays;

import java.util.*;

public class AvgPercantOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of array elements to enter:- ");
		int num = sc.nextInt();

		System.out.println("Enter your " + num + " elements: ");
		int arr[] = new int[num];

		// Taking input form user:-
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		// Performing Summation operation:-
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i];
		}
		float len = arr.length;
		System.out.println("Average of array elements is:- " + sum / len);
		sc.close();

	}

}
