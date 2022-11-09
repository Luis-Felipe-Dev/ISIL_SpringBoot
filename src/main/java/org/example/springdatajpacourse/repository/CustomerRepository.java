package org.example.springdatajpacourse.repository;

import org.example.springdatajpacourse.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomerByName(String name);

    Customer findCustomerByEmail(String email);


}
