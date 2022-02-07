package com.capg.day2;

public class LargestUsingArray {
	public static void main(String[] args) {
		int arr[] = { 10, 100, 150, 40, 50, 60 };
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest number in the array is :- " + largest);

	}

}
