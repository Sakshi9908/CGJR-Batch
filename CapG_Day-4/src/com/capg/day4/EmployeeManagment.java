package com.capg.day4;

import java.util.*;

class EmployeeM {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeM [name=" + name + ", iD=" + iD + ", salary=" + salary + "]";
	}

	EmployeeM()
	{
		
	}
	
	public EmployeeM(String name, int iD, int salary) {
		super();
		this.name = name;
		this.iD = iD;
		this.salary = salary;
	}
	private String name;
	private int iD;
	private int salary;

}

public class EmployeeManagment {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		EmployeeM[] emp= {};

		while (true) {

			System.out.println("Enter 1 for create a List of employee");
			System.out.println("Enter 2 for Display a List of employee");
			System.out.println("Enter 3 for search employee");
			System.out.println("Enter 4 for delete a employee");
			System.out.println("Enter 6 Sort the Employee ASC BY Name");
			System.out.println("Enter 7 Sort the Employee ASC By Name");
			System.out.println("Enter 8 Sort the Employee ASC BY Salary");
			System.out.println("Enter 9 Sort the Employee ASC By Salary");
			System.out.println("Enter 10 Minimun paid salary employee");
			System.out.println("Enter 11 maximum salry of employee");
			System.out.println("Enter 12 Avg of employee Salary");
			System.out.println("Enter 13 Sum of employee Salary");
			
			System.out.println("enter 5 for exit");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter the Number of Employee you want to enter");
				int size = sc.nextInt();
				emp=new EmployeeM[size];
				for (int i = 0; i < size; i++) {
					
					System.out.println("Enter name Employee "+i);
					String name=sc.next();
					System.out.println("Enter Id Employee "+i);
					int id=sc.nextInt();
					System.out.println("Enter Salary Employee "+i);
					int salary=sc.nextInt();
                 emp[i]=new EmployeeM(name,id,salary); 
				}

			}
			if(choice==2)
			{
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i].getiD()!=0)
					{
					System.out.println(emp[i]);
					}
				}
			}
			if(choice==3)
			{
				System.out.println("Enter name which you want to search");
				String name=sc.next();
				boolean flag=true;
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i].getName().equalsIgnoreCase(name))
					{
						System.out.println("Employee Found "+emp[i].toString());
						flag=false;
						break;
						
					}
				}
				if(flag)
				{
					System.out.println("Record not Found");
				}
				
			}
			if(choice==4)
			{
				boolean deleteFlag=true;
				for(int i=0;i<emp.length;i++)
				{
					System.out.println(emp[i]);
				}
				System.out.println("Enter the id for which you want to delete the employee");
				int id=sc.nextInt();
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i].getiD()==id)
					{
						System.out.println("Deleting record "+emp[i].toString());
						emp[i]=new EmployeeM();
						deleteFlag=false;
						break;
						
					}
				}
				if(deleteFlag)
				{
					System.out.println("No Matching Id found");
				}
				
			}
			if (choice == 5) {
				break;
			}

		}
	}
}
