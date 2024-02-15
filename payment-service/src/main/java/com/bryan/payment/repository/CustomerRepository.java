package com.bryan.payment.repository;

import org.springframework.data.repository.CrudRepository;
import com.bryan.payment.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
