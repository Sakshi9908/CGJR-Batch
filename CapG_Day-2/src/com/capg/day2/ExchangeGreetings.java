package com.capg.day2;

import java.util.Scanner;

public class ExchangeGreetings {
	public static int handshake(int num) {
		if(num==1) {
			return 0;
			
		}
		if(num==2) {
			return 1;
		}
		 return (num-1) +handshake(num-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of handshake :- ");
		int count = sc.nextInt();
		for(int i=1; i<=count;i++) {
			int result = handshake(i);
			System.out.println("handshake("+i+")="+result);
		}
		
	}

}
