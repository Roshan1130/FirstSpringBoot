package com.homedepot.springboot.dtos;

public class StudentDto {
	
	private String name;
	private String level;
	private float gpa;
	
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CustomerDto [name=" + name + ", level=" + level + ", gpa=" + gpa + "]";
	}
	
	

}
