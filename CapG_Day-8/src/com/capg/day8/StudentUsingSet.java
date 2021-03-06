package com.capg.day8;

import java.util.*;

class Student {

	int rollno;
	String firstName, lastName, school;

	public Student(int rollno, String firstName, String lastName, String school) {
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.school = school;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + rollno + ", First Name=" + firstName + ", Last Name= " + lastName + ", School= "
				+ school + "]";
	}

}

public class StudentUsingSet {
	public static void main(String args[]) {
		int roll;
		String fname, lname, school;
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> s = new ArrayList<Student>();

		while (true) {
			System.out.println("Enter 1 to Insert");
			System.out.println("Enter 2 to Delete");
			System.out.println("Enter 3 to Update");
			System.out.println("Enter 4 to Sort asc");
			System.out.println("Enter 5 Sort Desc");
			System.out.println("enter 6 to print the size");
			System.out.println("enter 7 to Display");
			System.out.println("Enter 8 to Exit");
			System.out.println("--------------------------------------------------");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the Number of Students you want to enter: ");
				int size = sc.nextInt();
				System.out.println("--------------------------------------------------");
				for (int i = 0; i < size; i++) {
					System.out.println("Enter Roll No: ");
					roll = sc.nextInt();
					System.out.println("Enter First Name: ");
					fname = sc.next();
					System.out.println("Enter Last Name: ");
					lname = sc.next();
					System.out.println("Enter School Name: ");
					school = sc.next();
					s.add(new Student(roll, fname, lname, school));
				}

			} else if (choice == 2) {
				boolean found = false;
				System.out.println("-----------------------------------------------------");
				System.out.println("Enter RollNo to Delete :");
				roll = sc.nextInt();
				Iterator<Student> i = s.iterator();
				while (i.hasNext()) {
					Student s1 = i.next();
					if (s1.getRollno() == roll) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not found");

				} else {
					System.out.println("Record is deleted successfully");
					System.out.println("------------------------------------------------");
				}
			} else if (choice == 3) {
				boolean found = false;
				System.out.println("-----------------------------------------------------");
				System.out.println("Enter RollNo to Update :");
				roll = sc.nextInt();
				ListIterator<Student> li = s.listIterator();
				while (li.hasNext()) {
					Student s1 = li.next();
					if (s1.getRollno() == roll) {
						System.out.println("Enter New FirstName: ");
						fname = sc.next();
						System.out.println("Enter New LastName: ");
						lname = sc.next();
						System.out.println("Enter New School Name: ");
						school = sc.next();
						li.set(new Student(roll, fname, lname, school));
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not found");

				} else {
					System.out.println("Record is updated successfully");
					System.out.println("------------------------------------------------");
				}
			} else if (choice == 4) {
					s.sort(null);
			} else if (choice == 5) {

			} else if (choice == 6) {
				System.out.println("Size = " + s.size());
			} else if (choice == 7) {
				Iterator<Student> it = s.iterator();
				while (it.hasNext()) {

					Student student = (Student) it.next();

					System.out.println(student);

				}
				System.out.println("List is empty");
				System.out.println("------------------------------------------------");
			} else if (choice == 8) {
				System.out.println("Exit");
				break;
			} else {
				System.out.println("Enter number between 1 to 7 :");
			}

		}

	}
}