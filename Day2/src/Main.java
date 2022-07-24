import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import business.StudentManager;
import model.Category;
import model.Course;
import model.Instructor;
import model.Student;
import model.User;

public class Main {

		public static void main(String[] args) {
			Category category = new Category(1, "Programlar");
			Instructor instructor = new Instructor(2, "Engin", "Demirog");
			Course course1 = new Course(3, "Java+React", category, instructor);
			Course course2 = new Course(4, "C#", category, instructor);
			Course course3 = new Course(5, "Javascript", category, instructor);
			Course course4 = new Course(6, "Programlamaya Giriş", category, instructor);
			User user = new User(7, "Gülsüm Kaya", "abc@gmail.com", "12345");
			Student student1 = new Student(1,"Seher", "Yalçın", course1);
			Student student2 = new Student(1,"Ayşe", "Yüksel", course2);
			
			CategoryManager categoryManager = new CategoryManager();
			InstructorManager instructorManager = new InstructorManager();
			CourseManager courseManager = new CourseManager();
			courseManager.add(course1);
			courseManager.add(course2);
			courseManager.add(course3);
			courseManager.add(course4);
			StudentManager studentManager = new StudentManager();
			studentManager.add(student1);
			studentManager.add(student2);
			
			List<Course> courses=courseManager.getAll();
		
			for(Course c:courses)
			{
				System.out.println(c.getCategory().getName()+ " "+c.getName()+" "+c.getInstructor().getFirstName()+" "+c.getInstructor().getLastName());
		}
		}
	}


