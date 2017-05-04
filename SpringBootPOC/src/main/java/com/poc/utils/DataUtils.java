package com.poc.utils;

import java.util.ArrayList;
import java.util.List;

import com.poc.model.Customer;

public class DataUtils {
	private static List<Customer> customers = new ArrayList<>();

	public static void storedCustomers(Customer customer) {
		customers.add(customer);
	}
	

	public static List<Customer> getCustomers() {
		return customers;
	}

}
