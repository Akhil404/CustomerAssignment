package com.akhil.customer.dal;

import org.springframework.data.repository.CrudRepository;

import com.akhil.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
}
