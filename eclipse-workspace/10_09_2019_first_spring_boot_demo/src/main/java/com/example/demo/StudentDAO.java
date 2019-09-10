package com.example.demo;

import java.util.List;

public interface StudentDAO {
	
	public Student createNewStudent(Student theStudent);
	
	public List<Student> getStudents();

}
