// interface of different method
package com.lexicon.employeemanagement;

import java.util.List;

import javax.ejb.Remote;

import com.lexicon.employeemanagement.domain.Employee;

@Remote
public interface EmployeeMangementService {
	
	
	
	public void registerEmployee (Employee employee);
	public List<Employee> getAllEmployees();
	public List<Employee> searchBySurName(String surname);

}
