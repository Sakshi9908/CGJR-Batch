package com.capg.day1;

public class MySwitch {

	public static void main(String args[]) {

		int a = 2;
		switch (a) {
		case 1:
			System.out.println("Sun");
			// Any number of statement
			break;
		case 2:
			System.out.println("Mon");
			break;

		case 3:
			System.out.println("Tue");
			break;

		case 4:
			System.out.println("Wed");
			break;

		default:
			System.out.println("Unknown days");
			break;

		}

	}

}
