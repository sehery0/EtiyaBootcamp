package business;

import java.util.ArrayList;
import java.util.List;

import model.Instructor;

public class InstructorManager {
	public List<Instructor> instructors;

	public InstructorManager() {
		instructors = new ArrayList<Instructor>();
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Eğitmen eklendi");
	}
	
	public List<Instructor> getAll(){
		return instructors;
	}
	
	

}
