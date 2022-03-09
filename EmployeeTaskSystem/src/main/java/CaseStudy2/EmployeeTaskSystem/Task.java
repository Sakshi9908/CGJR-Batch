package CaseStudy2.EmployeeTaskSystem;

import java.util.Date;

public class Task {
	private int taskId;
	private String taskName;
	private String taskDescription;
	private Date dateOfAllocation;
	private Date deadline;
	private Employee allocatedTo;
	
	public Task() {
		super();
	}

	public Task(Employee allocatedTo) {
		super();
		this.allocatedTo = allocatedTo;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Date getDateOfAllocation() {
		return dateOfAllocation;
	}

	public void setDateOfAllocation(Date dateOfAllocation) {
		this.dateOfAllocation = dateOfAllocation;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Employee getAllocatedTo() {
		return allocatedTo;
	}

	public void setAllocatedTo(Employee allocatedTo) {
		this.allocatedTo = allocatedTo;
	}
}
