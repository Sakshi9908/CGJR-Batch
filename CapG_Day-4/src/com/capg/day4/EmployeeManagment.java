package com.capg.day4;

import java.util.*;

class Employee {
	private String name;
	private int id;
	private int salary;

	Employee() {

	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeM [Name=" + name + ", Id=" + id + ", Salary=" + salary + "]";
	}

	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class EmployeeManagment {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		Employee[] emp = {};

		while (true) {

			System.out.println("1. Create a List of Employee");
			System.out.println("2. Display a List of Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete an Employee");
			System.out.println("5. Sort the Employee BY Name");
			System.out.println("6. Sort the Employee ASC By Id");
			System.out.println("7. Minimun paid salary employee");
			System.out.println("8. Maximum salary of employee");
			System.out.println("9. Average of employee Salary");
			System.out.println("10. Sum of employee Salary");
			System.out.println("11. Exit");
			System.out.println("------------------------------------------------------------------------");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter the Number of Employees you want to enter: ");
				int s = sc.nextInt();
				emp = new Employee[s];
				for (int i = 0; i < s; i++) {

					System.out.println("Enter Name of Employee: " + i);
					String name = sc.next();
					System.out.println("Enter Id of Employee ");
					int id = sc.nextInt();
					System.out.println("Enter Salary of Employee ");
					int salary = sc.nextInt();
					emp[i] = new Employee(name, id, salary);
				}

			}
			if (choice == 2) {
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
						System.out.println("------------------------------------------------------------");
					}
				}
			}
			if (choice == 3) {
				System.out.println("Enter Name you want to search: ");
				String name = sc.next();
				boolean flag = true;
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getName().equalsIgnoreCase(name)) {
						System.out.println("Employee Found \t" + emp[i].toString());
						System.out.println("-------------------------------------------------------------");
						flag = false;
						break;

					}
				}
				if (flag) {
					System.out.println("Record not Found");
				}

			}
			

			if (choice == 5) {
				Employee temp;
				for (int i = 0; i < emp.length - 1; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if ((emp[i].getName().compareTo(emp[j].getName())) < 0) {
							temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				System.out.println("Sorted employees by Name are:");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
				System.out.println("------------------------------------------------------------");
			}

			if (choice == 6) {
				Employee temp;
				for (int i = 0; i < emp.length - 1; i++) {
					for (int j = i + 1; j < emp.length; j++) {
						if (emp[i].getId() > emp[j].getId()) {
							temp = emp[i];
							emp[i] = emp[j];
							emp[j] = temp;
						}
					}
				}
				System.out.println("Sorted employees in ASC by ID are:");
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getId() != 0) {
						System.out.println(emp[i]);
					}
				}
				System.out.println("------------------------------------------------------------");
			}

			if (choice == 7) {
				double min = emp[0].getSalary();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getSalary() < min) {
						min = emp[i].getSalary();
					}
				}
				System.out.print("Minimum salary paid to employee is: " + min);
				System.out.println("------------------------------------------------------------");
			}

			if (choice == 8) {
				double max = emp[0].getSalary();
				for (int i = 0; i < emp.length; i++) {
					if (emp[i].getSalary() > max) {
						max = emp[i].getSalary();
					}
				}
				System.out.print("Maximum salary paid to employee is: " + max);
				System.out.println("------------------------------------------------------------");
			}

			if (choice == 9) {
				double sum = 0, avg;
				for (int i = 0; i < emp.length; i++) {
					sum += emp[i].getSalary();
				}
				avg = sum / emp.length;
				System.out.printf("Average of salaries of all employees is: %.3f", avg);
				System.out.println("------------------------------------------------------------");
			}
			if (choice == 10) {
				double sum = 0;
				for (int i = 0; i < emp.length; i++) {
					sum += emp[i].getSalary();
				}
				System.out.printf("Sum of salaries of all employees is: %.3f", sum);
				System.out.print("\nPress enter to continue.");
				System.out.println("------------------------------------------------------------");
				sc.nextLine();
				sc.nextLine();
			}

			if (choice == 11) {
				break;
			}
		}
		sc.close();
		return;
	}
}
