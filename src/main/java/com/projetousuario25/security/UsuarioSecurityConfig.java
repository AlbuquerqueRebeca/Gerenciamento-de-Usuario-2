package com.projetousuario25.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.projetousuario25.security.jwt.AuthEntrypointJwt;

@Configuration
@EnableWebSecurity
public class UsuarioSecurityConfig{
	
	@Autowired
	private AuthEntrypointJwt unauthorizedHandler; 
	
	
	@Bean  
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration)
	
	
	
	
	
	
}