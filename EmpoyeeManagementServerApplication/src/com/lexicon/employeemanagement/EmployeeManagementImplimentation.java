package com.lexicon.employeemanagement;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.lexicon.employeemanagement.dataaccess.EmployeeDataAcess;
import com.lexicon.employeemanagement.domain.Employee;
@Stateless
public class EmployeeManagementImplimentation implements
		EmployeeMangementService {

	@Inject
	private EmployeeDataAcess dao;// instead of (=new EmployeeDataAcess) we use Inject  
	

	@Override
	public void registerEmployee(Employee employee) {
		dao.insert(employee);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	@Override
	public List<Employee> searchBySurName(String surname) {
		
		return dao.findBySurname(surname);
	}

}
