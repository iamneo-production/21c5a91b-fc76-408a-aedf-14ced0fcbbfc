package com.houari.verification_service.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houari.verification_service.repository.CustomerRepository;
import com.houari.verification_service.dto.CustomerDto;
import com.houari.verification_service.entity.Customer;
import com.houari.verification_service.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public CustomerDto verifiyCustomer(CustomerDto customerDto) {
        
        Customer customer = customerDto.toEntity(Customer.class);
        customer.setRegisteredAt(new Date());
        customer.setStatus(1);


        return customerRepository.save(customer).toDto(CustomerDto.class);
    }
    
}
