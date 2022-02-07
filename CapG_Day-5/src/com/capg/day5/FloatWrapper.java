package com.capg.day5;

public class FloatWrapper {
	public static void main(String[] args) {
		//float f = 12.0f;
		@SuppressWarnings("deprecation")
		Float f = new Float(12.0f);
		System.out.println("Value of wrapped float object f:- " + f);

		// Converting the float value into int:-
		int i = f.intValue();
		System.out.println("int value of Float object, f : " + i);
		System.out.println("Size of int i:- "+(Integer.SIZE/8));

		// Converting float the float value into long:-
		long l = f.longValue();
		System.out.println("long value of Float object, f : " + l);
		System.out.println("Size of long i:- "+(Long.SIZE/8));
		
		
		
	}

}
