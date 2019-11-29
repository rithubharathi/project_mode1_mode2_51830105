package com.bankapp.services;

import java.util.List;
import java.util.Optional;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;

public interface CustomerService {
	List<Customer> findAll();
	Optional<Customer> findById(long id);
	Customer findByName(String name);
    Customer findByEmail(String email);
    Account findByAccountAccountNumber(Long accountNumber);
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);

}
