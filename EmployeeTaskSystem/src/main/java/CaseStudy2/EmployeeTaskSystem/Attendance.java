package CaseStudy2.EmployeeTaskSystem;

import java.util.Date;

public class Attendance {
	private int attendanceId;
	private Date attendanceDate;
	private Attendance_Types Status;
	
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attendance(Attendance_Types status) {
		super();
		Status = status;
	}

	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public Attendance_Types getStatus() {
		return Status;
	}

	public void setStatus(Attendance_Types status) {
		Status = status;
	}
	
}
