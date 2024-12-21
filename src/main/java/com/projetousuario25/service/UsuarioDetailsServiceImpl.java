package com.projetousuario25.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.repositorio.UsuarioRepository;


public class UsuarioDetailsServiceImpl implements UserDetailsService{

	
	  @Autowired 
	  private UsuarioRepository usuarioRepository;
	  
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	     Usuario usuario = usuarioRepository.findByLogin(username).get();
	      return UsuarioDetailsImpl.build(usuario);
		 
	} 
	
	
	

}
