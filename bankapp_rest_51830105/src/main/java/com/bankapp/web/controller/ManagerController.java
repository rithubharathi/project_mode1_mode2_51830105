package com.bankapp.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.entities.Customer;
import com.bankapp.services.CustomerService;

@RestController
@RequestMapping(value="/apimanager")
public class ManagerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(path="/allcustomer",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return new ResponseEntity<List<Customer>>(customerService.findAll(),HttpStatus.OK);
	}
	@GetMapping(path="/getcustomer/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable(name="id") Long id){
		return new ResponseEntity<Optional<Customer>>(customerService.findById(id),HttpStatus.OK);
	}
	@PostMapping(path="/addcustomer",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getAddCustomer(@RequestBody Customer customer){
		customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.CREATED);
	}
	
	@PutMapping(path="/update",produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> postUpdate(@RequestBody Customer customer){
		customerService.updateCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}
	
	@DeleteMapping(path="/delete/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> delete(@PathVariable(name="id") Long id){
		customerService.deleteCustomer(id);
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}
}
