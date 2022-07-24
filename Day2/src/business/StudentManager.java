package business;

import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentManager {
	public List<Student> students;

	public StudentManager() {
		students = new ArrayList<Student>();
	}
	
	public void add(Student student) {
		students.add(student);
		System.out.println("Öğrenci eklendi");
	}

	public List<Student> getAll(){
		return students;
	}
	
}
