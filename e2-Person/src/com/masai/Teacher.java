package com.masai;

public class Teacher extends Student {
	int instructorId ;

	int salary ;

	@Override
	public String toString() {
		return "Teacher [instructorId=" + instructorId + ", salary=" + salary + "]";
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
