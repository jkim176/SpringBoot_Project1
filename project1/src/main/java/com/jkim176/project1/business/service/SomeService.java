package com.jkim176.project1.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkim176.project1.data.repository.CustomerRepository;

@Service
public class SomeService {

	private final CustomerRepository customerRepository;
	
	@Autowired
	public SomeService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}
}
