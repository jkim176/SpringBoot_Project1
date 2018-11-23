package com.jkim176.project1.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jkim176.project1.data.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
