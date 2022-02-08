package com.capg.day9;

import java.util.*;
interface StringLength{
	public int length(String str);
}
public class StringLengthUsingLambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		StringLength sl = (str) ->{
			int count =0;
			for(int i=0;i<s.length();i++) {
				count++;
			}
			return count;
		};
		System.out.println("String is: "+s);
		System.out.println("String Length is: "+sl.length(s));
		sc.close();
	}
}
