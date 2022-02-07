//5.Write a program to check if a string is a palindrome or not

package com.capg.stringassgn;
import java.util.*;
public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string:- ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		int len = str.length();
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			if (ch[i] == ch[j]) {
				j--;

			} else {
				System.out.println("Not a Palindrome String.");
				return;
			}

		}
		System.out.println("Palindrome String.");
	}
}
