package com.houari.account_creation_service.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houari.account_creation_service.dto.CustomerDto;
import com.houari.account_creation_service.entity.Customer;
import com.houari.account_creation_service.repository.CustomerRepository;
import com.houari.account_creation_service.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		Customer customer = customerDto.toEntity(Customer.class);
        customer.setRegisteredAt(new Date());   
        customer.setStatus(3);

        return customerRepository.save(customer).toDto(CustomerDto.class);
	}

	@Override
	public List<CustomerDto> getCustomers() {
		
        return customerRepository.findAll()
        .stream()
        .map(customer -> customer.toDto(CustomerDto.class))
        .collect(Collectors.toList());
	}

	@Override
	public CustomerDto getCustomerByEmail(String email) {
		return customerRepository.findByEmail(email).orElse(null)
        .toDto(CustomerDto.class);
	}
    
}
