package CaseStudy2.EmployeeTaskSystem;

public class Employee_Rating {
	private Task task;
	private Rating rating;
	public Employee_Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_Rating(Task task, Rating rating) {
		super();
		this.task = task;
		this.rating = rating;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
}
