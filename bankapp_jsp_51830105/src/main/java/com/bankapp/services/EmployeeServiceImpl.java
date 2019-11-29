package com.bankapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.EmployeeDetails;
import com.bankapp.model.repositories.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public EmployeeDetails findByEmployeeId(Integer employeeId) {
		EmployeeDetails emp=empRepo.findByEmployeeId(employeeId);
		return emp;
	}

	@Override
	public void addEmployee(EmployeeDetails employeeDetails) {
		empRepo.save(employeeDetails);
		
	}

	@Override
	public void updateEmployeeDetails(EmployeeDetails employeeDetails) {
		empRepo.save(employeeDetails);
		
	}

	@Override
	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);
		
	}

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		List<EmployeeDetails> details= (List<EmployeeDetails>) empRepo.findAll();
		return details;
	}

	@Override
	public EmployeeDetails getEmployeerById(long id) {
		Optional<EmployeeDetails> emp=empRepo.findById(id);
		return null;
	}

}
