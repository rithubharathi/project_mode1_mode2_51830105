package com.bankapp.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findAll();
	Customer findByName(String name);
    Customer findByEmail(String email);
    Account findByAccountAccountNumber(Long accountNumber);
}

