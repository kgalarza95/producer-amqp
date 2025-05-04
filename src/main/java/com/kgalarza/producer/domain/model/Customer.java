package com.kgalarza.producer.domain.model;

import lombok.Data;

@Data
public class Customer {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;


}
