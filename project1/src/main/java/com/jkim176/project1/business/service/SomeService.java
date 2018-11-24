package com.jkim176.project1.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkim176.project1.data.entity.Customer;
import com.jkim176.project1.data.entity.Manufacturer;
import com.jkim176.project1.data.entity.Product;
import com.jkim176.project1.data.repository.CustomerRepository;
import com.jkim176.project1.data.repository.ManufacturerRepository;
import com.jkim176.project1.data.repository.OrderLineRepository;
import com.jkim176.project1.data.repository.OrderRepository;
import com.jkim176.project1.data.repository.ProductRepository;

@Service
public class SomeService {

	private final CustomerRepository customerRepository;
	private final ManufacturerRepository manufacturerRepository;
	private final OrderRepository orderRepository;
	private final OrderLineRepository orderLineRepository;
	private final ProductRepository productRepository;
	
	@Autowired
	public SomeService(CustomerRepository customerRepository, ManufacturerRepository manufacturerRepository, OrderRepository orderRepository, OrderLineRepository orderLineRepository, ProductRepository productRepository) {
		this.customerRepository = customerRepository;
		this.manufacturerRepository = manufacturerRepository;
		this.orderRepository = orderRepository;
		this.orderLineRepository = orderLineRepository;
		this.productRepository = productRepository;
	}
	
	public Customer findCustomerById(long id) {
		Optional<Customer> optionalCustomer = this.customerRepository.findById(id);
		if(optionalCustomer.isPresent()) {
			Customer customer = optionalCustomer.get();
			return customer;
		}
		else {
			// temp
			Customer customer = new Customer();
			return customer;
		}
	}
	
	public List<Customer> findCustomerAll() {
		List<Customer> customers = new ArrayList<>();
		Iterable<Customer> it = this.customerRepository.findAll();
		it.forEach(customer -> {
			customers.add(customer);
		});
		return customers;
	}
	
	public Manufacturer findManufacturerById(long id) {
		Optional<Manufacturer> optionalManufacturer = this.manufacturerRepository.findById(id);
		if(optionalManufacturer.isPresent()) {
			Manufacturer manufacturer = optionalManufacturer.get();
			return manufacturer;
		}
		else {
			// temp
			Manufacturer manufacturer = new Manufacturer();
			return manufacturer;
		}
	}
	
	public List<Manufacturer> findManufacturerAll() {
		List<Manufacturer> manufacturers = new ArrayList<>();
		Iterable<Manufacturer> it = this.manufacturerRepository.findAll();
		it.forEach(manufacturer -> {
			manufacturers.add(manufacturer);
		});
		return manufacturers;
	}
	
	public Product findProductById(long id) {
		Optional<Product> optionalProduct = this.productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			Product product = optionalProduct.get();
			return product;
		}
		else {
			// temp
			Product product = new Product();
			return product;
		}
	}
	
	public List<Product> findProductAll() {
		List<Product> products = new ArrayList<>();
		Iterable<Product> it = this.productRepository.findAll();
		it.forEach(product -> {
			products.add(product);
		});
		return products;
	}
}
