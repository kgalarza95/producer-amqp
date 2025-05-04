package com.kgalarza.producer.infrastrucutre.adapter.out.persitence.mapper;


import com.kgalarza.producer.domain.model.Customer;
import com.kgalarza.producer.infrastrucutre.adapter.out.persitence.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerRepositoryMapper {

    Customer toDomain(CustomerEntity customerEntity);

    CustomerEntity toEntity(Customer customer);
}
