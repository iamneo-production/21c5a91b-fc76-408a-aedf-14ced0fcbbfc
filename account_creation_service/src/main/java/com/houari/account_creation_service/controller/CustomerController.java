package com.houari.account_creation_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.houari.account_creation_service.dto.CustomerDto;
import com.houari.account_creation_service.service.CustomerService;

@RestController
@RequestMapping("api/create-account")
public class CustomerController {
    

    @Autowired
    CustomerService customerService;


    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto) {
        System.out.println(customerDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.saveCustomer(customerDto));
    }


    @GetMapping("{email}")
    public ResponseEntity<CustomerDto> getCustomerByEmail(@PathVariable String email) {
        System.out.println(email);
        return ResponseEntity.ok(customerService.getCustomerByEmail(email));
    }
    
    @GetMapping()
    public ResponseEntity<List<CustomerDto>> getCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

}
