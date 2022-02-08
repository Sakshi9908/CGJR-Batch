package com.capg.day9;
import java.util.*;

interface CombineString{
	public String combineString(String str1, String str2);
}
public class LambdaToCombineStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CombineString cs =(str1,str2) ->{
			
			return str1.concat(str2);
		};
		System.out.println("Enter String1: ");
		String str1 = sc.next();
		System.out.println("Enter String2: ");
		String str2 = sc.next();
		
		System.out.println("After Concatenation: " +cs.combineString(str1, str2));
		sc.close();
	}
}
