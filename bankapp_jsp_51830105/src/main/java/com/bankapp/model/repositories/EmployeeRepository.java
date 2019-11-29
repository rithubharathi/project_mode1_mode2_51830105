package com.bankapp.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.EmployeeDetails;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Long>{
	public EmployeeDetails findByEmployeeId(Integer employeeId);
	
}
