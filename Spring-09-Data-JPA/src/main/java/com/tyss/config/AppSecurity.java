package com.tyss.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.tyss.filters.AppFilter;

@Configuration
@EnableWebSecurity
public class AppSecurity {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private AppFilter appFilter;

	//Security filter
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) {
		
		http.csrf( c -> c.disable())
				.authorizeHttpRequests( req -> req
						.requestMatchers("/help","/register","/login")
						.permitAll()
						.anyRequest()
						.authenticated())
						.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))//protocal stateless
						.authenticationProvider(getProvider())//auth provider
						.addFilterBefore(appFilter, UsernamePasswordAuthenticationFilter.class);//add appfilter
		
		return http.build();
	}
	
	@Bean
	public AuthenticationProvider getProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
		provider.setPasswordEncoder(encoder());
		return provider;
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
