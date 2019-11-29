package com.bankapp.services;

import java.util.List;

import com.bankapp.model.entities.EmployeeDetails;

public interface EmployeeService {
	
	public List<EmployeeDetails> getAllEmployees();
	public EmployeeDetails findByEmployeeId(Integer employeeId);
	public void addEmployee(EmployeeDetails employeeDetails);
	public void updateEmployeeDetails(EmployeeDetails employeeDetails);
	public void deleteEmployee(Long id);
	public EmployeeDetails getEmployeerById(long id);

}
