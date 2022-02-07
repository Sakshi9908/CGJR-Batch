package com.capg.day6;

//static Inner class
//Anonymous inner class
//normal inner class


//there are two ways
//inner class as static
//you can access or create object with class name

//non static class
//you cannot create object outside the class
//create the object locally inside class
//call the method using that object anywhere in method

//when class contain any other class that is class inner class


//you cannot create object of interface
interface A
{
	//interface also can have member variable
	//which class implement the abstract method can access the member variable
int a=10;
public void print();	
}


class OuterClass {
	
	InnerClass innerClass=new InnerClass();
	// method of class
	public void printOuter() {
		System.out.println("Outer class");
		
		
		//create the object of this class in any local method
		
		innerClass.printInnerClass();
	}

	// inner class
	//it can be accessed with class name
	 class  InnerClass {
		public void printInnerClass() {
			System.out.println("Inner class");
		  
		}
	}



}

public class MyInnerClasses {
	
	public static void main(String args[])
	{
		//outer class object
		OuterClass outerClass=new OuterClass();
		outerClass.printOuter();
		//outerClass.print();
		//
		//InnerClass inner=new MyInnerClasses();
		
		//OuterClass.InnerClass inner=new OuterClass.InnerClass();
		//inner.printInnerClass();
		
		//Anonymous class
		//inner class 
		//because it does have any name
		A objA=new  A() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Anoymonus Inner class");
				System.out.println(a);
			}
		};
		
		objA.print();
	}

}
