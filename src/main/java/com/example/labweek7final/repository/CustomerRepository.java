package com.example.labweek7final.repository;

import com.example.labweek7final.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByStatus();
    List<Customer> findByTotalMilesGreaterThan(Integer miles);
}
