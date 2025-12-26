package com.tyss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurity {

	// security filters

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		 http.csrf(c -> c.disable())
		 		.authorizeHttpRequests(req -> req
		 				.requestMatchers("/register")
		 				.permitAll()
		 				.anyRequest()
		 				.authenticated()
		 		).formLogin(f -> f.successForwardUrl("/greet"))//POST
		 		;
		 		
		return http.build();
	}
}
