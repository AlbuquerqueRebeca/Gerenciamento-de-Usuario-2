package com.projetousuario25.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.projetousuario25.entidade.Usuario;

public class UsuarioDetailsImpl implements UserDetails{ 
	
	
	private String email; 
	private String nome; 
	private String username;
	private String password; 
	
	
 
	public UsuarioDetailsImpl(String email, String nome, String username, String password,
	Collection<? extends GrantedAuthority> authorities) { 
	 
		super(); 
		this.email = email;
		this.nome = nome; 
		this.username = username; 
		this.password = password; 
		this.authorities = authorities; 
		
	}
	
	public static UsuarioDetailsImpl build(Usuario usuario) { 
		
		   return new UsuarioDetailsImpl(
				   usuario.getEmail(), 
				   usuario.getNome(), 
				   usuario.getLogin(), 
				   usuario.getSenha(), 
				   new ArrayList<>());  
		
	}
			
			
	
	
	
	
}


	

	
	
