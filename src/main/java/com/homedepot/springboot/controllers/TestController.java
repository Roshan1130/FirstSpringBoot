package com.homedepot.springboot.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homedepot.springboot.dtos.StudentDto;

@RestController
@RequestMapping("/test")
public class TestController {
	
	/*
	 * @Autowired private StudentService ss;
	 */
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String testUser(@RequestParam Integer a) {
		return "1st test";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public void setValue(@RequestBody StudentDto student) {
		System.out.println(student.toString());
	}
	
}
