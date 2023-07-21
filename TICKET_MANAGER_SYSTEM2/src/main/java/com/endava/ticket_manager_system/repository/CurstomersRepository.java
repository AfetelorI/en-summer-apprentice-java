package com.endava.ticket_manager_system.repository;

import com.endava.ticket_manager_system.model.Customers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CurstomersRepository extends CrudRepository<Customers, Long> {
    List<Customers> findAll();

    Customers findByCustomerId(Long customerId);
    Customers findByCustomerName(String customerName);

    Customers findByEmail(String email);
}
