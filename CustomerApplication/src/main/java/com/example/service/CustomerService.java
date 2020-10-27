package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

public class CustomerService {

@Autowired
private CustomerRepository customerRepository;
	public String saveAll(Customer customer) {
		Customer save = customerRepository.save(customer);
		return save!=null?"Succesfully Inserted":"Object is Null";
	}

}
