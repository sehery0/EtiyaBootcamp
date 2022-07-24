package business;

import java.util.ArrayList;
import java.util.List;

import model.Course;

public class CourseManager {
	private List<Course> courses;
	
	public CourseManager() {
		courses = new ArrayList<Course>();
	}
	
	public void add(Course course) {
		courses.add(course);
		System.out.println("Kurs eklendi");
	}
	
	public List<Course> getAll(){
		return courses;
	}
	
	
	
	

}
