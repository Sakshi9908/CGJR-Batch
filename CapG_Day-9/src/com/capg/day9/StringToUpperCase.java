package com.capg.day9;
import java.util.*;

interface StrToUpper{
	public String UpperCase(String str);
}
public class StringToUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String for Interface: ");
		String s = sc.next();
		StrToUpper uc =(str) ->{
			
			return s.toUpperCase();
		};
		System.out.println("String in Upper case is: "+ uc.UpperCase(s));
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter a String: ");
		String s1 = sc.next();
		StringToUpper(s1);
		sc.close();
	}
	
	public static void StringToUpper(String str) 
	{
		System.out.println("String in Upper case is: "+str.toUpperCase());
	}
}
