package com.greatlearning.model;

public class Employee {
// declare the first name , last name , department
	private String firstName;
	private String lastName;
	private String department;
	
// create a constructor (always define constructor as public)
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	
	public String getfirstname() {
		return firstName;
	}
	
	public void setfirstName(String firstname) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
// create getters and setters
	
	
}
