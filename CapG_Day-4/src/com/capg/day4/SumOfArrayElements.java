package com.capg.day4;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of array elements you are going to enter:- ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter your " + num + " elements");

		// Taking input form user:-
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		// Performing Summation operation:-
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of array elements:- " + sum);
	}

}
