package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/")
	public String getHome()
	{

		return "welcome to spring boot! its break time";
	}
	
	@GetMapping("/showstudents")
	public List<Student> showList()
	{
		return studentService.getStudents();
	}

}
