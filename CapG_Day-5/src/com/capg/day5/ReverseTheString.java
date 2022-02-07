package com.capg.day5;

public class ReverseTheString {
	public static void main(String[] args) {
		String str = "Sakshi Shah";
		int len = str.length();
		// str = str.reverse(); this is not valid.
		System.out.print("Printing the original string :- " + str + "\n");

		// Method-1 :-> Using the "Reverse" Method:-
		StringBuffer str1 = new StringBuffer(str); // Buffer reader this is mutable but original string is not

		System.out.print("Printing the reverse string :- ");
		System.out.println(str1.reverse()); // Using the reverse method,you can't use the reverse method on immutable
											// String

		// Method-2 :-> Without using the "Reverse Method":-
		System.out.println("-------------------------------------------------------------------");
		// Without using the reverse() method :-
		String s1 = "Sanjal", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println(s1); // Example word

		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);

		// Method-3 :->
		System.out.println("-------------------------------------------------------------------");
		String input = "Reverse String";
		System.out.println("Original String:- " + input);

		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();
		System.out.println("Reverse String:- ");

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);

	}
}
