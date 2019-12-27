package com.homedepot.springboot.mains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.homedepot.springboot.controllers", "com.homedepot.springboot.services"})
public class FirstSpringBootApp {

	public static void main(String[] args) {
		System.out.println("Inside the main application to show program run");
		SpringApplication.run(FirstSpringBootApp.class, args);
		
	}

}
