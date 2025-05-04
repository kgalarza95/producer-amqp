package com.kgalarza.producer.domain.port.out;

import com.kgalarza.producer.domain.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerRepositoryPort {

    Optional<Customer> getCustomerById(Long id);

    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
