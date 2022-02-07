package com.capg.day5;

import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args) {
		int num_of_chars = 256;
		int[] charArray = new int[num_of_chars];
		
        System.out.print("Enter your string:-");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			charArray[s.charAt(i)]++;
			System.out.println(charArray[s.charAt(i)]);
		}

		for (int i = 0; i < num_of_chars; i++) {
			if (charArray[i] > 1) {
				System.out.println((char) (i));
			}

		}
	}
}