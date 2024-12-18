package com.projetousuario25.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  
public class UsuarioJwtUtils{
	
	
	@Value("${projeto.jwtSecret}")
	private String jwtSecret; 
	
	
	@Value("${projeto.jwtExpirationMs}")
	private int jwtExpirationMs;  
	
	
	
}