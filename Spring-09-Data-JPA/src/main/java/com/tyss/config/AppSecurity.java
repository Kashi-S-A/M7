package com.tyss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurity {

	//Security filter
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.csrf( c -> c.disable())
				.authorizeHttpRequests( req -> req
						.requestMatchers("/help","/register","/login")
						.permitAll()
						.anyRequest()
						.authenticated());
		
		return http.build();
	}
	
	//authentication manager
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) {
		return config.getAuthenticationManager();
	}
	
	//password encoder
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
}
