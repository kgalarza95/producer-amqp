package com.kgalarza.producer.infrastrucutre.adapter.in.dto;

import lombok.Data;

@Data
public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;

}
