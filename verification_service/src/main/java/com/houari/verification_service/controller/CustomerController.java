package com.houari.verification_service.controller;

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

import com.houari.verification_service.client.CreateCustomerClient;
import com.houari.verification_service.dto.CustomerDto;
import com.houari.verification_service.service.CustomerService;

@RestController
@RequestMapping("api/verify-identity")
public class CustomerController {
    

    @Autowired
    CustomerService customerService;

    @Autowired
    CreateCustomerClient client;


    @PostMapping
    public ResponseEntity<CustomerDto> verifiyCustomer(@RequestBody CustomerDto customerDto) {
        System.out.println(customerDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.verifiyCustomer(customerDto));
    }


    @GetMapping("{email}")
    public ResponseEntity<CustomerDto> getCustomerVerificationByEmail(@PathVariable String email) {
        System.out.println(email);
        return ResponseEntity.ok(customerService.getCustomerVerificationByEmail(email));
    }


    @GetMapping("verify")
    public ResponseEntity<String> verifyCustomer(){
        System.out.println("verify customer called");
        List<CustomerDto> customers = client.getCustomers();
        System.out.println(customers.size() +"");
        return null;
    }
}
