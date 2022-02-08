package com.capg.day9;

interface StringArray{
	public void print();
}

public class StringArrayUsingLambda {
	public static void main(String[] args) {
		StringArray string =() ->{
			String[] str = {"Sakshi", "Disha", "Smita", "Suvidhee"};
			for(int i=0; i<str.length;i++) {
				System.out.println(str[i]);
			}
		};
		string.print();
	}
}
