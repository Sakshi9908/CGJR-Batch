package com.capg.day2;

import java.util.Scanner;

public class Smallest_GreatestNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of element you are going to enter :- ");
		int count = sc.nextInt();

		if (1 <= count && count <= 20) {
			int[] arr = new int[count];
			System.out.println("Enter Your "+count+" elements:- ");
			
			for(int i=0;i<count;i++) {
				arr[i] = sc.nextInt();
			}
			int Max=arr[0], Min=arr[0];
			
			for(int i=1;i<count;i++) {
				if(arr[i]>Max) {
					Max = arr[i];
				}
				
				if(arr[i]<Min) {
					Min= arr[i];
				}
			}
			System.out.println("MIN="+Min);
			System.out.println("MAX="+Max);

		}
		else {
			System.out.println("INVALID_INPUT");
		}

	}
}
