package com.tyss.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	Optional<Customer> findByEmail(String email);
}
