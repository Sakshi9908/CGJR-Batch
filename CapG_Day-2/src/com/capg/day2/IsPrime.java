package com.capg.day2;

import java.util.Scanner;

public class IsPrime {
	public static void Is_Prime(int num) {
		boolean result = true;
		if (num <= 1) {
			System.out.println("Not a prime number");
			return;
		}
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				System.out.println("Not a prime number");
				return;
			}
		}
		if (result == true) {
			System.out.println("Not a prime number");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number to check Prime or not :- ");
		int num = sc.nextInt();
		Is_Prime(num);

	}

}

