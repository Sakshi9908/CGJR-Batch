package com.capg.day9;

import java.util.*;

interface CharToAscii {
	public void charToAscii(char ch);
}

public class LambdaCharToAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CharToAscii ctoa = (c) -> System.out.println((int) c);
		System.out.println("Enter a charachter: ");
		//System.out.println("Ascii value is: ");
		ctoa.charToAscii(sc.next().charAt(0));
		sc.close();

	}
}
