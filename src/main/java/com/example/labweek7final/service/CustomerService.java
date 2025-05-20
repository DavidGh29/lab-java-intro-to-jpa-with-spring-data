package com.example.labweek7final.service;

import com.example.labweek7final.model.Customer;
import com.example.labweek7final.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public List<Customer> getByStatus(String status) {
        return repository.findByStatus();
    }

    public List<Customer> getHighMileageCustomers(int miles) {
        return repository.findByTotalMilesGreaterThan(miles);
    }
}
