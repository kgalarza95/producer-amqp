package com.kgalarza.producer.infrastrucutre.adapter.out.persitence.repository;

import com.kgalarza.producer.infrastrucutre.adapter.out.persitence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
