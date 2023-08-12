package com.houari.account_creation_service.dto;

import com.houari.account_creation_service.utill.Transformer;

import lombok.Data;

@Data
public class CustomerDto implements Transformer{

    private int id;

    private String name;

    private String email;

    private String address;

    private String mobile;

    private String NIC;

    private int status;

    private String registeredAt; 

}