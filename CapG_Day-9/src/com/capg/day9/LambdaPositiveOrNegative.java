package com.capg.day9;
import java.util.*;
interface positiveOrNegative{
	public void num(int num);
}
public class LambdaPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		positiveOrNegative posornegnum = (num1) -> {
			if(num1<0) {
				System.out.println("Number is negative");
			}
			else if(num1>0) {
				System.out.println("Number is positive");
			}
			else {
				System.out.println("Number is zero");
			}
		};
		System.out.println("Enter a number: ");
		posornegnum.num(sc.nextInt());
		sc.close();
		
	}
}
