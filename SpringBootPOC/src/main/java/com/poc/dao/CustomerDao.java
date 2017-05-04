package com.poc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.poc.model.Customer;
import com.poc.utils.DataUtils;

@Repository
public class CustomerDao {

	public Customer createCustomer(Customer customer){
		DataUtils.storedCustomers(customer);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer){
		List<Customer> existingCustomers = DataUtils.getCustomers();
		
		for (Customer customerE : existingCustomers) {
			if(customerE.getCustomerId().equalsIgnoreCase(customer.getCustomerId())){
				customerE.setName(customer.getName());
				customerE.setAddress(customer.getAddress());
			}
		}
		return customer;
	}
	
	public void deleteCustomer(Customer customer){
		DataUtils.getCustomers().remove(customer);
	}
	
	public List<Customer> getCustomers(){
		return DataUtils.getCustomers();
	}
	
	public Customer getCustomerById(String customerId){
		List<Customer> existingCustomers = DataUtils.getCustomers();
		Customer searchedCustomer = null;
		for (Customer customerG : existingCustomers) {
			if(customerG.getCustomerId().equalsIgnoreCase(customerId)){
				searchedCustomer = customerG;
			}
			
		}
		return searchedCustomer;
	}
}
