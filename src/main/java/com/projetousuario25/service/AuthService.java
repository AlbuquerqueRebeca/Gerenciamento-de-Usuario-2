package com.projetousuario25.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.projetousuario25.dto.AcessDto;
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
			UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(authDto.getUsername(), authDto.getPassword()); 
			
			Authentication authentication = authenticationManager.authenticate(userAuth);
		 
		     UsuarioDetailsImpl userAuthenticate = (UsuarioDetailsImpl) authentication.getPrincipal();
		
		     String token = usuarioJwtUtils.generateTokenFromUserDetailsImpl(userAuthenticate);
		     
		     AcessDto acessDto = new AcessDto(token);
		     System.out.println("Autenticação bem sucedida!! " + authDto.getUsername()); 
		     
		         return acessDto;
		    
		        }catch(BadCredentialsException e) {
		        	
		        }
		
		           return new AcessDto("Acesso negado");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
