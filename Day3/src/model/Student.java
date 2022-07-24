package model;

import java.util.List;

public class Student extends User {
	private int completed;
	private List<String> myCourses;
	
	
	public Student() {
	}


	public Student(int id, String firstName, String lastName, String email, String password, 
			int completed, List<String> myCourses) {
		super(id, firstName, lastName, email, password);
		this.completed = completed;
		this.myCourses = myCourses;
	}


	public int getCompleted() {
		return completed;
	}


	public void setCompleted(int completed) {
		this.completed = completed;
	}


	public List<String> getMyCourses() {
		return myCourses;
	}


	public void setMyCourses(List<String> myCourses) {
		this.myCourses = myCourses;
	}
	
	
	

}
