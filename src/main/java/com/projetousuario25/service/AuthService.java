package com.projetousuario25.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.projetousuario25.dto.AuthenticationDto;
import com.projetousuario25.security.jwt.UsuarioJwtUtils;

@Service
public class AuthService{
	
	@Autowired
	private AuthenticationManager authenticationManager; 
	
	@Autowired
	private UsuarioJwtUtils usuarioJwtUtils; 
	
	
	public AcessDto login(AuthenticationDto authDto) {
		
		try {
			UsernamePasswordAuthenticationToken userAuth = 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
