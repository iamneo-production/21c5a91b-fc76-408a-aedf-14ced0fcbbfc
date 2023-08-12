package com.houari.verification_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.houari.verification_service.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
    Optional<Customer> findByEmail(String email);

}
