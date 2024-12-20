package com.projetousuario25.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.repositorio.UsuarioRepository;

@Service 
public class UsuarioService{
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@Autowired 
	private UsuarioRepository usuarioRepository; 
	
	
	//Tratamento de exceçao
   public void registrandoUsuario(Usuario usuario) {  
	   String normalizedEmail = 
   }
   
	
	
}
