package com.jkim176.project1.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jkim176.project1.business.service.SomeService;
import com.jkim176.project1.data.entity.Customer;

@RestController
@RequestMapping(value="/api")
public class SomeServiceController {
	
	@Autowired
	private SomeService someService;
	
	@RequestMapping(method=RequestMethod.GET, value="/customer/{id}")
	public Customer getOneCustomerById(@PathVariable(value="id")long id) {
		Optional<Customer> optionalCustomer = this.someService.getCustomerRepository().findById(id);
		if(optionalCustomer != null) {
			Customer customer = optionalCustomer.get();
			return customer;
		}
		else {
			Customer customer = new Customer();
			return customer;
		}
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/customer/all")
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		
		Iterable<Customer> it = this.someService.getCustomerRepository().findAll();
		it.forEach(customer -> {
			customers.add(customer);
		});
		
		return customers;
	}
}
