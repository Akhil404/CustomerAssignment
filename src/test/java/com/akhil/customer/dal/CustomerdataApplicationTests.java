package com.akhil.customer.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.akhil.customer.dal.entities.Customer;


@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testcreateCustomer() {
		
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("akm@udemy.com");
		customerRepository.save(customer);
		
	}

	@Test
	public void findCustomerById() {
		Optional<Customer> customerOptional = customerRepository.findById(1l);
		Customer customer;
		if(customerOptional.isPresent()) {
			customer = customerOptional.get();
			System.out.println(customer);
		}
		
	}
	
	@Test 
	public void testUpdateCustomer() {
		Optional<Customer> customerOptional = customerRepository.findById(1l);
		Customer customer;;
		if(customerOptional.isPresent()) {
			customer = customerOptional.get();
			customer.setEmail("mak@udemy.com");
			customerRepository.save(customer);
		}
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer customer = new Customer();
		customer.setId(1l);
		customerRepository.delete(customer);
	}

}
