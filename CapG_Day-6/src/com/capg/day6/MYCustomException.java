package com.capg.day6;
import java.util.*;


//create a class
//extends Exception class

//throws  --this is use throw the exception at method level
//throw   --use the throw the user defined exception
class OnlyPostiveNumberAllowed extends Exception
{

	public OnlyPostiveNumberAllowed(String msg)
	{
		//super keyword used to initialization the parent class constructor
		//way to call parent class constructor
		super(msg);
	}
	
}



public class MYCustomException {
	
	//exception at method level
	//compiler is not catching this exception
	public static void main(String[] args) throws Exception
	{
		//Need to find the even and off from positive number
	    Scanner sc=new Scanner(System.in);
	    
	    int number =sc.nextInt();
	    
	    //OnlyPostiveNumberAllowed
	    //
	    if(number>0)
	    {
	    	//even off logic will come
	    }
	    else
	    {
	    	//System.out.println("Only Positive Number are allow");
	    	//to use throw keyword
	    throw new OnlyPostiveNumberAllowed("Only Positive Number are allowed");	
	    }
	}

}
