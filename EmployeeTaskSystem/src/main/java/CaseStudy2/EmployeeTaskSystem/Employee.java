package CaseStudy2.EmployeeTaskSystem;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private String designation;
	private String password;
	private Employee superior;
	private Rating rating;
	List<Task> taskList;
	List<Attendance> AttendanceList;
	public Employee() {
		super();
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee getSuperior() {
		return superior;
	}
	public void setSuperior(Employee superior) {
		this.superior = superior;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	public List<Attendance> getAttendanceList() {
		return AttendanceList;
	}
	public void setAttendanceList(List<Attendance> AttendanceList) {
		this.AttendanceList = AttendanceList;
	}
}
