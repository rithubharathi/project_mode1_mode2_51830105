package com.bankapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.repositories.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public List<Customer> findAll() {
		List<Customer> customers=customerRepo.findAll();
		return customers;
	}
	
	@Override
	public Optional<Customer> findById(long id) {
		return customerRepo.findById(id);
	}
	
	@Override
	public Customer findByName(String name) {
		return null;
	}

	@Override
	public Customer findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findByAccountAccountNumber(Long accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepo.deleteById(id);
		
	}


	

	

}
