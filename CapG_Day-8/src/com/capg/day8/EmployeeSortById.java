package com.capg.day8;
import java.util.Comparator;
public class EmployeeSortById implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getId()>e2.getId())
		{
			return 1;
		}
		else if(e1.getId()<e2.getId())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}