package com.projetousuario25.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.projetousuario25.security.jwt.AuthEntrypointJwt;
import com.projetousuario25.security.jwt.AuthFilterToken;

@Configuration
@EnableWebSecurity
public class UsuarioSecurityConfig{
	
	@Autowired
	private AuthEntrypointJwt unauthorizedHandler; 
	
	
	@Bean  
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager(); 
	}
	
	@Bean
	public AuthFilterToken authFilterToken() {
		return new AuthFilterToken();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) 
	
	
	
	
}