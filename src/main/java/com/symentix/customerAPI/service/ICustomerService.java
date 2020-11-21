package com.symentix.customerAPI.service;

import java.util.List;
import java.util.Optional;

import com.symentix.customerAPI.dto.Customer;

public interface ICustomerService {
	List<Customer> getAllCustomer();

	Optional<Customer> getCustomerById(int custId);

	void addCustomer(Customer cust);

	void updateCustomer(Customer cust, int custId);

	void deleteCustomer(int custId);
}
