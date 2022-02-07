package com.capg.stringassgn;

//2.Write a program to reverse the words from the given string sentence

import java.util.*;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your strings:- ");
		String sentence = sc.nextLine();
		String reverseString = "";

		String[] wordLs = sentence.split("\\s");
		for (int i = 0; i < wordLs.length; i++) {
			String word = wordLs[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord += word.charAt(j);
			}
			reverseString += reverseWord + " ";
		}
		System.out.print("Reversed String:- ");
		System.out.println(reverseString);

	}

}
