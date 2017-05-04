package com.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poc.model.Customer;
import com.poc.services.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/", method = RequestMethod.POST, 
			produces =MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> create(@RequestBody Customer customer) {
		Customer savedCustomer = customerService.createCustomer(customer);
		return new ResponseEntity<>(savedCustomer,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, 
			produces =MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> update(@RequestBody Customer customer) {
		Customer updatedCustomer = customerService.updateCustomer(customer);
		return new ResponseEntity<>(updatedCustomer,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.DELETE, 
			produces =MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity delete(@RequestBody Customer customer) {
		
		customerService.deleteCustomer(customer);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, 
			produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String id) {
		Customer searchedCustomer = customerService.getCustomerById(id);
		return new ResponseEntity<>(searchedCustomer,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, 
			produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> searchedCustomers = customerService.getCustomers();
		return new ResponseEntity<>(searchedCustomers,HttpStatus.OK);
	}
	
	
}
