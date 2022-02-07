package com.capg.arrays;
import java.util.*;
public class LargeSmallArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Aarray elements you are going to enter:- ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		System.out.println("Enter " + num + " array elements");

		// Taking input from user
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0], smallest = arr[0];

		// Finding largest and smallest element
		for (int i = 1; i < num; i++) {
			if (arr[i] > arr[0]) {
				largest = arr[i];
				// return;
			}
			if (arr[i] < arr[0]) {
				smallest = arr[i];
				// return;
			}
		}

		// Printing Largest and Smallest Element in an Array
		System.out.println("Largest element:- " + largest);
		System.out.println("Smallest element:- " + smallest);

	}

}
