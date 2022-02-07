//7.Write a program to count the occurrence of the given character in a string

package com.capg.stringassgn;

import java.util.*;

public class CountCharOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String:- ");
		StringBuffer str1 = new StringBuffer(sc.nextLine());

		System.out.print("Enter char which you want to find how many times occur:- ");
		char ch = sc.nextLine().charAt(0);

		// logic to find how many times char occurs:-
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ch) {
				count++;

			}

		}
		System.out.println("The character " + ch + " Occurs " + count + " times");
	}

}
