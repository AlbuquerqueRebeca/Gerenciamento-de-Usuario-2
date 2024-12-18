package com.projetousuario25.security.jwt;


import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.projetousuario25.service.UsuarioDetailsImpl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component  
public class UsuarioJwtUtils{
	
	
	@Value("${projeto.jwtSecret}")
	private String jwtSecret; 
	
	
	@Value("${projeto.jwtExpirationMs}")
	private int jwtExpirationMs;  
	
	
	public String generateTokenFromUserDetailsImpl(UsuarioDetailsImpl userDetail) {
		
		  return Jwts.builder().setSubject(userDetail.getUsername()) 
				               .setIssuedAt(new Date())
				               .signWith(getSigninkey(), SignatureAlgorithm.HS512).compact();
	}
	
	public Key  getSigninKey() { 
		
	}
	
	
}