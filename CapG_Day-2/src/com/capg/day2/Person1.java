package com.capg.day2;

class Admin{
	String name;
	int age;
	char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}

public class Person1 {
	public static void main(String[] args ) {
		Admin A1 = new Admin();
		Admin A2 = new Admin();
		if(A1==A2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
 
}
