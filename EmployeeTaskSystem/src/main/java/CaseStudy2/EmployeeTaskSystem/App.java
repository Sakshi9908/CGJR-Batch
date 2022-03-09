package CaseStudy2.EmployeeTaskSystem;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");

		System.out.println("=================================================================================");

		Employee employee = context.getBean("employee", Employee.class);
		System.out.println("Employee Id          : " + employee.getEmployeeId());
		System.out.println("Employee Name        : " + employee.getEmployeeName());
		System.out.println("Employee Department  : " + employee.getDepartment());
		System.out.println("Employee Designation : " + employee.getDesignation());
		System.out.println("Employee Password    : " + employee.getPassword());
		System.out.println("Superior             : " + employee.getSuperior().getEmployeeId());
		System.out.println("Employee Rating      : " + employee.getRating());
		System.out.println("=================================================================================");
		List<Task> tasklist = employee.getTaskList();
		for (Task t : tasklist) {
			System.out.println("---------------------------------- TASK ----------------------------------------");
			System.out.println("Task Id              : " + t.getTaskId());
			System.out.println("Task Name            : " + t.getTaskName());
			System.out.println("Task Description     : " + t.getTaskDescription());
			System.out.println("Allocation Date      : " + t.getDateOfAllocation());
			System.out.println("Deadline             : " + t.getDeadline());
			System.out.println("Allocated To         : " + t.getAllocatedTo().getEmployeeName());
		}
		System.out.println("=================================================================================");

		List<Attendance> attendance = employee.getAttendanceList();
		for (Attendance a : attendance) {
			System.out.println("------------------------------- ATTENDANCE ---------------------------------");
			System.out.println("Attendance Id    : " + a.getAttendanceId());
			System.out.println("Attendance Date  : " + a.getAttendanceDate());
			System.out.println("Attendance Status: " + a.getStatus());
		}
		System.out.println("=================================================================================");

	}
}
