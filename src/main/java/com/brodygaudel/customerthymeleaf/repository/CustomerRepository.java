package com.brodygaudel.customerthymeleaf.repository;

import com.brodygaudel.customerthymeleaf.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
