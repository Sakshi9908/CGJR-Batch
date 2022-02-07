package com.capg.day2;
import java.util.Scanner;

public class CarRace {
	public static int race(int num) {
		if(0<num &&  num>32767) {
			return -1;
			
		}
		else {
			int rem,temp,product=1;
			temp=num;
			while(num!=0) {
				rem=num%10;
				product = product*rem;
				num=num/10;
			}
			return product;
		}
		//return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = race(num);
		if(result==-1) {
			System.out.println("Invalid Input");
		}
		else {
			System.out.println(result);
		}
	
	}

}
