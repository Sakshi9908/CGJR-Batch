package com.capg.day9;
import java.util.*;

interface FindAverage{
	public int findAverage(int a, int b, int c);
}

interface FindSum{
	public int findSum(int x, int y, int z);
}
public class LambdaToAverageAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number to find average: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number to find average: ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number to find average: ");
		int c = sc.nextInt();
		
		FindAverage avg =(num1,num2,num3) ->{
			int result = (num1+num2+num3)/3;
			return result;
		};
		System.out.println("Average of 3 number is: " + avg.findAverage(a, b, c));
		System.out.println("--------------------------------------------------------");
		System.out.println("Enter 1st number to find sum: ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd number to find sum: ");
		int y = sc.nextInt();
		System.out.println("Enter 3rd number to find sum: ");
		int z = sc.nextInt();
		FindSum sum =(n1,n2,n3) ->{
			int Sum = n1+n2+n3;
			return Sum;
		};
		System.out.println("Sum of 3 number is: " +sum.findSum(x, y, z));
		sc.close();
	}

}
