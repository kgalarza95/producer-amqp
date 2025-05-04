package com.kgalarza.producer.application.service;

import com.kgalarza.producer.application.exception.CustomerNotFOundException;
import com.kgalarza.producer.domain.model.Customer;
import com.kgalarza.producer.domain.port.in.ICustomerServicePort;
import com.kgalarza.producer.domain.port.out.ICustomerRepositoryPort;
import com.kgalarza.producer.domain.port.out.ILogBusMessagePort;

import java.util.List;

public class CustomerService implements ICustomerServicePort {

    private final ICustomerRepositoryPort customerRepository;
    private final ILogBusMessagePort logBusMessagePort;

    public CustomerService(ICustomerRepositoryPort customerRepository, ILogBusMessagePort logBusMessagePort) {
        this.customerRepository = customerRepository;
        this.logBusMessagePort = logBusMessagePort;
    }

    @Override
    public Customer getCustomerById(Long id) {
        logBusMessagePort.sendMessage("Fetching customer with ID: " + id);
        return customerRepository.getCustomerById(id)
                .orElseThrow(() -> new CustomerNotFOundException("Customer not found"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        logBusMessagePort.sendMessage("Fetching all customers");
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        logBusMessagePort.sendMessage("Saving customer: " + customer);
        return customerRepository.saveCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        logBusMessagePort.sendMessage("Updating customer: " + customer);
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        logBusMessagePort.sendMessage("Deleting customer with ID: " + id);
        customerRepository.deleteCustomer(id);
    }
}
