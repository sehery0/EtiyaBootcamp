package model;

import java.util.List;

public class Instructor extends User {
	private List<String> givenCourses;
	
	
	public Instructor() {
	}


	public Instructor(int id, String firstName, String lastName, String email,
	String password, List<String> givenCourses) {
		super(id, firstName, lastName, email, password);
		this.givenCourses = givenCourses;
	}


	public List<String> getGivenCourses() {
		return givenCourses;
	}


	public void setGivenCourses(List<String> givenCourses) {
		this.givenCourses = givenCourses;
	}

	
	
	
}
