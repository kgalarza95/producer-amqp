package com.kgalarza.producer.infrastrucutre.adapter.in.mapper;


import com.kgalarza.producer.domain.model.Customer;
import com.kgalarza.producer.infrastrucutre.adapter.in.dto.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {

    CustomerDTO toDto(Customer customer);

    Customer toDomain(CustomerDTO customerDTO);

}
