package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

	private String name;
	private List<Course> courses = new ArrayList<>();
	
	public Instructor(String name, List<Course> courses) {
		this.name = name;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	
	
}
