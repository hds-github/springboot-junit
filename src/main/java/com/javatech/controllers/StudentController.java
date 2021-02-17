package com.javatech.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.model.Student;

@RestController
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public Student getStudent() {
		Student student = new Student();
		student.setId("1001");
		student.setName("Divyansh");
		student.setStd("5th");
		student.setCity("Pune");
		return student;

	}

}
