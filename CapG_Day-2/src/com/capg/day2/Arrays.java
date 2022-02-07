package com.capg.day2;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		// Initializing an array Element
		arr[0] = 50;
		arr[1] = 100;
		arr[2] = 200;
		arr[3] = 300;
		arr[4] = 400;

		// Printing Array Elements:-
		for (int a : arr) {
			System.out.println(a);

		}
		System.out.println("------------------------------------------------------------");

		// Taking user input:-
		System.out.println("Enter 5 array elements:- ");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();

		}

		// Printing Array Elements:-
		System.out.println("Printing your entered 5 elements:- ");
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);

		}

	}

}
