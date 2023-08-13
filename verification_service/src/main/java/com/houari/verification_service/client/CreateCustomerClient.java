package com.houari.verification_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.houari.verification_service.dto.CustomerDto;

import feign.Headers;
import feign.RequestLine;

@FeignClient("account-creation-service")
public interface CreateCustomerClient {
    
    // @RequestLine("POST")
    // @Headers("Content-Type: application/json")
    // void create(CustomerDto customerDto);


    @RequestMapping(value = "api/create-account", method = RequestMethod.GET)
	List<CustomerDto> getCustomers();
}
