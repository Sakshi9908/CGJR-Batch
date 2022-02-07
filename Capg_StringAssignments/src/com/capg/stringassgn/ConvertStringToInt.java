//6.Write a program to convert String to Integer

package com.capg.stringassgn;

import java.util.*;

public class ConvertStringToInt {
	public static void main(String[] args) {
		int decimalExample = Integer.parseInt("20");
		System.out.println(decimalExample);

		int signedPositiveExample = Integer.parseInt("+20");
		System.out.println(signedPositiveExample);

		int signedNegativeExample = Integer.parseInt("-20");
		System.out.println(signedNegativeExample);

		int radixExample = Integer.parseInt("20", 16);
		System.out.println(radixExample);

	}
}
