package com.houari.account_creation_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houari.account_creation_service.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
    Optional<Customer> findByEmail(String email);

}
