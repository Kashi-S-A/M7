package com.tyss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurity {

	// In-memory
	@Bean
	public UserDetailsService getUserDetailsService() {
		
		UserDetails publicUser = User.builder()
							  .username("dinga")
							  .password(encoder().encode("dinga@123"))
							  .roles("PUBLIC")
							  .build();
		
		UserDetails user = User.builder()
				  .username("dingi")
				  .password(encoder().encode("dingi@123"))
				  .roles("USER")
				  .build();
		
		UserDetails admin = User.builder()
				  .username("manga")
				  .password(encoder().encode("manga@123"))
				  .roles("ADMIN")
				  .build();
		
		return new InMemoryUserDetailsManager(publicUser,user,admin);
	}
	
	// FilterChain
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.csrf( c -> c.disable())
				.authorizeHttpRequests(req -> req
						.requestMatchers("/public/**")
						.permitAll()
						.requestMatchers("/user/**")
						.hasAnyRole("USER","ADMIN")
						.requestMatchers("/admin/**")
						.hasRole("ADMIN")
						.anyRequest()
						.authenticated()
						)
				.formLogin(Customizer.withDefaults())
				.logout(Customizer.withDefaults());
		
		return http.build();
	}

	// passwordEncoder
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
