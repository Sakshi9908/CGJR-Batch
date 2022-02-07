package com.capg.day1;

public class FindEvenAndOddWtihRange {
	
	//need to find the even and odd between 1 to 100
	
	public static void main(String args[])
	{
		//break-it will stop execution of loop and proceed with next statement
		//continue-it will skip the current iteration and proceed with next iteration 
		for(int i=1;i<=20;i++)
		{
			
			if(i==10)
			{  //stop the loop and come outside of loop
				
				//it will skip the current loop start with next
				continue;
			}
			
		  if(i%2==0)
		  {
			System.out.println("Even "+i );  
		  }
		  else
		  {
	     System.out.println("ODD "+i);		  
		  }
		  String [] ls=new String[10];
		//  FindEvenAndOddWtihRange.main(ls);
		}
		 
		
		  return; 
	}
	

}
