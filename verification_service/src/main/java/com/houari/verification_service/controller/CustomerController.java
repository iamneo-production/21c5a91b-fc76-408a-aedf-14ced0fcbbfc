package com.houari.verification_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.houari.verification_service.dto.CustomerDto;
import com.houari.verification_service.service.CustomerService;

@RestController
@RequestMapping("api/verify-identity")
public class CustomerController {
    

    @Autowired
    CustomerService customerService;


    @PostMapping
    public ResponseEntity<CustomerDto> verifiyCustomer(@RequestBody CustomerDto customerDto) {
        System.out.println(customerDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.verifiyCustomer(customerDto));
    }
}
