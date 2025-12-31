package com.tyss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tyss.model.Customer;
import com.tyss.repo.CustomerRepo;

@Service
public class CustomerService implements UserDetailsService {

	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Customer customer = customerRepo.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException(email));
		
		return User.builder()
				.username(customer.getEmail())
				.password(customer.getPassword())
				.build();
	}

}
