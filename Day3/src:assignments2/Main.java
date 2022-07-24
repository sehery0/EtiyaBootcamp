import java.util.ArrayList;

import business.UserManager;
import model.Instructor;
import model.Student;
import model.User;

public class Main {

	public static void main(String[] args) {
		User instructor1 = new Instructor(1, "Engin", "Demiroğ", 
				"engin@gmail.com", "12345", new ArrayList<>());
		
		User student1 = new Student(2, "Seher", "Yalcin", 
				"seher@gmail.com", "98765", 95, new ArrayList<String>());

		User student2 = new Student(3, "Ayşe", "Yılmaz", 
				"ayse@gmail.com", "11111", 80, new ArrayList<String>());
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.add(student1);
		userManager.add(student2);
		
		userManager.delete(student2);
	}

}
