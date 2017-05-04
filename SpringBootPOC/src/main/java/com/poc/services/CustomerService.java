package com.poc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.dao.CustomerDao;
import com.poc.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public Customer createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
		return customer;
	}

	public Customer updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
		return customer;
	}

	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);

	}

	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	public Customer getCustomerById(String customerId) {
		return customerDao.getCustomerById(customerId);
	}

}
