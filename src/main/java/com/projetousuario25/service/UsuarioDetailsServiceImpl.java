package com.projetousuario25.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.projetousuario25.entidade.Usuario;


public class UsuarioDetailsServiceImpl implements UserDetailsService{

	
	
	
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	     Usuario usuario = usuarioRepository.findByLogin(username) 
		 
	} 
	
	
	

}
