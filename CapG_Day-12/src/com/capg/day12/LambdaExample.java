package com.capg.day12;
import java.util.*;
interface MyInterface{
	String reverseString(String str);
}

public class LambdaExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MyInterface rev =(str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result += str.charAt(i);
			}
			return result;
		};
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		System.out.println("Reversed String: " +rev.reverseString(str));
	}
}
