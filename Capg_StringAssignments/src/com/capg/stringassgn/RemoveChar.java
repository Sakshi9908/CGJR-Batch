//4.Write a program to remove given characters from the string

package com.capg.stringassgn;

import java.util.*;

public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String:- ");
		String str = sc.nextLine();
		// System.out.println("your entered string:- "+str);

		StringBuffer str1 = new StringBuffer(str);
		System.out.println("your entered string:- " + str1);

		System.out.print("Enter char which you want to remove:- ");
		char ch = sc.nextLine().charAt(0);

		StringBuffer newStr = new StringBuffer();

		for (int i = 0; i < str1.length(); i++) {
			// System.out.print(str1.charAt(i)+"\n");

			if (str1.charAt(i) != ch) {
				newStr.append(str1.charAt(i));
			}

		}
		System.out.print("String after removing the character:- " + newStr);

	}
}
