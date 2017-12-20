package com.lexicon.employeemanagement.dataaccess;

import java.util.List;

import javax.ejb.Local;

import com.lexicon.employeemanagement.domain.Employee;

@Local
public interface EmployeeDataAcess {
	public void insert(Employee employee);
	public List<Employee> findAll();
	public List<Employee>findBySurname(String surname);

}

