package com.projetousuario25.security.jwt;


import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.projetousuario25.service.UsuarioDetailsImpl;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component  
public class UsuarioJwtUtils{
	
	
	@Value("${projeto.jwtSecret}")
	private String jwtSecret; 
	
	
	@Value("${projeto.jwtExpirationMs}")
	private int jwtExpirationMs;  
	
	
	public String generateTokenFromUserDetailsImpl(UsuarioDetailsImpl userDetail) {
		 System.out.println("gerando token para usuario" + userDetail.getUsername());
		  return Jwts.builder().setSubject(userDetail.getUsername()) 
				               .setIssuedAt(new Date())
				               .signWith(getSigninKey(), SignatureAlgorithm.HS512).compact();
	}
	
	public Key  getSigninKey() { 
	SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
	 System.out.println("chave de assinatura gerada");
	   return key; 
	}
	
	public String getUsernameToken(String token) { 
		System.out.println("extraindo username do token" + token);
		return Jwts.parser().setSigningKey(getSigninKey())
			       .parseClaimsJws(token).getBody().getSubject(); 	
		}
	 
	    public boolean validateJwtToken(String authToken) { 
	    	try {
	    		 System.out.println("validando token" + authToken);
	    		  Jwts.parser().setSigningKey(getSigninKey()).parseClaimsJws(authToken);
	    		  return true;
	    	      }catch(MalformedJwtException e) {
	    	    	 System.out.println("Token inválido" + e.getMessage()); 
	    	      }catch(ExpiredJwtException e) { 
	    	    	 System.out.println("Token expirado" + e.getMessage());  
	    	      }catch(UnsupportedJwtException e) { 
	    	    	  System.out.println("Token não suportado" + e.getMessage()); 
	    	      }catch(IllegalArgumentException e) { 
	    	    	  System.out.println("Token argumento inválido" + e.getMessage()); 
	    	      }
	    	    	
	    	      return false; 
	    	
	    }
}