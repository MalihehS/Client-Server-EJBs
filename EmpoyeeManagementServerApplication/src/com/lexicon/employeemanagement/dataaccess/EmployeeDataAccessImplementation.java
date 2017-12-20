package com.lexicon.employeemanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.lexicon.employeemanagement.domain.Employee;

@Stateless
public class EmployeeDataAccessImplementation implements EmployeeDataAcess {

	@Override
	public void insert(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> findAll() {
		Employee e1=new Employee("Max", "Blue", "Writer", 12000);
		Employee e2=new Employee("Maliheh", "Yellow", "Programmer", 50000);
		Employee e3=new Employee("Miriam","BLue","Manager",31200);
		
		List<Employee> employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		return employees;
		
	}

	@Override
	public List<Employee> findBySurname(String surname) {
		// TODO Auto-generated method stub
		return null;
	}

}
