package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import model.entities.Course;
import model.entities.Instructor;
import model.entities.UserStudent;

public class program {

	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Course> courses = new ArrayList<>();
		courses.add(new Course("A"));
		courses.add(new Course("B"));
		courses.add(new Course("C"));
		
		Instructor instructor = new Instructor("Alex", courses);
		int quantity;
		Set<UserStudent> students = new HashSet<>();
		
		for (Course course : courses) {
			System.out.print("How to many students for course " + course.getName() + "?");
			quantity = sc.nextInt();
			
			for (int i = 0; i < quantity; i++) {
				int id = sc.nextInt();
				students.add(new UserStudent(id));
				
			}
		}
		
		System.out.println("Instructor " + instructor.getName() + " total Students: " + students.size());
		sc.close();
	}
}
