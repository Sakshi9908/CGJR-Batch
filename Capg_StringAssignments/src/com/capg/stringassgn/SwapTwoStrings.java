// 1. Write a program to swap two strings without using the third variable.

package com.capg.stringassgn;

import java.util.*;

public class SwapTwoStrings {
	public static void main(String[] args) {
		String s1 = "Sakshi";
		String s2 = "Shah";
		System.out.println("Printing two strings without Swaping :-");
		System.out.println("First String:- " + s1 + "\n" + "Second String:- " + s2);

		// Logic to swap two strings without using the 3rd variable
		s1 = s1 + s2;
		System.out.println();

		// s2 = s1-s2; --> this is illegal you can add(Concantinate) two strings but
		// can't subtract
		int len1 = s1.length() - s2.length();

		// Using str.substring(); method for swapping :-
		s2 = s1.substring(0, len1);
		s1 = s1.substring(s2.length());
		System.out.println("Printing two strings After Swaping :-");
		System.out.println("First String:- " + s1 + "\n" + "Second String:- " + s2);
	}

}
