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
import com.jkim176.project1.data.entity.Manufacturer;
import com.jkim176.project1.data.entity.Product;

@RestController
@RequestMapping(value="/api")
public class SomeServiceController {
	
	@Autowired
	private SomeService someService;
	
	@RequestMapping(method=RequestMethod.GET, value="/customer/{id}")
	public Customer getCustomerById(@PathVariable("id")long id) {
		return this.someService.findCustomerById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/customer/all")
	public List<Customer> getCustomerAll() {
		return this.someService.findCustomerAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/manufacturer/{id}")
	public Manufacturer getManufacturerById(@PathVariable("id")long id) {
		return this.someService.findManufacturerById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/manufacturer/all")
	public List<Manufacturer> getManufacturerAll() {
		return this.someService.findManufacturerAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/product/{id}")
	public Product getProductById(@PathVariable("id")long id) {
		return this.someService.findProductById(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/product/all")
	public List<Product> getProductAll() {
		return this.someService.findProductAll();
	}
}
