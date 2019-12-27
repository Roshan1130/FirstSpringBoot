package com.homedepot.springboot.services;

import com.homedepot.springboot.dtos.StudentDto;

public class StudentService {
	
	public void display(StudentDto student) {
		System.out.println(student.toString());
	}

}
