// the blueprint of Employee
package com.lexicon.employeemanagement.domain;

public class Employee implements java.io.Serializable{
	
	private String firstName;
	private String surName;
	private String jobRole;
	private int salary;
	
	public Employee(String firstName, String surName, String jobRole, int salary) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.jobRole = jobRole;
		this.salary = salary;
	}
	
	public String toString(){
		return "Employee : "+ this.firstName + " "+ this.surName;
		
	}

}
