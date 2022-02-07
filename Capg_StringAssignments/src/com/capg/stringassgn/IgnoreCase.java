//11.Write a program check if two strings are the same ignoring their cases

package com.capg.stringassgn;

import java.util.*;

public class IgnoreCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String:- ");
		String str1 = sc.nextLine();
		System.out.print("Enter 2nd String:- ");
		String str2 = sc.nextLine();
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Two Strings are equal");
		} else {
			System.out.println("Two Strings are not equal");
		}
	}
}
