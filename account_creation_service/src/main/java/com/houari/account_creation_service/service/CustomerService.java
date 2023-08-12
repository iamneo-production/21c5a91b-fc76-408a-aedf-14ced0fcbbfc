package com.houari.account_creation_service.service;

import java.util.List;

import com.houari.account_creation_service.dto.CustomerDto;

public interface CustomerService {
    
    CustomerDto saveCustomer(CustomerDto customerDto);

    List<CustomerDto> getCustomers();

    CustomerDto getCustomerByEmail(String email);

    

}
