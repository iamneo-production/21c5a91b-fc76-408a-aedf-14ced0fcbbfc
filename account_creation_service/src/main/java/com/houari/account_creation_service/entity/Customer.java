package com.houari.account_creation_service.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.houari.account_creation_service.utill.Transformer;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer implements Transformer{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String address;

    private String mobile;

    private String NIC;

    @Column(length = 1)
    private int status;

    @Column(name = "registered_at", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registeredAt; 
}
